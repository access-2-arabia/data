package com.a2a.data.repository

import MemoryCacheImpl
import com.a2a.data.datasource.RemoteDataSource
import com.a2a.data.model.authentication.LoginPostData
import com.a2a.data.model.common.A2ARequest
import com.a2a.data.model.common.BaseRequest
import com.a2a.network.Resource
import com.a2a.network.model.CustProfile
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
        val postData = CustProfile()

        postData.apply {
            custMnemonic = customerId
            this.mobileNumber = mobileNumber
            docNo = docNumber

        }
        val request = BaseRequest(
            A2ARequest(
                postData,
                srvId = "ForgotPWD"
            )
        )
        return safeApiCall(request) {
            remoteDataSource.baseRequest(request)
        }
    }

    suspend fun <T> changePassword(
        newPassword: String
    ): Resource<T> {

        val postData = MemoryCacheImpl.getCustProfile()
        //TODO added password on network layer
//        postData?.password = newPassword
        val request = BaseRequest(
            A2ARequest(
                postData,
                srvId = "ChgPwd"
            )
        )
        return safeApiCall(request) {
            remoteDataSource.baseRequest(request)
        }
    }


}

