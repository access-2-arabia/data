package com.a2a.data.repository

import com.a2a.data.datasource.RemoteDataSource
import com.a2a.data.model.authentication.LoginPostData
import com.a2a.network.Resource
import javax.inject.Inject


class AuthenticationRepository @Inject constructor(
    private val remoteDataSource: RemoteDataSource
) : BaseRepository() {


    suspend fun <T> doLogin(
        password: String,
        customerId: String,
        isBaimoitric: Boolean,
    ): Resource<T> {
        val postData = LoginPostData()

        postData.a2ARequest.apply {

            if (!isBaimoitric) {
                body.custProfile.pWD = password
                body.custProfile.custMnemonic = customerId
            } else {
                body.custProfile.pWD = null
                body.custProfile.custMnemonic = null
            }
            body.custProfile.lWTD = isBaimoitric
            header.srvID = "Login"


        }
        return safeApiCall(postData) { remoteDataSource.baseRequest(postData) }
    }


}

