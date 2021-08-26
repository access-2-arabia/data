package com.a2a.data.repository.cards

import MemoryCacheImpl
import com.a2a.data.datasource.RemoteDataSource
import com.a2a.data.model.card.creditcard.CreditCardPostData
import com.a2a.data.model.card.creditcard.activedeactivecreditcard.ActiveDeactivePostData
import com.a2a.data.model.card.creditcard.cardpayment.CardPaymentPostData
import com.a2a.data.model.card.creditcard.cardpayment.CardPaymentValidationPostData
import com.a2a.data.model.card.creditcard.changemobilenumber.ChangeMobileNumberCreditCardPostData
import com.a2a.data.model.card.creditcard.enabledisableInternet.EnableDisableInternetPostData
import com.a2a.data.model.card.creditcard.lasttransaction.CardLastTransactionPostData
import com.a2a.data.model.card.creditcard.stopcard.StopCardPostData
import com.a2a.data.model.card.debit.DebitCardPostData
import com.a2a.data.model.common.A2ARequest
import com.a2a.data.model.common.BaseRequestModel
import com.a2a.data.repository.BaseRepository
import com.a2a.network.Resource
import javax.inject.Inject

class DebitCardsRepository @Inject constructor(
    private val remoteDataSource: RemoteDataSource
) : BaseRepository() {

    suspend fun <T> getDebitPrepaidCard(
    ): Resource<T>? {
        val debitCardPostData = DebitCardPostData()
        debitCardPostData.apply {
            body.custProfile = MemoryCacheImpl.getCustProfile()!!
        }
        val postData =
            BaseRequestModel(
                A2ARequest(
                    debitCardPostData.body,
                    srvID = "CardSList",
                    serviceIDValue = 0
                )
            )
        return safeApiCall(postData)
        {
            remoteDataSource.baseRequest(postData)
        }
    }

    suspend fun <T> getCardsLastTransactionHistory(
        cardPostData: CardLastTransactionPostData
    ): Resource<T>? {
        val cardLastTransactionPostData = CardLastTransactionPostData()
        cardLastTransactionPostData.apply {
            body.cardNumber = cardPostData.body.cardNumber
            body.dateFrom = cardPostData.body.dateFrom
            body.dateTo = cardPostData.body.dateTo
            body.regionCode = cardPostData.body.regionCode
        }
        val postData =
            BaseRequestModel(
                A2ARequest(
                    cardLastTransactionPostData.body,
                    srvID = "CardTrHis",
                    serviceIDValue = 0
                )
            )
        return safeApiCall(postData)
        {
            remoteDataSource.baseRequest(postData)
        }
    }

    suspend fun <T> getEnableDisableCreditCardInternet(
        activeDeactiveCard: EnableDisableInternetPostData
    ): Resource<T>? {
        val enableDisableInternetPostData = EnableDisableInternetPostData()
        enableDisableInternetPostData.apply {
            body.cardNumber = activeDeactiveCard.body.cardNumber
            body.action = activeDeactiveCard.body.action
            body.amount = activeDeactiveCard.body.amount
        }
        val postData =
            BaseRequestModel(
                A2ARequest(
                    enableDisableInternetPostData.body,
                    srvID = "IntOrderUr",
                    serviceIDValue = 0
                )
            )
        return safeApiCall(postData)
        {
            remoteDataSource.baseRequest(postData)
        }
    }

    suspend fun <T> getStopCreditCardInternet(
        stopCard: StopCardPostData
    ): Resource<T>? {
        val stopCardPostData = StopCardPostData()
        stopCardPostData.apply {
            body.cardNumber = stopCard.body.cardNumber
            body.oppReason = stopCard.body.oppReason
        }
        val postData =
            BaseRequestModel(
                A2ARequest(
                    stopCardPostData.body,
                    srvID = "CardSStop",
                    serviceIDValue = 0
                )
            )
        return safeApiCall(postData)
        {
            remoteDataSource.baseRequest(postData)
        }
    }

    suspend fun <T> getActiveDeactive(
        activeDeactiveCard: ActiveDeactivePostData
    ): Resource<T>? {
        val activeDeactivePostData = ActiveDeactivePostData()
        activeDeactivePostData.apply {
            body.stepNumber = "3"
            body.cardNumber = activeDeactiveCard.body.cardNumber
            body.regionCode = "02"
            body.action = activeDeactiveCard.body.action
        }
        val postData =
            BaseRequestModel(
                A2ARequest(
                    activeDeactivePostData.body,
                    srvID = "CardSEDInt",
                    serviceIDValue = 0
                )
            )
        return safeApiCall(postData)
        {
            remoteDataSource.baseRequest(postData)
        }
    }

    suspend fun <T> getChangeMobileNumber(
        changeMobileNumberCreditCard: ChangeMobileNumberCreditCardPostData
    ): Resource<T>? {
        val changeMobileNumberCreditCardPostData = ChangeMobileNumberCreditCardPostData()
        changeMobileNumberCreditCardPostData.apply {
            body.stepNumber = changeMobileNumberCreditCard.body.stepNumber
            body.cardNumber = changeMobileNumberCreditCard.body.cardNumber
            body.regionCode = changeMobileNumberCreditCard.body.regionCode
            body.newMobNo = changeMobileNumberCreditCard.body.newMobNo
        }
        val postData =
            BaseRequestModel(
                A2ARequest(
                    changeMobileNumberCreditCardPostData.body,
                    srvID = "CardSChMo",
                    serviceIDValue = 0
                )
            )
        return safeApiCall(postData)
        {
            remoteDataSource.baseRequest(postData)
        }
    }

    suspend fun <T> getCardPaymentValidation(
        cardPayment: CardPaymentValidationPostData
    ): Resource<T>? {
        val cardPaymentPostData = CardPaymentValidationPostData()
        cardPaymentPostData.apply {
            body.cards.currencyFrom = cardPayment.body.cards.currencyFrom
            body.cards.currencyTo = cardPayment.body.cards.currencyTo
            body.cards.cardNumber = cardPayment.body.cards.cardNumber
            body.cards.amount = cardPayment.body.cards.amount
            body.cards.accountNumber = cardPayment.body.cards.accountNumber
            body.accounts.accountNumber = cardPayment.body.accounts.accountNumber
            body.accounts.amount = cardPayment.body.accounts.amount
            body.accounts.currency = cardPayment.body.accounts.currency
            body.branchCode = MemoryCacheImpl.getCustProfile()!!.branch
            body.accounts.currency = cardPayment.body.accounts.currency
        }
        val postData =
            BaseRequestModel(
                A2ARequest(
                    cardPaymentPostData.body,
                    srvID = "CardPaymnt",
                    serviceIDValue = 3247
                )
            )

        return safeApiCall(postData)
        {
            remoteDataSource.baseRequest(postData)
        }
    }

    suspend fun <T> getCardPayment(
        cardPayment: CardPaymentPostData
    ): Resource<T>? {
        val cardPaymentPostData = CardPaymentPostData()
        cardPaymentPostData.apply {
            body.cards.currencyFrom = cardPayment.body.cards.currencyFrom
            body.cards.currencyTo = cardPayment.body.cards.currencyTo
            body.cards.cardNumber = cardPayment.body.cards.cardNumber
            body.cards.amount = cardPayment.body.cards.amount
            body.cards.accountNumber = cardPayment.body.cards.accountNumber
            body.accounts.accountNumber = cardPayment.body.accounts.accountNumber
            body.accounts.amount = cardPayment.body.accounts.amount
            body.accounts.currency = cardPayment.body.accounts.currency
            body.branchCode = MemoryCacheImpl.getCustProfile()!!.branch
            body.StepNumber = "4"
            body.TRXRefNo = cardPayment.body.TRXRefNo
        }
        val postData =
            BaseRequestModel(
                A2ARequest(
                    cardPaymentPostData.body,
                    srvID = "CardPaymnt",
                    serviceIDValue = 3247
                )
            )
        return safeApiCall(postData)
        {
            remoteDataSource.baseRequest(postData)
        }
    }


}