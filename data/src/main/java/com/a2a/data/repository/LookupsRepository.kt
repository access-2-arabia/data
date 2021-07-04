package com.a2a.data.repository

import com.a2a.data.datasource.RemoteDataSource
import com.a2a.data.model.LookUpPostData
import com.a2a.network.Resource
import javax.inject.Inject


class LookupsRepository @Inject constructor(
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
                        "SecurityTips,ContactTime,CardType,Period,LoanType,CustRequest,PendingCustRequest,BankProducts"

            a2ARequest.header.srvID = "GetLookUp"

        }
        return safeApiCall(postData) { remoteDataSource.baseRequest(postData) }
    }
 suspend fun <T> getNearestLocator(lang: Double, lat: Double): Resource<T> {
        val postData = LookUpPostData()
        postData.apply {
            a2ARequest.body.lookUpName =
                "ATM,Branch"
            a2ARequest.body.locX = lang
            a2ARequest.body.locY = lat
            a2ARequest.header.srvID = "GetLookUp"

        }
        return safeApiCall(postData) { remoteDataSource.baseRequest(postData) }
    }


}

