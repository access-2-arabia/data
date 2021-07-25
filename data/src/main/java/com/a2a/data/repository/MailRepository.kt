package com.a2a.data.repository

import MemoryCacheImpl
import com.a2a.data.datasource.RemoteDataSource
import com.a2a.data.model.authentication.MailPostData
import com.a2a.data.model.common.A2ARequest
import com.a2a.data.model.common.BaseRequest
import com.a2a.network.Resource
import com.a2a.network.model.CustProfile
import javax.inject.Inject


class MailRepository @Inject constructor(
    private val remoteDataSource: RemoteDataSource
) : BaseRepository() {


    suspend fun <T> getMails(): Resource<T> {
        val postData = MailPostData()
        postData.apply {
            custProfile = MemoryCacheImpl.getCustProfile() ?: CustProfile()
        }
        val request = BaseRequest(A2ARequest(srvId = "MailUtils", body = postData))
        return safeApiCall(request) { remoteDataSource.baseRequest(request) }
    }
}

