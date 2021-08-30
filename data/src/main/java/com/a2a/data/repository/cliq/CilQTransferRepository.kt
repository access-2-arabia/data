package com.a2a.data.repository.cliq

import MemoryCacheImpl
import com.a2a.data.datasource.AppCash
import com.a2a.data.datasource.RemoteDataSource
import com.a2a.data.model.accountlist.AccountListResponse.A2AResponse.Body.Account
import com.a2a.data.model.cliq.sendMoney.CliQRequestMoneyPostData
import com.a2a.data.model.cliq.sendMoney.CliQSendMoneyPostData
import com.a2a.data.model.common.A2ARequest
import com.a2a.data.model.common.BaseRequestModel
import com.a2a.data.repository.BaseRepository
import com.a2a.network.Resource
import com.a2a.network.model.CustProfile
import javax.inject.Inject

class CilQTransferRepository @Inject constructor(
    private val remoteDataSource: RemoteDataSource
) : BaseRepository() {

    suspend fun <T> sendMoney(
        name: String,
        surName: String,
        aliasType: String,
        aliasValue: String,
        bic: String,
        ibanNumber: String,
        address: String,
        paymentPurpose: String,
        amount: String,
        stepNumber: Int,
        accountNumber: Account
    ): Resource<T> {


        val cliQSendMoneyPostData = CliQSendMoneyPostData()
        if (name.isNullOrEmpty() && surName.isNullOrEmpty())
            cliQSendMoneyPostData.cdtrName = ""
        else
            cliQSendMoneyPostData.cdtrName = "$name  $surName"
        cliQSendMoneyPostData.custIDTO = ""
        cliQSendMoneyPostData.cdtrIsIndvl = ""
        cliQSendMoneyPostData.cdtrMCC = ""
        cliQSendMoneyPostData.dbtrAlias = ""
        cliQSendMoneyPostData.cdtrAlias = aliasType
        cliQSendMoneyPostData.cdtrValue = aliasValue.toUpperCase()
        cliQSendMoneyPostData.cdtrBic = bic
        cliQSendMoneyPostData.cdtrAcct = ibanNumber
        cliQSendMoneyPostData.cdtrPstlAdr = address
        cliQSendMoneyPostData.ctgyPurp = paymentPurpose
        cliQSendMoneyPostData.amt = amount
        cliQSendMoneyPostData.amount = amount
        cliQSendMoneyPostData.cdtrRecordID = ""
        cliQSendMoneyPostData.dbtrMCC = ""
        cliQSendMoneyPostData.dbtrRecordID = AppCash.cliQRecordId ?: ""
        cliQSendMoneyPostData.dbtrAcct = accountNumber.accountNumber
        cliQSendMoneyPostData.qRFlag = "false"
        cliQSendMoneyPostData.curr = accountNumber.currencyISOCode
        cliQSendMoneyPostData.stepNumber = stepNumber
        cliQSendMoneyPostData.dbtrName =
            MemoryCacheImpl.getCustProfile()?.eName ?: ""
        cliQSendMoneyPostData.fees = 0
        cliQSendMoneyPostData.dbtrPstlAdr =
            MemoryCacheImpl.getCustProfile()?.address1 ?: ""
        cliQSendMoneyPostData.currFrom = accountNumber.currencyISOCode
        cliQSendMoneyPostData.dbtrIsIndvl = "true"
        cliQSendMoneyPostData.custID =
            MemoryCacheImpl.getCustProfile()?.custID ?: ""
        cliQSendMoneyPostData.currCodeTo = "JOD"
        cliQSendMoneyPostData.QRAddLangTemp = ""
        cliQSendMoneyPostData.QRTaxId = ""
        cliQSendMoneyPostData.benAccIBAN = accountNumber.iBAN

        cliQSendMoneyPostData.custProfile = MemoryCacheImpl.getCustProfile()!!
        val postData = BaseRequestModel(
            A2ARequest(
                cliQSendMoneyPostData,
                srvID = "ICLIQPay"
            )
        )
        return safeApiCall(postData) {
            remoteDataSource.baseRequest(postData)
        }
    }

    suspend fun <T> sendMoney(
        aliasType: String,
        aliasValue: String,
        ibanNumber: String,
        amount: String,
        stepNumber: Int,
        selectedAccount: Account
    ): Resource<T> {

        val requestMoneyPostData = CliQRequestMoneyPostData()
        requestMoneyPostData.apply {
            custID = MemoryCacheImpl.getCustProfile()?.custID ?: ""
            amt = amount
            cdtrAcct = selectedAccount.accountNumber
            this.amount = amount
            cdtrName = MemoryCacheImpl.getCustProfile()?.eName ?: ""
            cdtrRecordID = AppCash.cliQRecordId ?: ""
            curr = "JOD"
            dbtrAlias = aliasType ?: ""
            dbtValue = aliasValue?.toUpperCase() ?: ""
            fees = 0
            custID = MemoryCacheImpl.getCustProfile()?.custID ?: ""
            currFrom = "JOD"
            currCodeTo = "JOD"
            dbtrIsIndvl = "true"
            senderName = MemoryCacheImpl.getCustProfile()?.eName ?: ""
            senderPstlAdr = MemoryCacheImpl.getCustProfile()?.address1 ?: ""
            dbtrAcct = ibanNumber
            this.stepNumber = stepNumber
            custProfile = MemoryCacheImpl.getCustProfile()?: CustProfile()
            benAccIBAN = selectedAccount.iBAN
        }

        val postData = BaseRequestModel(
            A2ARequest(
                requestMoneyPostData,
                srvID = "ReqToPay"
            )
        )
        return safeApiCall(postData) {
            remoteDataSource.baseRequest(postData)
        }
    }
}

