package com.a2a.data.repository

import com.a2a.data.datasource.RemoteDataSource
import com.a2a.network.Resource
import javax.inject.Inject


class AuthenticationRepository @Inject constructor(
    private val remoteDataSource: RemoteDataSource
) : BaseRepository() {




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

