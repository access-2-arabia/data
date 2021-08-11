package com.a2a.data.repository

import com.a2a.data.datasource.MemoryCacheImpl
import com.a2a.data.datasource.RemoteDataSource
import com.a2a.data.model.authentication.*
import com.a2a.data.model.common.A2ARequest
import com.a2a.data.model.common.BaseRequest
import com.a2a.data.utility.SrvID
import com.a2a.network.Resource
import javax.inject.Inject


class AuthenticationRepository @Inject constructor(
    private val remoteDataSource: RemoteDataSource
) : BaseRepository() {


    suspend fun <T> doLogin(
        password: String,
        customerId: String
    ): Resource<T> {
        val postData = LoginPostData()
        postData.a2ARequest.apply {
            body.custProfile.pWD = password
            body.custProfile.custMnemonic = customerId
            header.srvID = SrvID.LOGIN
        }
        return safeApiCall(postData) { remoteDataSource.baseRequest(postData) }
    }

    suspend fun <T> doLogout(): Resource<T> {
        val postData = LogoutPostData()
        postData.apply {
            custProfile = MemoryCacheImpl.getCustProfile() ?: CustProfile()
        }
        val request = BaseRequest(A2ARequest(srvId = SrvID.LOGOUT, body = postData))
        return safeApiCall(request) { remoteDataSource.baseRequest(request) }
    }

    suspend fun <T> changePassword(oldPassword: String, newPassword: String): Resource<T> {
        val cust = MemoryCacheImpl.getCustProfile()
        val postData = ChangePasswordPostData()
        postData.apply {
            custProfile.cID = cust?.cID ?: 0
            custProfile.custID = cust?.custID ?: ""
            custProfile.passwordOld = oldPassword
            custProfile.password = newPassword
        }
        val request = BaseRequest(A2ARequest(srvId = SrvID.CHANGE_PASSWORD, body = postData))
        return safeApiCall(request) { remoteDataSource.baseRequest(request) }
    }

    suspend fun <T> forgetPassword(id: String, nationalId: String, mobile: String): Resource<T> {
        val postData = ForgetPasswordPostData().apply {
            custProfile?.apply {
                custID = id
                nationalID = nationalId
                mobileNumber = mobile
            }
        }
        val request = BaseRequest(A2ARequest(srvId = SrvID.FORGET_PASSWORD, body = postData))
        return safeApiCall(request) { remoteDataSource.baseRequest(request) }
    }
}

