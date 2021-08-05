package com.a2a.data.repository.preferences

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
import com.a2a.data.model.preferneces.GetAuthorisedCountryPostData
import com.a2a.data.repository.BaseRepository
import com.a2a.network.Resource
import javax.inject.Inject

class AuthorizedCountryRepository @Inject constructor(
    private val remoteDataSource: RemoteDataSource
) : BaseRepository() {
    suspend fun <T> getAuthorizedCountry(): Resource<T> {

        val body = GetAuthorisedCountryPostData()

        body.apply {
            custProfile.custID = MemoryCacheImpl.getCustProfile()?.custID ?: ""
            custProfile.cID = MemoryCacheImpl.getCustProfile()?.cID ?: 0
            custProfile.rID = 0
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