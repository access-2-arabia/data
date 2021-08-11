package com.a2a.data.repository.preferences

import MemoryCacheImpl
import com.a2a.data.datasource.MemoryCache
import com.a2a.data.datasource.RemoteDataSource
import com.a2a.data.model.common.A2ARequest
import com.a2a.data.model.common.BaseRequestModel
import com.a2a.data.model.efawateercom.AddBillPostData
import com.a2a.data.model.efawateercom.BillersPostData
import com.a2a.data.model.efawateercom.CategoriesPostData
import com.a2a.data.model.efawateercom.postBill.PayPostPaidPostData
import com.a2a.data.model.efawateercom.postBill.PostBillPostData
import com.a2a.data.model.efawateercom.prePaidBill.PayPrepaidPostData
import com.a2a.data.model.efawateercom.prePaidBill.PrepaidInquirePostData
import com.a2a.data.model.forgetPasswod.ForgetPasswordPostData
import com.a2a.data.model.preferneces.AddAuthorizedCountry
import com.a2a.data.model.preferneces.GetAuthorisedCountryPostData
import com.a2a.data.repository.BaseRepository
import com.a2a.network.Resource
import javax.inject.Inject

class AuthorizedCountryRepository @Inject constructor(
    private val remoteDataSource: RemoteDataSource
) : BaseRepository() {
    suspend fun <T> getAuthorizedCountry(): Resource<T> {
        val body = GetAuthorisedCountryPostData()
        val currentCustProfile = MemoryCacheImpl.getCustProfile()
        body.apply {
            if (currentCustProfile != null) {
                custProfile = currentCustProfile
            }
        }
        val postData = BaseRequestModel(
            A2ARequest(
                body,
                srvID = "autCountry"
            )
        )
        return safeApiCall(postData) {
            remoteDataSource.baseRequest(postData)
        }
    }


    suspend fun <T> addAuthorizedCountry(newCountry: String): Resource<T> {
        val body = AddAuthorizedCountry()
        val currentCustProfile = MemoryCacheImpl.getCustProfile()
        body.apply {
            if (currentCustProfile != null) {
                custProfile = currentCustProfile
            }
            stepNumber = "2"
            country = newCountry
        }
        val postData = BaseRequestModel(
            A2ARequest(
                body,
                srvID = "autCountry"
            )
        )
        return safeApiCall(postData) {
            remoteDataSource.baseRequest(postData)
        }
    }

}