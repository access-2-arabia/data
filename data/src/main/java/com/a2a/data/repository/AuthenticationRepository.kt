package com.a2a.data.repository

import com.a2a.data.datasource.RemoteDataSource
import com.a2a.data.model.LookUpPostData
import com.a2a.data.model.authentication.LoginPostData
import com.a2a.network.Resource
import javax.inject.Inject


class AuthenticationRepository @Inject constructor(
    private val remoteDataSource: RemoteDataSource
) : BaseRepository() {


    suspend fun <T> doLogin(
        password: String,
        customerId: String,
        isBiometric: Boolean,
    ): Resource<T> {
        val postData = LoginPostData()
        postData.a2ARequest.apply {
            if (!isBiometric) {
                body.custProfile.pWD = password
                body.custProfile.custMnemonic = customerId
            } else {
                body.custProfile.pWD = null
                body.custProfile.custMnemonic = null
            }
            body.custProfile.lWTD = isBiometric
            header.srvID = "Login"
        }
        return safeApiCall(postData) { remoteDataSource.baseRequest(postData) }
    }

    suspend fun <T> getLookUps(): Resource<T> {
        val postData = LookUpPostData()
        postData.apply {
            a2ARequest.body.lookUpName =
                "passwordComplexity,TermsCondition,ContactUs,DocumentType,Country,RecurringType," +
                        "Branch,MailServices,eMailCategory,SecInstraction,Currency,IntRatePeriod,ThemeColor,Help," +
                        "MaritalStatus,TrxDir,TrxStatus,TransfarePurpose,ChequeBookPages,ChequeBookNo,ChequeBookStopReason," +
                        "DebitCardStopReason,AliasType,Banks,TransferPurpose,RtpRejectReason,ATM,CurrencyIntrest,TRXDir,TRXStatus," +
                        "SecurityTips,ContactTime,CardType,Period,LoanType,CustRequest,PendingCustRequest"
            a2ARequest.header.srvID = "GetLookUp"
        }
        return safeApiCall(postData) { remoteDataSource.baseRequest(postData) }
    }
}

