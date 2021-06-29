package com.a2a.data.repository

import MemoryCacheImpl
import com.a2a.data.datasource.RemoteDataSource
import com.a2a.data.model.authentication.LoginPostData
import com.a2a.data.model.common.CustomerProfilePostData
import com.a2a.network.Resource
import javax.inject.Inject


class AuthenticationRepository @Inject constructor(
    private val remoteDataSource: RemoteDataSource
) : BaseRepository() {


    suspend fun <T> doLogin(
        password: String,
        customerId: String,
        isBiometric: Boolean,
    ): Resource<T> {
        val postData = LoginPostData()

        postData.a2ARequest.apply {

            if (!isBiometric) {
                body.custProfile.pWD = password
                body.custProfile.custMnemonic = customerId
            } else {
                body.custProfile.pWD = null
                body.custProfile.custMnemonic = null
            }
            body.custProfile.lWTD = isBiometric
            header.srvID = "Login"


        }
        return safeApiCall(postData) { remoteDataSource.baseRequest(postData) }
    }

    suspend fun <T> forgotPassword(
        customerId: String,
        mobileNumber: String,
        docNumber: String
    ): Resource<T> {
        val postData = CustomerProfilePostData()

        postData.a2ARequest.body.custProfile.apply {
            custMnemonic = customerId
            mobNo = mobileNumber
            docNo = docNumber
            postData.a2ARequest.header.srvID = "ForgotPWD"
        }
        return safeApiCall(postData) { remoteDataSource.baseRequest(postData) }
    }

    suspend fun <T> changePassword(
        newPassword: String
    ): Resource<T> {
        val postData = CustomerProfilePostData()

        postData.a2ARequest.apply {
            body.custProfile = MemoryCacheImpl.getCustProfile()!!
            body.custProfile.password = newPassword
            header.srvID = "ChgPwd"
        }
        return safeApiCall(postData) { remoteDataSource.baseRequest(postData) }
    }


}

