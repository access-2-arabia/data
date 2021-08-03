package com.a2a.data.repository.transfer

import MemoryCacheImpl
import com.a2a.data.datasource.RemoteDataSource
import com.a2a.data.extentions.formatToViewDateStamp
import com.a2a.data.model.common.A2ARequest
import com.a2a.data.model.common.BaseRequestModel
import com.a2a.data.model.transfermodel.betwenmyaccount.BetweenMyAccountModel
import com.a2a.data.model.transfermodel.betwenmyaccount.BetweenMyAccountPostData
import com.a2a.data.model.transfermodel.betwenmyaccount.ValidationBetweenMyAccountPostData
import com.a2a.data.model.transfermodel.localbank.LocalBankModel
import com.a2a.data.model.transfermodel.localbank.LocalBankPostData
import com.a2a.data.model.transfermodel.localbank.LocalBankValidationPostData
import com.a2a.data.model.transfermodel.withincab.ValidationWithinCabPostData
import com.a2a.data.model.transfermodel.withincab.WithinCabPostData
import com.a2a.data.model.transfermodel.withincab.WithinCabTransferModel
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
        betweenMyAccountModel: BetweenMyAccountModel
    ): Resource<T>? {
        val validationBetweenMyAccount = ValidationBetweenMyAccountPostData()
        validationBetweenMyAccount.apply {
            validationBetweenMyAccount.body.repID =
                MemoryCacheImpl.getCustProfile()!!.repID.toString()
            validationBetweenMyAccount.body.cID = MemoryCacheImpl.getCustProfile()!!.cID.toString()
            validationBetweenMyAccount.body.custID =
                MemoryCacheImpl.getCustProfile()!!.custID.toString()
            validationBetweenMyAccount.body.accountNumberFrom =
                betweenMyAccountModel.fromAccountNumber
            validationBetweenMyAccount.body.accountNumberTo = betweenMyAccountModel.toAccountNumber
            validationBetweenMyAccount.body.currencyFrom = betweenMyAccountModel.fromAccountCurrency
            validationBetweenMyAccount.body.currencyTo = betweenMyAccountModel.toAccountCurrency
            validationBetweenMyAccount.body.custType =
                MemoryCacheImpl.getCustProfile()!!.custType.toString()
            validationBetweenMyAccount.body.amount = betweenMyAccountModel.amount
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
        betweenMyAccountModel: BetweenMyAccountModel
    ): Resource<T>? {

        val betweenMyAccount = BetweenMyAccountPostData()
        betweenMyAccount.apply {
            betweenMyAccount.body.custProfile = MemoryCacheImpl.getCustProfile()!!
            betweenMyAccount.body.accounts.accountNumberFrom =
                betweenMyAccountModel.fromAccountNumber
            betweenMyAccount.body.accounts.accountNumberTo = betweenMyAccountModel.toAccountNumber
            betweenMyAccount.body.accounts.currencyFrom = betweenMyAccountModel.fromAccountCurrency
            betweenMyAccount.body.accounts.currencyTo = betweenMyAccountModel.toAccountCurrency
            betweenMyAccount.body.accounts.amount = betweenMyAccountModel.amount
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
        withinCabTransferModel: WithinCabTransferModel
    ): Resource<T>? {
        val validationWithinCabPostData = ValidationWithinCabPostData()
        validationWithinCabPostData.apply {
            body.stepNumber = "2"
            body.repID = "0"
            body.cID = MemoryCacheImpl.getCustProfile()!!.cID.toString()
            body.custID = MemoryCacheImpl.getCustProfile()!!.custID
            body.accountNumberFrom = withinCabTransferModel.fromAccountNumber
            body.accountNumberTo = withinCabTransferModel.toBeneficiaryAccount
            body.currencyFrom = withinCabTransferModel.fromCurrency
            body.currencyTo = withinCabTransferModel.toBeneficiaryCurrency
            body.custType = MemoryCacheImpl.getCustProfile()!!.custType.toString()
            body.amount = withinCabTransferModel.amount
            body.branchCode = MemoryCacheImpl.getCustProfile()!!.branch
        }

        val postData =
            BaseRequestModel(
                A2ARequest(
                    validationWithinCabPostData.body,
                    srvID = "IntFund",
                    serviceIDValue = 0
                )
            )
        return safeApiCall(postData) {
            remoteDataSource.baseRequest(postData)
        }
    }


    suspend fun <T> getTransferWithinCab(
        withinCabTransferModel: WithinCabTransferModel
    ): Resource<T>? {
        val withinCabPostData = WithinCabPostData()
        withinCabPostData.apply {
            body.stepNumber = 3
            body.custProfile.cID = MemoryCacheImpl.getCustProfile()!!.cID
            body.custProfile.custID = MemoryCacheImpl.getCustProfile()!!.custID
            body.accounts.accountNumberFrom = withinCabTransferModel.fromAccountNumber
            body.accounts.accountNumberTo = withinCabTransferModel.toBeneficiaryAccount
            body.startDate = Date().formatToViewDateStamp()
            body.accounts.currencyFrom = withinCabTransferModel.fromCurrency
            body.accounts.currencyTo = withinCabTransferModel.toBeneficiaryCurrency
            body.accounts.amount = withinCabTransferModel.amount
            body.count = "-1"
            body.period = 0
            body.eDesc = betweenMyAccountEDesc
            body.aDesc = betweenMyAccountADesc
        }

        val postData =
            BaseRequestModel(
                A2ARequest(
                    withinCabPostData.body,
                    srvID = "IntFund",
                    serviceIDValue = 0
                )
            )
        return safeApiCall(postData) {
            remoteDataSource.baseRequest(postData)
        }
    }

    suspend fun <T> getValidationLocalBank(
        localBankModel: LocalBankModel
    ): Resource<T>? {
        val localBankValidationPostData = LocalBankValidationPostData()
        localBankValidationPostData.apply {
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

        val postData =
            BaseRequestModel(
                A2ARequest(
                    localBankValidationPostData.body,
                    srvID = "IntFund",
                    serviceIDValue = 0
                )
            )
        return safeApiCall(postData) {
            remoteDataSource.baseRequest(postData)
        }
    }

    suspend fun <T> getTransferLocalBank(
        localBankModel: LocalBankModel
    ): Resource<T>? {
        val localBankPostData = LocalBankPostData()
        localBankPostData.apply {
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
        val postData =
            BaseRequestModel(
                A2ARequest(
                    localBankPostData.body,
                    srvID = "IntFund",
                    serviceIDValue = 0
                )
            )
        return safeApiCall(postData) {
            remoteDataSource.baseRequest(postData)
        }
    }
}