package com.a2a.data.repository.paypal

import com.a2a.data.datasource.RemoteDataSource
import com.a2a.data.model.accountlist.AccountListResponse
import com.a2a.data.model.common.A2ARequest
import com.a2a.data.model.common.BaseRequestModel
import com.a2a.data.model.paypal.SendMoneyPostData
import com.a2a.data.model.paypal.ValidationPostData
import com.a2a.data.model.paypal.createaccount.CreateAccountPostData
import com.a2a.data.model.paypal.faq.FAQPostData
import com.a2a.data.model.paypal.updateemail.UpdateEmailPostData
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

    suspend fun <T> getFAQ(
        faqPostData: FAQPostData,
    ): Resource<T>? {
        val faqRequest = FAQPostData()
        faqRequest.apply {
            body.pageName = faqPostData.body.pageName
            body.stepNumber = 16
            body.custProfile = faqPostData.body.custProfile
        }
        val postData =
            BaseRequestModel(
                A2ARequest(
                    faqRequest.body,
                    srvID = "PayPal",
                    serviceIDValue = 0
                )
            )
        return safeApiCall(postData)
        {
            remoteDataSource.baseRequest(postData)
        }
    }

    suspend fun <T> getCreateAccount(
        createAccountPostData: CreateAccountPostData,
    ): Resource<T>? {
        val createAccountRequest = CreateAccountPostData()
        createAccountRequest.apply {
            body.stepNumber = 2
            body.custProfile = createAccountRequest.body.custProfile
            body.createAccountWebOptions.returnUrl =
                createAccountRequest.body.createAccountWebOptions.returnUrl
            body.addPaymentCard.cardNumber =
                createAccountRequest.body.addPaymentCard.cardNumber
            body.addPaymentCard.cardType =
                createAccountRequest.body.addPaymentCard.cardType
            body.addPaymentCard.cardVerificationNumber =
                createAccountRequest.body.addPaymentCard.cardVerificationNumber
            body.addPaymentCard.expirationDate.month =
                createAccountRequest.body.addPaymentCard.expirationDate.month
            body.addPaymentCard.expirationDate.year =
                createAccountRequest.body.addPaymentCard.expirationDate.year
        }
        val postData =
            BaseRequestModel(
                A2ARequest(
                    createAccountRequest.body,
                    srvID = "PayPal",
                    serviceIDValue = 0
                )
            )
        return safeApiCall(postData)
        {
            remoteDataSource.baseRequest(postData)
        }
    }

    suspend fun <T> getUpdateEmail(
        updateEmailPostData: UpdateEmailPostData,
    ): Resource<T>? {
        val updateEmailRequest = UpdateEmailPostData()
        updateEmailRequest.apply {
            body.stepNumber = 17
            body.custProfile = updateEmailPostData.body.custProfile
        }
        val postData =
            BaseRequestModel(
                A2ARequest(
                    updateEmailRequest.body,
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