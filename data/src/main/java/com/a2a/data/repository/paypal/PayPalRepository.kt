package com.a2a.data.repository.paypal

import com.a2a.data.datasource.RemoteDataSource
import com.a2a.data.model.accountlist.AccountListResponse
import com.a2a.data.model.common.A2ARequest
import com.a2a.data.model.common.BaseRequestModel
import com.a2a.data.model.paypal.SendMoneyPostData
import com.a2a.data.model.paypal.ValidationPostData
import com.a2a.data.model.paypal.validation.GetVerifiedStatusPostData
import com.a2a.data.model.wu.feeinquire.FeeInquirePostData
import com.a2a.data.repository.BaseRepository
import com.a2a.network.Resource
import com.a2a.network.model.CustProfile
import com.google.gson.annotations.SerializedName
import javax.inject.Inject

class PayPalRepository @Inject constructor(
    private val remoteDataSource: RemoteDataSource
) : BaseRepository() {

    suspend fun <T> getValidation(
        validationReq: ValidationPostData,
    ): Resource<T>? {
        val validation = ValidationPostData()
        validation.apply {
            body.custProfile = MemoryCacheImpl.getCustProfile()!!
            body.accounts = validationReq.body.accounts
            body.stepNumber = validationReq.body.stepNumber
        }
        val postData =
            BaseRequestModel(
                A2ARequest(
                    validation.body,
                    srvID = "PayPalPmnt",
                    serviceIDValue = 0
                )
            )
        return safeApiCall(postData)
        {
            remoteDataSource.baseRequest(postData)
        }
    }

    suspend fun <T> getSendMoney(
        sendMoneyReq: SendMoneyPostData,
    ): Resource<T>? {
        val validation = SendMoneyPostData()
        validation.apply {
            body.custProfile = sendMoneyReq.body.custProfile
            body.accounts = sendMoneyReq.body.accounts
            body.stepNumber = sendMoneyReq.body.stepNumber
        }
        val postData =
            BaseRequestModel(
                A2ARequest(
                    validation.body,
                    srvID = "PayPalPmnt",
                    serviceIDValue = 0
                )
            )
        return safeApiCall(postData)
        {
            remoteDataSource.baseRequest(postData)
        }
    }

    ///////////////////////////////New  PayPal/////////////////////////////
    suspend fun <T> getVerifiedStatus(
        verifiedStatusPostData: GetVerifiedStatusPostData,
    ): Resource<T>? {
        val verifiedStatus = GetVerifiedStatusPostData()
        verifiedStatus.apply {
            body.callback = verifiedStatusPostData.body.callback
            body.cancelUrl = verifiedStatusPostData.body.cancelUrl
            body.custProfile = verifiedStatusPostData.body.custProfile
            body.ipnNotificationUrl = verifiedStatusPostData.body.ipnNotificationUrl
            body.returnUrl = verifiedStatusPostData.body.returnUrl
            body.stepNumber = verifiedStatusPostData.body.stepNumber
        }
        val postData =
            BaseRequestModel(
                A2ARequest(
                    verifiedStatus.body,
                    srvID = "PayPal",
                    serviceIDValue = 0
                )
            )
        return safeApiCall(postData)
        {
            remoteDataSource.baseRequest(postData)
        }
    }
}