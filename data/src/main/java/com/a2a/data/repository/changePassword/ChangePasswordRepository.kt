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

        val body = ChangePasswordPostData()

        body.apply {
            custID = MemoryCacheImpl.getCustProfile()?.custID ?: ""
            this.password = password
            this.passwordOld = oldPassword
        }

        val postData = BaseRequestModel(
            A2ARequest(
                body,
                srvID = "ChgPwd"
            )
        )
        return safeApiCall(postData) {
            remoteDataSource.baseRequest(postData)
        }
    }
}

