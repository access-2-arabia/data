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
import com.a2a.data.model.card.creditcard.requestestatment.EstatmentRequestPostData
import com.a2a.data.model.card.creditcard.stopcard.StopCardPostData
import com.a2a.data.model.card.creditcard.transactionhistory.TransactionHistoryPostData
import com.a2a.data.model.card.debit.DebitCardPostData
import com.a2a.data.model.common.A2ARequest
import com.a2a.data.model.common.BaseRequestModel
import com.a2a.data.repository.BaseRepository
import com.a2a.network.Resource
import com.google.gson.annotations.SerializedName
import javax.inject.Inject

class CreditCardsRepository @Inject constructor(
    private val remoteDataSource: RemoteDataSource
) : BaseRepository() {

    suspend fun <T> getCreditCard(
    ): Resource<T>? {
        val creditCardPostData = CreditCardPostData()
        creditCardPostData.apply {
            body.custProfile = MemoryCacheImpl.getCustProfile()!!
        }
        val postData =
            BaseRequestModel(
                A2ARequest(
                    creditCardPostData.body,
                    srvID = "CardList",
                    serviceIDValue = 0
                )
            )
        return safeApiCall(postData)
        {
            remoteDataSource.baseRequest(postData)
        }
    }

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
            body.MailDailyLimit =
                activeDeactiveCard.body.MailDailyLimit
            body.MailAction =
                activeDeactiveCard.body.MailAction
            body.InternetDailyLimit =
                activeDeactiveCard.body.InternetDailyLimit
            body.InternetAction =
                activeDeactiveCard.body.InternetAction
            if (body.action == "D") {
                body.periodicity = "5"
            } else {
                body.periodicity = activeDeactiveCard.body.periodicity
            }
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
                    srvID = "StopCredit",
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
            body.stepNumber = activeDeactiveCard.body.stepNumber
            body.cardNumber = activeDeactiveCard.body.cardNumber
            body.stopReason = activeDeactiveCard.body.stopReason
            body.action = activeDeactiveCard.body.action
            body.regionCode = activeDeactiveCard.body.regionCode
        }
        val postData =
            BaseRequestModel(
                A2ARequest(
                    activeDeactivePostData.body,
                    srvID = "DeActivate",
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
                    srvID = "CardChMob",
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
            body.cards.amount = cardPayment.body.cards.amount
            body.cards.cardNumber = cardPayment.body.cards.cardNumber
            body.cards.accountNumberFrom = cardPayment.body.accounts.accountNumberFrom
            body.accounts.accountNumberFrom = cardPayment.body.accounts.accountNumberFrom
            body.accounts.amount = cardPayment.body.accounts.amount
            body.accounts.currency = cardPayment.body.accounts.currency
            body.accounts.accountNumberTo = cardPayment.body.accounts.accountNumberTo
            body.accounts.currencyFrom = cardPayment.body.accounts.currencyFrom
            body.accounts.currencyTo = cardPayment.body.accounts.currencyTo
            body.custProfile = MemoryCacheImpl.getCustProfile()!!
            body.stepNumber = cardPayment.body.stepNumber
            body.branchCode = cardPayment.body.branchCode
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

    suspend fun <T> getTransactionHistory(
        TransactionHistory: TransactionHistoryPostData
    ): Resource<T>? {
        val transactionHistoryPostData = TransactionHistoryPostData()
        transactionHistoryPostData.apply {
            body.cardNumber = TransactionHistory.body.cardNumber
            body.dateFrom = TransactionHistory.body.dateFrom
            body.dateTo = TransactionHistory.body.dateTo
            body.regionCode = TransactionHistory.body.regionCode
        }
        val postData =
            BaseRequestModel(
                A2ARequest(
                    transactionHistoryPostData.body,
                    srvID = "CardTrHis",
                    serviceIDValue = 0
                )
            )
        return safeApiCall(postData)
        {
            remoteDataSource.baseRequest(postData)
        }
    }

    suspend fun <T> getEstatmentHistory(
        estatmentRequest: EstatmentRequestPostData
    ): Resource<T>? {
        val estatmentRequestPostData = EstatmentRequestPostData()
        estatmentRequestPostData.apply {
            body.cardNumber = estatmentRequest.body.cardNumber
            body.dateFrom = estatmentRequest.body.dateFrom
            body.dateTo = estatmentRequest.body.dateTo
            body.regionCode = estatmentRequest.body.regionCode
        }
        val postData =
            BaseRequestModel(
                A2ARequest(
                    estatmentRequestPostData.body,
                    srvID = "CardTrHis",
                    serviceIDValue = 0
                )
            )
        return safeApiCall(postData)
        {
            remoteDataSource.baseRequest(postData)
        }
    }
}