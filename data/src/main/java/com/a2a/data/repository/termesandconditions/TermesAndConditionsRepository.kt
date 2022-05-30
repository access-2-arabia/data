package com.a2a.data.repository.termesandconditions

import com.a2a.data.datasource.RemoteDataSource
import com.a2a.data.model.common.A2ARequest
import com.a2a.data.model.common.BaseRequestModel
import com.a2a.data.model.register.CustomerSignatureRegistrationPostData
import com.a2a.data.model.termesandconditions.TermsAndConditionsPostData
import com.a2a.data.repository.BaseRepository
import com.a2a.network.Resource
import javax.inject.Inject

class TermesAndConditionsRepository @Inject constructor(
    private val remoteDataSource: RemoteDataSource,
) : BaseRepository() {

    suspend fun <T> getTermesAndConditions(data: TermsAndConditionsPostData): Resource<T>? {
        val termsAndConditionsPostData = TermsAndConditionsPostData()
        termsAndConditionsPostData.apply {
            body.pageName = data.body.pageName
            body.stepNumber = data.body.stepNumber
            body.custProfile = data.body.custProfile
        }
        val postData =
            BaseRequestModel(
                A2ARequest(
                    termsAndConditionsPostData.body,
                    srvID = "PayPal",
                    serviceIDValue = 0
                )
            )
        return safeApiCall(postData) {
            remoteDataSource.baseRequest(postData)
        }
    }
}