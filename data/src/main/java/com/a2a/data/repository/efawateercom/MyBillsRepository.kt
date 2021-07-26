package com.a2a.data.repository.efawateercom

import com.a2a.data.datasource.RemoteDataSource
import com.a2a.data.model.common.A2ARequest
import com.a2a.data.model.common.BaseRequestModel
import com.a2a.data.model.efawateercom.myBills.MyBillPostData
import com.a2a.data.repository.BaseRepository
import com.a2a.network.Resource
import javax.inject.Inject

class MyBillsRepository @Inject constructor(
    private val remoteDataSource: RemoteDataSource
) : BaseRepository() {

    suspend fun <T> getMyBills(): Resource<T> {

        val body = MyBillPostData()
        val custProfile = MemoryCacheImpl.getCustProfile()

        body.apply {

            body.requestType = "GetRegBilling"
            body.rID = 0
            if (custProfile != null) {
                body.cID = custProfile.cID
                body.custID = custProfile.custID
            }
        }

        val postData = BaseRequestModel(
            A2ARequest(
                body,
                srvID = "eFwatercom"
            )
        )
        return safeApiCall(postData) {
            remoteDataSource.baseRequest(postData)
        }
    }

}