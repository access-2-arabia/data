package com.a2a.data.repository.registration

import com.a2a.data.datasource.RemoteDataSource
import com.a2a.data.model.common.A2ARequest
import com.a2a.data.model.common.BaseRequestModel
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
            body.custProfile.mobileNumber = registration.body.mobileNumber
            body.regionCode = registration.body.regionCode
            body.pAN = registration.body.pAN
            body.pIN=registration.body.pIN
            if  (registration.body.isSignature){
                body.isSignature=registration.body.isSignature
            }
        }
        val postData =
            BaseRequestModel(A2ARequest(registrationPostData.body, srvID = "SelfReg", serviceIDValue = 0))
        return safeApiCall(postData) {
            remoteDataSource.baseRequest(postData)
        }
    }

}