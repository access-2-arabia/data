package com.a2a.data.repository

import com.a2a.data.datasource.RemoteDataSource
import com.a2a.data.model.LookUpPostData
import com.a2a.data.utility.SrvID
import com.a2a.network.Resource
import javax.inject.Inject

class LookUpsRepository @Inject constructor(private val remoteDataSource: RemoteDataSource) :
    BaseRepository() {

    suspend fun <T> getLookUps(name: String, locX: Double = 0.0, locY: Double = 0.0): Resource<T> {
        val postData = LookUpPostData()
        postData.apply {
            a2ARequest.body.apply {
                this.lookUpName = name
                this.locX = locX
                this.locY = locY
            }
            a2ARequest.header.srvID = SrvID.GET_LOOK_UP
        }
        return safeApiCall(postData) { remoteDataSource.baseRequest(postData) }
    }
}