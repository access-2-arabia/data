package com.a2a.data.repository.lookup

import com.a2a.data.datasource.RemoteDataSource
import com.a2a.data.model.common.A2ARequest
import com.a2a.data.model.common.BaseRequestModel
import com.a2a.data.model.lookup.LookPostData
import com.a2a.data.model.lookup.LookupPostData


import com.a2a.data.repository.BaseRepository
import com.a2a.network.Resource
import javax.inject.Inject

class LookUpRepository @Inject constructor(
    private val remoteDataSource: RemoteDataSource
) : BaseRepository() {


    suspend fun <T> getLookUp(
        LookUpName: String,
    ): Resource<T>? {
        val body = LookPostData()
        body.apply {
            lookUpName = LookUpName
        }
        val postData = BaseRequestModel(
            A2ARequest(
                body,
                srvID = "GetLookUp",
                serviceIDValue = 0
            )
        )
        return safeApiCall(postData) {
            remoteDataSource.baseRequest(postData)

        }
    }

    suspend fun <T> getLookUp(
        LookUpName: String,
        latitude: String,
        longitude: String

    ): Resource<T>? {
        val body = LookupPostData()
        body.apply {
            lookUpName = LookUpName
            locX = latitude
            locY = longitude
        }
        val postData = BaseRequestModel(
            A2ARequest(
                body,
                srvID = "GetLookUp",
                serviceIDValue = 0
            )
        )
        return safeApiCall(postData) {
            remoteDataSource.baseRequest(postData)

        }
    }

}