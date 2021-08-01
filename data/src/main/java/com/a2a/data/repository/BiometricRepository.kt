package com.a2a.data.repository

import MemoryCacheImpl
import com.a2a.data.datasource.RemoteDataSource
import com.a2a.data.model.BiometricPostData
import com.a2a.data.model.common.A2ARequest
import com.a2a.data.model.common.BaseRequestModel
import com.a2a.network.Resource
import javax.inject.Inject

class BiometricRepository @Inject constructor(
    private val remoteDataSource: RemoteDataSource
) : BaseRepository() {

    suspend fun <T> enableBiometric(
        isEnabled: Boolean
    ): Resource<T> {
        val biometricPostData = BiometricPostData()
        biometricPostData.apply {
            body.custProfile = MemoryCacheImpl.getCustProfile()!!
            body.custProfile.lWTD = isEnabled
        }
        val postData =
            BaseRequestModel(
                A2ARequest(
                    biometricPostData.body,
                    srvID = "CheckCustWithTouchID",
                    serviceIDValue = 0
                )
            )
        return safeApiCall(postData)
        {
            remoteDataSource.baseRequest(postData)
        }
    }


}