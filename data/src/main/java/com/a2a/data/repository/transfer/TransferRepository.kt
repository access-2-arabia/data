package com.a2a.data.repository.transfer

import MemoryCacheImpl
import com.a2a.data.datasource.RemoteDataSource
import com.a2a.data.extentions.formatToViewDateStamp
import com.a2a.data.model.common.A2ARequest
import com.a2a.data.model.common.BaseRequestModel
import com.a2a.data.model.transfermodel.betwenmyaccount.BetweenMyAccountPostData
import com.a2a.data.model.transfermodel.betwenmyaccount.ValidationBetweenMyAccountPostData
import com.a2a.data.model.transfermodel.localbank.LocalBankModel
import com.a2a.data.model.transfermodel.localbank.LocalBankPostData
import com.a2a.data.model.transfermodel.localbank.LocalBankValidationPostData
import com.a2a.data.model.transfermodel.withincab.ValidationWithinCabPostData
import com.a2a.data.model.transfermodel.withincab.WithinCabPostData
import com.a2a.data.repository.BaseRepository
import com.a2a.data.repository.transfer.TransferType.Companion.betweenMyAccountADesc
import com.a2a.data.repository.transfer.TransferType.Companion.betweenMyAccountEDesc
import com.a2a.network.Resource
import java.util.*
import javax.inject.Inject

