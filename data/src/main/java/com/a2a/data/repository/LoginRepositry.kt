package com.a2a.data.repository

import com.a2a.data.constants.Constants
import com.a2a.data.datasource.RemoteDataSource
import com.a2a.data.extentions.formatToViewTimeStamp
import com.a2a.data.model.common.A2ARequest
import com.a2a.data.model.common.BaseRequestModel
import com.a2a.data.model.login.LoginPostData
import com.a2a.data.model.lookup.LookupPostData
import com.a2a.network.Resource
import java.util.*
import javax.inject.Inject

class LoginRepositry @Inject constructor(
    private val remoteDataSource: RemoteDataSource
) : BaseRepository() {

    suspend fun <T> doLogin(Mpassword: String, MCustMnemonic: String): Resource<T>? {
        val loginPostData = LoginPostData()
        loginPostData.apply {
            body.custProfile.custMnemonic = MCustMnemonic ?: ""
            body.custProfile.pWD = Mpassword ?: ""
            body.authenticate.pIN="48966"
            body.authenticate.uTR="0000"
        }
        val postData =
            BaseRequestModel(A2ARequest(loginPostData.body, srvID = "Login", serviceIDValue = 3287))
        return safeApiCall(postData) { remoteDataSource.baseRequest(postData) }
    }
}