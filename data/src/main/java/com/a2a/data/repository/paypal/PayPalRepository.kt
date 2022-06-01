package com.a2a.data.repository.paypal

import com.a2a.data.datasource.RemoteDataSource
import com.a2a.data.model.accountlist.AccountListResponse
import com.a2a.data.model.cliq.beneficiary.GetBeneficiaryPostData
import com.a2a.data.model.common.A2ARequest
import com.a2a.data.model.common.BaseRequestModel
import com.a2a.data.model.paypal.SendMoneyPostData
import com.a2a.data.model.paypal.ValidationPostData
import com.a2a.data.model.paypal.createaccount.CreateAccountPostData
import com.a2a.data.model.paypal.delink.DeLinkPostData
import com.a2a.data.model.paypal.faq.FAQPostData
import com.a2a.data.model.paypal.getbalance.GetPaypalBalancePostData
import com.a2a.data.model.paypal.transaction.PaypalTransactionPostData
import com.a2a.data.model.paypal.transaction.PaypalTransactionValidationPostData
import com.a2a.data.model.paypal.updateemail.UpdateEmailPostData
import com.a2a.data.model.paypal.validation.GetVerifiedStatusPostData
import com.a2a.data.model.wu.feeinquire.FeeInquirePostData
import com.a2a.data.repository.BaseRepository
import com.a2a.network.Resource

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
            body.stepNumber = createAccountPostData.body.stepNumber
            body.custProfile = createAccountPostData.body.custProfile
            body.createAccountWebOptions.returnUrl =
                createAccountPostData.body.createAccountWebOptions.returnUrl
            body.addPaymentCard.cardNumber =
                createAccountPostData.body.addPaymentCard.cardNumber
            body.addPaymentCard.cardType =
                createAccountPostData.body.addPaymentCard.cardType
            body.addPaymentCard.cardVerificationNumber =
                createAccountPostData.body.addPaymentCard.cardVerificationNumber
            body.addPaymentCard.expirationDate.month =
                createAccountPostData.body.addPaymentCard.expirationDate.month
            body.addPaymentCard.expirationDate.year =
                createAccountPostData.body.addPaymentCard.expirationDate.year
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

    suspend fun <T> getPaypalTransactionValidation(
        paypalTransactionValidationPostData: PaypalTransactionValidationPostData,
    ): Resource<T>? {
        val paypalTransactionValidationRequest = PaypalTransactionValidationPostData()
        paypalTransactionValidationRequest.apply {
            body.stepNumber = paypalTransactionValidationPostData.body.stepNumber
            body.custProfile = paypalTransactionValidationPostData.body.custProfile
            body.accTo = paypalTransactionValidationPostData.body.accTo
            body.currTo = paypalTransactionValidationPostData.body.currTo
            body.accFrom = paypalTransactionValidationPostData.body.accFrom
            body.fees = paypalTransactionValidationPostData.body.fees
            body.sameAcc = paypalTransactionValidationPostData.body.sameAcc
            body.amt = paypalTransactionValidationPostData.body.amt
            body.currFrom = paypalTransactionValidationPostData.body.currFrom

        }
        val postData =
            BaseRequestModel(
                A2ARequest(
                    paypalTransactionValidationRequest.body,
                    srvID = "PayPal",
                    serviceIDValue = 0
                )
            )
        return safeApiCall(postData)
        {
            remoteDataSource.baseRequest(postData)
        }
    }

    suspend fun <T> getPaypalTransaction(
        paypalTransactionPostData: PaypalTransactionPostData,
    ): Resource<T>? {
        val paypalTransactionRequest = PaypalTransactionPostData()
        paypalTransactionRequest.apply {
            body.stepNumber =  paypalTransactionPostData.body.stepNumber
            body.custProfile = paypalTransactionPostData.body.custProfile
            body.accTo = paypalTransactionPostData.body.accTo
            body.accFrom = paypalTransactionPostData.body.accFrom
            body.currFrom = paypalTransactionPostData.body.currFrom
            body.currTo = paypalTransactionPostData.body.currTo
            body.cancelUrl = paypalTransactionPostData.body.cancelUrl
            body.sameAcc = paypalTransactionPostData.body.sameAcc
            body.returnUrl = paypalTransactionPostData.body.returnUrl
            body.receiverList.receiver.amount =
                paypalTransactionPostData.body.receiverList.receiver.amount
            body.receiverList.receiver.email =
                paypalTransactionPostData.body.receiverList.receiver.email
        }
        val postData =
            BaseRequestModel(
                A2ARequest(
                    paypalTransactionRequest.body,
                    srvID = "PayPal",
                    serviceIDValue = 0
                )
            )
        return safeApiCall(postData)
        {
            remoteDataSource.baseRequest(postData)
        }
    }

    suspend fun <T> getPaypalBalance(
        paypalBalancePostData: GetPaypalBalancePostData
    ): Resource<T>? {
        val getPaypalBalanceRequest = GetPaypalBalancePostData()
        getPaypalBalanceRequest.apply {
            body.stepNumber = 8
            body.custProfile = paypalBalancePostData.body.custProfile
        }
        val postData =
            BaseRequestModel(
                A2ARequest(
                    getPaypalBalanceRequest.body,
                    srvID = "PayPal",
                    serviceIDValue = 0
                )
            )
        return safeApiCall(postData)
        {
            remoteDataSource.baseRequest(postData)
        }
    }


    suspend fun <T> getPaypalDeLink(
        paypalDeLinkPostData: DeLinkPostData
    ): Resource<T>? {
        val getDeLinkPostDataRequest = DeLinkPostData()
        getDeLinkPostDataRequest.apply {
            body.stepNumber = paypalDeLinkPostData.body.stepNumber
            body.custProfile = paypalDeLinkPostData.body.custProfile
        }
        val postData =
            BaseRequestModel(
                A2ARequest(
                    getDeLinkPostDataRequest.body,
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