class TransferRepository @Inject constructor(
    private val remoteDataSource: RemoteDataSource
) : BaseRepository() {


    suspend fun <T> getValidationTransferBetweenMyAccount(
        accountNumberFromValue: String, accountNumberToValue: String,
        currFrom: String, currTo: String, amountValue: String
    ): Resource<T>? {
        val validationBetweenMyAccount = ValidationBetweenMyAccountPostData()
        validationBetweenMyAccount.apply {
            validationBetweenMyAccount.body.repID =
                MemoryCacheImpl.getCustProfile()!!.repID.toString()
            validationBetweenMyAccount.body.cID = MemoryCacheImpl.getCustProfile()!!.cID.toString()
            validationBetweenMyAccount.body.custID =
                MemoryCacheImpl.getCustProfile()!!.custID.toString()
            validationBetweenMyAccount.body.accountNumberFrom = accountNumberFromValue
            validationBetweenMyAccount.body.accountNumberTo = accountNumberToValue
            validationBetweenMyAccount.body.currencyFrom = currFrom
            validationBetweenMyAccount.body.currencyTo = currTo
            validationBetweenMyAccount.body.custType =
                MemoryCacheImpl.getCustProfile()!!.custType.toString()
            validationBetweenMyAccount.body.amount = amountValue
            validationBetweenMyAccount.body.branchCode = MemoryCacheImpl.getCustProfile()!!.branch
            validationBetweenMyAccount.body.stepNumber = "2"
        }

        val postData =
            BaseRequestModel(
                A2ARequest(
                    validationBetweenMyAccount.body,
                    srvID = "IntFund",
                    serviceIDValue = 0
                )
            )

        return safeApiCall(postData)
        {
            remoteDataSource.baseRequest(postData)
        }
    }

    suspend fun <T> getTransferBetweenMyAccount(
        accountNumberFromValue: String, accountNumberToValue: String,
        currFrom: String, currTo: String, amountValue: String
    ): Resource<T>? {

        val betweenMyAccount = BetweenMyAccountPostData()
        betweenMyAccount.apply {
            betweenMyAccount.body.custProfile = MemoryCacheImpl.getCustProfile()!!
            betweenMyAccount.body.accounts.accountNumberFrom = accountNumberFromValue
            betweenMyAccount.body.accounts.accountNumberTo = accountNumberToValue
            betweenMyAccount.body.accounts.currencyFrom = currFrom
            betweenMyAccount.body.accounts.currencyTo = currTo
            betweenMyAccount.body.accounts.amount = amountValue
            betweenMyAccount.body.startDate = Date().formatToViewDateStamp()
            betweenMyAccount.body.count = "-1"
            betweenMyAccount.body.period = 0
            betweenMyAccount.body.eDesc = betweenMyAccountEDesc
            betweenMyAccount.body.aDesc = betweenMyAccountADesc
            betweenMyAccount.body.branchCode = MemoryCacheImpl.getCustProfile()!!.branch
            betweenMyAccount.body.stepNumber = 3
        }
        val postData =
            BaseRequestModel(
                A2ARequest(
                    betweenMyAccount.body,
                    srvID = "IntFund",
                    serviceIDValue = 0
                )
            )
        return safeApiCall(postData) {
            remoteDataSource.baseRequest(postData)
        }
    }

    suspend fun <T> getValidationTransferWithinCab(
        accountNumberFromValue: String, accountNumberToValue: String,
        currFrom: String, currTo: String, amountValue: String
    ): Resource<T>? {
        val postData = ValidationWithinCabPostData()
        postData.apply {
            body.stepNumber = "2"
            body.repID = "0"
            body.cID = MemoryCacheImpl.getCustProfile()!!.cID.toString()
            body.custID = MemoryCacheImpl.getCustProfile()!!.custID
            body.accountNumberFrom = accountNumberFromValue
            body.accountNumberTo = accountNumberToValue
            body.currencyFrom = currFrom
            body.currencyTo = currTo
            body.custType = MemoryCacheImpl.getCustProfile()!!.custType.toString()
            body.amount = amountValue
            body.branchCode = MemoryCacheImpl.getCustProfile()!!.branch

        }
        return safeApiCall(postData) {
            remoteDataSource.baseRequest(postData)
        }
    }


    suspend fun <T> getTransferWithinCab(
        accountNumberFrom: String, accountNumberTo: String,
        currFrom: String, currTo: String, amountValue: String
    ): Resource<T>? {
        val postData = WithinCabPostData()
        postData.apply {
            body.stepNumber = 3
            body.custProfile.cID = MemoryCacheImpl.getCustProfile()!!.cID
            body.custProfile.custID = MemoryCacheImpl.getCustProfile()!!.custID
            body.accounts.accountNumberFrom = accountNumberFrom
            body.accounts.accountNumberTo = accountNumberTo
            body.startDate = Date().formatToViewDateStamp()
            body.accounts.currencyFrom = currFrom
            body.accounts.currencyTo = currTo
            body.accounts.amount = amountValue
            body.count = "-1"
            body.period = 0
            body.eDesc = betweenMyAccountEDesc
            body.aDesc = betweenMyAccountADesc

        }
        return safeApiCall(postData) {
            remoteDataSource.baseRequest(postData)

        }
    }


    suspend fun <T> getValidationLocalBank(
        localBankModel: LocalBankModel
    ): Resource<T>? {
        val postData = LocalBankValidationPostData()
        postData.apply {
            body.stepNumber = "2"
            body.cID = MemoryCacheImpl.getCustProfile()!!.cID.toString()
            body.custID = MemoryCacheImpl.getCustProfile()!!.custID
            body.accountNumberFrom = localBankModel.accountNumberFromValue
            body.accountNumberTo = localBankModel.accountNumberToValue
            body.currencyCodeFrom = localBankModel.currFrom
            body.custType = MemoryCacheImpl.getCustProfile()!!.custType.toString()
            body.amount = localBankModel.amountValue
            body.branchCode = MemoryCacheImpl.getCustProfile()!!.branch
            body.benBank = ""
            body.benAccIBAN = localBankModel.benefAccountIban
            body.benName = localBankModel.nameModel.benefName
            body.cCurrency = localBankModel.currTo
            body.transRsn = localBankModel.transReasonCode
            body.bFDType = "CORPORATE"
            body.aFName = localBankModel.nameModel.firstName
            body.aSName = localBankModel.nameModel.secondName
            body.aTName = localBankModel.nameModel.thirdName
            body.aLName = localBankModel.nameModel.lastName
            body.narrative1 = "RTGS Validation"
            body.narrative2 = "RTGS Validation"
            body.narrative3 = "RTGS Validation"


        }
        return safeApiCall(postData) {
            remoteDataSource.baseRequest(postData)

        }

    }

    suspend fun <T> getTransferLocalBank(
        localBankModel: LocalBankModel

    ): Resource<T>? {
        val postData = LocalBankPostData()
        postData.apply {
            body.stepNumber = "3"
            body.accountNumberFrom = localBankModel.accountNumberFromValue
            body.accountNumberTo = localBankModel.accountNumberToValue
            body.currencyCodeFrom = localBankModel.currFrom
            body.amount = localBankModel.amountValue
            body.branchCode = MemoryCacheImpl.getCustProfile()!!.branch
            body.benBank = ""
            body.benAccIBAN = localBankModel.benefAccountIban
            body.benName = localBankModel.nameModel.benefName
            body.cCurrency = localBankModel.currTo
            body.transRsn = localBankModel.transReasonCode
            body.bFDType = "CORPORATE"
            body.aFName = localBankModel.nameModel.firstName
            body.aSName = localBankModel.nameModel.secondName
            body.aTName = localBankModel.nameModel.thirdName
            body.aLName = localBankModel.nameModel.lastName
            body.count = 4
            body.period = 7
            body.eDesc = "Transfer Between Account"
            body.aDesc = "تحويل بين حسابات"
        }
        return safeApiCall(postData) {
            remoteDataSource.baseRequest(postData)

        }

    }


}