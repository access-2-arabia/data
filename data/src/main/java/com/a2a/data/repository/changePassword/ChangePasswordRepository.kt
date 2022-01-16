package com.a2a.data.repository.changePassword

import com.a2a.data.datasource.MemoryCache
import com.a2a.data.datasource.RemoteDataSource
import com.a2a.data.model.changePassword.ChangePasswordPostData
import com.a2a.data.model.common.A2ARequest
import com.a2a.data.model.common.BaseRequestModel
import com.a2a.data.repository.BaseRepository
import com.a2a.network.Resource
import javax.inject.Inject

class ChangePasswordRepository @Inject constructor(
    private val remoteDataSource: RemoteDataSource
) : BaseRepository() {

    suspend fun <T> changePassword(
        password: String,
        oldPassword: String
    ): Resource<T> {

        val postData = ChangePasswordPostData()

        postData.body.custProfile.custID = MemoryCacheImpl.getCustProfile()?.custID ?: ""
        postData.body.custProfile.password = password
        postData.body.custProfile.passwordOld = oldPassword


        val postDataRequest = BaseRequestModel(
            A2ARequest(
                postData.body,
                srvID = "ChgPwd"
            )
        )
        return safeApiCall(postDataRequest) {
            remoteDataSource.baseRequest(postDataRequest)
        }
    }
}

