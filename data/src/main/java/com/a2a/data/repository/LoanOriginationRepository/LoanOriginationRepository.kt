package com.a2a.data.repository.LoanOriginationRepository

import com.a2a.data.datasource.RemoteDataSource
import com.a2a.data.model.common.A2ARequest
import com.a2a.data.model.common.BaseRequestModel
import com.a2a.data.model.loanorigination.LoanOriginationPostData
import com.a2a.data.model.wu.wuLookup.country.CountryPostData
import com.a2a.data.repository.BaseRepository
import com.a2a.network.Resource
import javax.inject.Inject

class LoanOriginationRepository @Inject constructor(
    private val remoteDataSource: RemoteDataSource
) : BaseRepository() {

    suspend fun <T> getLoanOrigination(
        stepNumber: String,
        subCategory: String
    ): Resource<T>? {
        val loanOriginationPostData = LoanOriginationPostData()
        loanOriginationPostData.apply {
            body.custProfile = MemoryCacheImpl.getCustProfile()!!
            body.stepNumber = stepNumber.toInt()
            body.subCategory = subCategory
        }
        val postData =
            BaseRequestModel(
                A2ARequest(
                    loanOriginationPostData.body,
                    srvID = "bluering",
                    serviceIDValue = 0
                )
            )
        return safeApiCall(postData)
        {
            remoteDataSource.baseRequest(postData)
        }
    }

}