package com.a2a.data.repository.cliq

import com.a2a.data.datasource.RemoteDataSource
import com.a2a.data.model.cliq.GetCustomerPostData
import com.a2a.data.model.cliq.teremsandconditions.TermsAndConditionsPostData
import com.a2a.data.model.common.A2ARequest
import com.a2a.data.model.common.BaseRequestModel
import com.a2a.data.repository.BaseRepository
import com.a2a.network.Resource
import javax.inject.Inject

class TermsAndConditions  @Inject constructor(
    private val remoteDataSource: RemoteDataSource
) : BaseRepository()  {

    suspend fun <T> getTermsAndConditions(data :TermsAndConditionsPostData): Resource<T> {
        val body = TermsAndConditionsPostData()
        body.apply {
             custProfile= data.custProfile
             stepNumber=data.stepNumber
             approve=data.approve
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