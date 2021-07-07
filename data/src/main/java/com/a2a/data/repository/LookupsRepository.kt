package com.a2a.data.repository

import com.a2a.data.datasource.RemoteDataSource
import com.a2a.data.model.LookUpPostData
import com.a2a.data.model.common.A2ARequest
import com.a2a.data.model.common.BaseRequest
import com.a2a.network.Resource
import javax.inject.Inject


class LookupsRepository @Inject constructor(
    private val remoteDataSource: RemoteDataSource
) : BaseRepository() {


    suspend fun <T> getLookUps(): Resource<T> {
        val postData = LookUpPostData()
        postData.apply {
            lookUpName =
                "passwordComplexity,TermsCondition,ContactUs,DocumentType,Country,RecurringType," +
                        "Branch,MailServices,eMailCategory,SecInstraction,Currency,IntRatePeriod,ThemeColor,Help," +
                        "MaritalStatus,TrxDir,TrxStatus,TransfarePurpose,ChequeBookPages,ChequeBookNo,ChequeBookStopReason," +
                        "DebitCardStopReason,AliasType,Banks,TransferPurpose,RtpRejectReason,ATM,CurrencyIntrest,TRXDir,TRXStatus," +
                        "SecurityTips,ContactTime,CardType,Period,LoanType,CustRequest,PendingCustRequest,BankProducts"
        }

        val request = BaseRequest(
            A2ARequest(
                postData,
                srvId = "GetLookUp"
            )
        )
        return safeApiCall(request) {
            remoteDataSource.baseRequest(request)
        }
    }

    suspend fun <T> getNearestLocator(lang: Double, lat: Double): Resource<T> {
        val postData = LookUpPostData()
        postData.apply {
            lookUpName =
                "ATM,Branch"
            locX = lang
            locY = lat
        }
        val request = BaseRequest(
            A2ARequest(
                postData,
                srvId = "GetLookUp"
            )
        )
        return safeApiCall(request) {
            remoteDataSource.baseRequest(request)
        }
    }


}

