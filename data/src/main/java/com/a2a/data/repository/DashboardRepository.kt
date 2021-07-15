package com.a2a.data.repository

import MemoryCacheImpl
import com.a2a.data.datasource.RemoteDataSource
import com.a2a.data.model.common.A2ARequest
import com.a2a.data.model.common.BaseRequest
import com.a2a.data.model.dashboard.DashboardPostData
import com.a2a.network.Resource
import com.a2a.network.model.CustProfile
import javax.inject.Inject


class DashboardRepository @Inject constructor(
    private val remoteDataSource: RemoteDataSource
) : BaseRepository() {


    suspend fun <T> getDashboard(): Resource<T> {
        val postData = DashboardPostData()
        postData.custProfile = MemoryCacheImpl.getCustProfile()?: CustProfile()
        val request = BaseRequest(A2ARequest(postData, srvId = "Dashboard"))
        return safeApiCall(request) {
            remoteDataSource.baseRequest(request)
        }
    }

    suspend fun <T> logoutUser(): Resource<T> {
        val postData = DashboardPostData()
        postData.custProfile = MemoryCacheImpl.getCustProfile()?: CustProfile()

        val request = BaseRequest(A2ARequest(postData, srvId = "Logout"))
        return safeApiCall(request) {
            remoteDataSource.baseRequest(request)
        }
    }

}
