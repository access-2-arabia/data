package com.a2a.data.repository.validations

import MemoryCacheImpl
import com.a2a.data.datasource.RemoteDataSource
import com.a2a.data.model.common.A2ARequest
import com.a2a.data.model.common.BaseRequestModel
import com.a2a.data.model.validations.IbanValidationPostData
import com.a2a.data.model.validations.SwiftCodePostData
import com.a2a.data.repository.BaseRepository
import com.a2a.network.Resource
import javax.inject.Inject

class ValidationRepository @Inject constructor(
    private val remoteDataSource: RemoteDataSource,
) : BaseRepository() {

    suspend fun <T> getValidationIban(
        IbanValidation: IbanValidationPostData,
    ): Resource<T>? {
        val ibanValidationPostData = IbanValidationPostData()
        ibanValidationPostData.apply {
            body.custProfile = MemoryCacheImpl.getCustProfile()!!
            body.iban = IbanValidation.body.iban
            body.stepNumber = IbanValidation.body.stepNumber
        }
        val postData =
            BaseRequestModel(
                A2ARequest(
                    ibanValidationPostData.body,
                    srvID = "SWIFT",
                    serviceIDValue = 0
                )
            )
        return safeApiCall(postData)
        {
            remoteDataSource.baseRequest(postData)
        }
    }

    suspend fun <T> getValidationSwift(
        swiftCode: SwiftCodePostData,
    ): Resource<T>? {
        val swiftCodePostDataPostData = SwiftCodePostData()
        swiftCodePostDataPostData.apply {
            body.custProfile = MemoryCacheImpl.getCustProfile()!!
            body.bic = swiftCode.body.bic
            body.stepNumber = swiftCode.body.stepNumber
        }
        val postData =
            BaseRequestModel(
                A2ARequest(
                    swiftCodePostDataPostData.body,
                    srvID = "SWIFT",
                    serviceIDValue = 0
                )
            )
        return safeApiCall(postData)
        {
            remoteDataSource.baseRequest(postData)
        }
    }
}