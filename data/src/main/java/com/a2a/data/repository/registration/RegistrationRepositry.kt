package com.a2a.data.repository.registration

import com.a2a.data.datasource.RemoteDataSource
import com.a2a.data.model.common.A2ARequest
import com.a2a.data.model.common.BaseRequestModel
import com.a2a.data.model.register.CustomerSignatureRegistrationPostData
import com.a2a.data.model.register.RegistrationPostData
import com.a2a.data.repository.BaseRepository
import com.a2a.network.Resource
import javax.inject.Inject

class RegistrationRepositry @Inject constructor(
    private val remoteDataSource: RemoteDataSource,
) : BaseRepository() {

    suspend fun <T> doCustomerRegistration(registration: RegistrationPostData): Resource<T>? {
        val registrationPostData = RegistrationPostData()
        registrationPostData.apply {
            body.custProfile.mobileNumber = registration.body.custProfile.mobileNumber
            body.regionCode = registration.body.regionCode
            body.pAN = registration.body.pAN
            body.pIN = registration.body.pIN
        }
        val postData =
            BaseRequestModel(
                A2ARequest(
                    registrationPostData.body,
                    srvID = "SelfReg",
                    serviceIDValue = 0
                )
            )
        return safeApiCall(postData) {
            remoteDataSource.baseRequest(postData)
        }
    }

    suspend fun <T> doCustomerSignatureRegistration(registration: CustomerSignatureRegistrationPostData): Resource<T>? {
        val registrationPostData = CustomerSignatureRegistrationPostData()
        registrationPostData.apply {
            body.isSignature = registration.body.isSignature
            body.stepNumber = registration.body.stepNumber
            body.custProfile.custID = registration.body.custProfile.custID
        }
        val postData =
            BaseRequestModel(
                A2ARequest(
                    registrationPostData.body,
                    srvID = "SelfReg",
                    serviceIDValue = 0
                )
            )
        return safeApiCall(postData) {
            remoteDataSource.baseRequest(postData)
        }
    }

}