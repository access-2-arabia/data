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
import com.a2a.data.model.card.creditcard.transactionhistory.TransactionHistoryPostData
import com.a2a.data.model.card.debit.DebitCardPostData
import com.a2a.data.model.card.debit.chargeprepaid.ChargePrepaidPostData
import com.a2a.data.model.card.debit.chargeprepaid.ChargePrepaidValidationPostData
import com.a2a.data.model.card.debit.retrivecardpin.RetrieveCardPinPostData
import com.a2a.data.model.card.debit.vertualprepaid.VirtualPrepaidPostData
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
            body.cardNumber = activeDeactiveCard.body.cardNumber
            body.action = activeDeactiveCard.body.action
            body.stopReason=activeDeactiveCard.body.stopReason
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
        cardPayment: ChargePrepaidValidationPostData
    ): Resource<T>? {
        val cardPaymentPostData = ChargePrepaidValidationPostData()
        cardPaymentPostData.apply {
            body.stepNumber = cardPayment.body.stepNumber
            body.branchCode = MemoryCacheImpl.getCustProfile()!!.branch
            body.currencyCodeFrom = cardPayment.body.currencyCodeFrom
            body.currencyCodeTo = cardPayment.body.currencyCodeTo
            body.amount = cardPayment.body.amount
            body.accountNumberTo =cardPayment. body.accountNumberTo
            body.accountNumberFrom =cardPayment. body.accountNumberFrom
        }
        val postData =
            BaseRequestModel(
                A2ARequest(
                    cardPaymentPostData.body,
                    srvID = "CardPay",
                    serviceIDValue = 0
                )
            )
        return safeApiCall(postData)
        {
            remoteDataSource.baseRequest(postData)
        }
    }

    suspend fun <T> getCardPayment(
        chargePrepaid: ChargePrepaidPostData
    ): Resource<T>? {
        val cardPaymentPostData = ChargePrepaidPostData()
        cardPaymentPostData.apply {
            body.stepNumber=chargePrepaid.body.stepNumber
            body.branchCode=chargePrepaid.body.branchCode
            body.accounts.accountFrom=chargePrepaid.body.accounts.accountFrom
            body.accounts.amount=chargePrepaid.body.accounts.amount
            body.accounts.currencyCodeFrom=chargePrepaid.body.accounts.currencyCodeFrom
            body.accounts.fees=chargePrepaid.body.accounts.fees
            body.custProfile=MemoryCacheImpl.getCustProfile()!!
            body.cards.program=chargePrepaid.body.cards.program
            body.cards.cardNumber=chargePrepaid.body.cards.cardNumber
        }
        val postData =
            BaseRequestModel(
                A2ARequest(
                    cardPaymentPostData.body,
                    srvID = "CardPay",
                    serviceIDValue = 0
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
                    srvID = "CardSTrHis",
                    serviceIDValue = 0
                )
            )
        return safeApiCall(postData)
        {
            remoteDataSource.baseRequest(postData)
        }
    }

    suspend fun <T> getVirtualCard(
    ): Resource<T>? {
        val virtualCard = VirtualPrepaidPostData()
        virtualCard.apply {
            body.custID = MemoryCacheImpl.getCustProfile()!!.custID
        }
        val postData =
            BaseRequestModel(
                A2ARequest(
                    virtualCard.body,
                    srvID = "ReqVirCard",
                    serviceIDValue = 0
                )
            )
        return safeApiCall(postData)
        {
            remoteDataSource.baseRequest(postData)
        }
    }

    suspend fun <T> getCardPin(
          retrieveCardPin : RetrieveCardPinPostData
    ): Resource<T>? {
        val retrieveCardPin = RetrieveCardPinPostData()
        retrieveCardPin.apply {
            body.cardNumber = retrieveCardPin.body.cardNumber
        }
        val postData =
            BaseRequestModel(
                A2ARequest(
                    retrieveCardPin.body,
                    srvID = "CardSPIN",
                    serviceIDValue = 0
                )
            )
        return safeApiCall(postData)
        {
            remoteDataSource.baseRequest(postData)
        }
    }
}