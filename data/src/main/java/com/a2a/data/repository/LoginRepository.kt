package com.a2a.data.repository

import com.a2a.data.datasource.RemoteDataSource
import com.a2a.data.model.common.A2ARequest
import com.a2a.data.model.common.BaseRequestModel
import com.a2a.data.model.login.LoginPostData
import com.a2a.network.Resource
import javax.inject.Inject

class LoginRepository @Inject constructor(
    private val remoteDataSource: RemoteDataSource
) : BaseRepository() {

    suspend fun <T> doLogin(Mpassword: String?, MCustMnemonic: String? , isBiometric:Boolean): Resource<T>? {
        val loginPostData = LoginPostData()
        loginPostData.apply {
            body.custProfile.custMnemonic = MCustMnemonic ?: ""
            body.custProfile.lWTD = isBiometric
            body.custProfile.pWD = Mpassword ?: ""
            body.authenticate.pIN = "0000"
            body.authenticate.uTR = "48966"
        }
        val postData =
            BaseRequestModel(A2ARequest(loginPostData.body, srvID = "Login", serviceIDValue = 3287))
        return safeApiCall(postData) {
            remoteDataSource.baseRequest(postData)
        }
    }
}