package com.a2a.data.repository

import com.a2a.data.datasource.RemoteDataSource
import com.a2a.data.model.authentication.CheckVersionPostData
import com.a2a.data.model.common.A2ARequest
import com.a2a.data.model.common.BaseRequest
import com.a2a.data.utility.SrvID
import com.a2a.network.Resource
import javax.inject.Inject

class DeviceRepository @Inject constructor(private val remoteDataSource: RemoteDataSource) :
    BaseRepository() {

    suspend fun <T> checkAppVer(version: String): Resource<T> {
        val postData = CheckVersionPostData(version)
        val request = BaseRequest(A2ARequest(srvId = SrvID.CHANNEL_CONFIGURATION, body = postData))
        return safeApiCall(request) { remoteDataSource.baseRequest(request) }
    }
}