package com.a2a.data.repository.cliq

import MemoryCacheImpl
import com.a2a.data.datasource.AppCash
import com.a2a.data.datasource.RemoteDataSource
import com.a2a.data.extentions.formatCliqDate
import com.a2a.data.model.accountlist.AccountListResponse
import com.a2a.data.model.cliq.createProfile.AliasTypePostData
import com.a2a.data.model.cliq.GetCustomerPostData
import com.a2a.data.model.cliq.createProfile.CliQRegistrationPostData
import com.a2a.data.model.cliq.createProfile.FundsAccountPostData
import com.a2a.data.model.cliq.createProfile.ReactivateAccountPostData
import com.a2a.data.model.cliq.sendMoney.SendMoneyPostData
import com.a2a.data.model.common.A2ARequest
import com.a2a.data.model.common.BaseRequestModel
import com.a2a.data.repository.BaseRepository
import com.a2a.network.Resource
import com.a2a.network.model.CustProfile
import com.google.gson.Gson
import java.util.*
import javax.inject.Inject

class CilQTransferRepository @Inject constructor(
    private val remoteDataSource: RemoteDataSource
) : BaseRepository() {

    suspend fun <T> proceedMoney(
        selectedAccount: AccountListResponse.A2AResponse.Body.Account,
        ibanNumber: String,
        amount : String,
        stepNumber : Int,
        aliasType : String,
        aliasValue : String
    ): Resource<T> {

        val body = SendMoneyPostData()

        body.apply {

            custProfile = MemoryCacheImpl.getCustProfile() ?: CustProfile()

            accountNumberFrom = selectedAccount.accountNumber
            this.amount = amount
            amt = amount
            cdtrAcct = selectedAccount.accountNumber
            cdtrName = MemoryCacheImpl.getCustProfile()?.eName ?: ""
            cdtrPstlAdr = MemoryCacheImpl.getCustProfile()?.address1 ?: ""
            cdtrRecordID = AppCash.cliQRecordId ?: ""
            curr = "JOD"
            currFrom = "JOD"
            currCodeTo = "JOD"
            custID = MemoryCacheImpl.getCustProfile()?.custID ?: ""
            dbtrAcct = ibanNumber
            dbtrIsIndvl = "true"
            dbtrAlias = aliasType
            dbtValue = aliasValue.toUpperCase() ?: ""
            fees = 0
            senderName = MemoryCacheImpl.getCustProfile()?.eName ?: ""
            senderPstlAdr = MemoryCacheImpl.getCustProfile()?.address1 ?: ""
            this.stepNumber = stepNumber
        }

        val postData = BaseRequestModel(
            A2ARequest(
                body,
                srvID = "ReqToPay"
            )
        )
        return safeApiCall(postData) {
            remoteDataSource.baseRequest(postData)
        }
    }
}

