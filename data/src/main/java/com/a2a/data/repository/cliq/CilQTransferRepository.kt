package com.a2a.data.repository.cliq

import MemoryCacheImpl
import com.a2a.data.datasource.AppCash
import com.a2a.data.datasource.RemoteDataSource
import com.a2a.data.extentions.formatCliqDate
import com.a2a.data.model.accountlist.AccountListResponse
import com.a2a.data.model.beneficiary.GetManageBeneficiariesInOutResponse
import com.a2a.data.model.cliq.createProfile.AliasTypePostData
import com.a2a.data.model.cliq.GetCustomerPostData
import com.a2a.data.model.cliq.createProfile.CliQRegistrationPostData
import com.a2a.data.model.cliq.createProfile.FundsAccountPostData
import com.a2a.data.model.cliq.createProfile.ReactivateAccountPostData
import com.a2a.data.model.cliq.sendMoney.SendMoneyPostData
import com.a2a.data.model.common.A2ARequest
import com.a2a.data.model.common.BaseRequestModel
import com.a2a.data.model.lookup.LookUpResponse
import com.a2a.data.repository.BaseRepository
import com.a2a.network.Resource
import com.a2a.network.model.CustProfile
import com.google.gson.Gson
import kotlinx.coroutines.selects.select
import java.util.*
import javax.inject.Inject

class CilQTransferRepository @Inject constructor(
    private val remoteDataSource: RemoteDataSource
) : BaseRepository() {

    suspend fun <T> proceedMoney(
        isSendPayment: Boolean,
        isExisting: Boolean,
        isIban: Boolean,
        selectedAccount: AccountListResponse.A2AResponse.Body.Account,
        selectedBeneficiary: GetManageBeneficiariesInOutResponse.A2AResponse.Body.BeneficiaryIn,
        purpose: LookUpResponse.A2AResponse.Body.TransferPurpose,
        ibanNumber: String,
        amount: String,
        stepNumber: Int,
        aliasType: String,
        aliasValue: String
    ): Resource<T> {

        val body = SendMoneyPostData()

        body.apply {

            custProfile = MemoryCacheImpl.getCustProfile() ?: CustProfile()
            curr = selectedAccount.currencyISOCode
            amt = amount
            custID = custProfile.custID
            this.stepNumber = stepNumber
            dbtrIsIndvl = if (custProfile.custType == 0) "true" else "false"
            this.amount = amount
            dbtrRecordID = AppCash.cliQRecordId.toString()
            currCodeTo = selectedAccount.currencyISOCode
            currFrom = selectedAccount.currencyISOCode

            if (isSendPayment) {
                if (isExisting) {
                    dbtrAcct = selectedAccount.accountNumber
                    ctgyPurp = purpose.eValue
                    dbtrName = custProfile.eNameShort
                    dbtrPstlAdr = custProfile.address1

                    cdtrAcct = selectedBeneficiary.clientAccNo
                    cdtrValue = selectedBeneficiary.clientAccNo
                    cdtrName = selectedBeneficiary.iD.toString()
                    cdtrPstlAdr = selectedBeneficiary.address
                    cdtrAlias = selectedBeneficiary.aliasType
                    cdtrBic = selectedBeneficiary.bankCode

                } else {
                    dbtrAcct = selectedAccount.accountNumber
                    ctgyPurp = purpose.eValue
                    dbtrName = custProfile.eNameShort
                    dbtrPstlAdr = custProfile.address1

                    if (isIban) {
                        cdtrAcct = ibanNumber
                        cdtrValue = ibanNumber
                        cdtrName = selectedBeneficiary.iD.toString()
                        cdtrPstlAdr = selectedBeneficiary.address
                        cdtrAlias = selectedBeneficiary.aliasType
                        cdtrBic = selectedBeneficiary.bankCode
                    } else {
                        cdtrAlias = aliasType
                        cdtrValue = aliasValue

                        // test
//                        cdtrName = selectedBeneficiary.iD.toString()
//                        cdtrPstlAdr = selectedBeneficiary.address
//                        cdtrBic = selectedBeneficiary.bankCode
                    }
                }
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
}

