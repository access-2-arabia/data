package com.a2a.data.repository.cliq

import MemoryCacheImpl
import com.a2a.data.datasource.RemoteDataSource
import com.a2a.data.model.cliq.GetCustomerPostData
import com.a2a.data.model.common.A2ARequest
import com.a2a.data.model.common.BaseRequestModel
import com.a2a.data.repository.BaseRepository
import com.a2a.network.Resource
import javax.inject.Inject

class CliQRepository @Inject constructor(
    private val remoteDataSource: RemoteDataSource
) : BaseRepository() {

    suspend fun <T> getCustomer(): Resource<T> {

        val body = GetCustomerPostData()

        body.apply {
            custID = MemoryCacheImpl.getCustProfile()?.custID ?: ""
            uValue = MemoryCacheImpl.getCustProfile()?.docNo ?: ""
            uType = "NID"
            requestType = "GetCust"

        }

        val postData = BaseRequestModel(
            A2ARequest(
                body,
                srvID = "ICLIQ"
            )
        )
        return safeApiCall(postData) {
            remoteDataSource.baseRequest(postData)
        }
    }
}

