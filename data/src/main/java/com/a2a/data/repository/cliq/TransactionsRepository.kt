package com.a2a.data.repository.cliq

import com.a2a.data.datasource.RemoteDataSource
import com.a2a.data.model.cliq.GetCustomerPostData
import com.a2a.data.model.cliq.transactions.*
import com.a2a.data.model.common.A2ARequest
import com.a2a.data.model.common.BaseRequestModel
import com.a2a.data.repository.BaseRepository
import com.a2a.network.Resource
import com.a2a.network.model.CustProfile
import javax.inject.Inject

class TransactionsRepository @Inject constructor(
    private val remoteDataSource: RemoteDataSource
) : BaseRepository() {

    suspend fun <T> getTransactionsHistory(
        serviceName: String,
        status: String,
        newDateFrom: String,
        newDateTo: String,
        newLastTrxNo: String
    ): Resource<T> {

        val body = HistoryPostData()

        body.apply {
            requestType = "TrxList"
            custProfile = MemoryCacheImpl.getCustProfile() ?: CustProfile()
            custID = MemoryCacheImpl.getCustProfile()?.custID ?: ""
            trxDir = serviceName
            trxStatus = status
            dateFrom = newDateFrom
            dateTo = newDateTo
            lastTrxNo = newLastTrxNo
        }

        val postData = BaseRequestModel(
            A2ARequest(
                body,
                srvID = "ICLIQ"
            )
        )
        return safeApiCall(postData) {
            remoteDataSource.baseRequest(postData)
        }
    }

    suspend fun <T> sendConfirmation(
        msgIdValue: String,
        requestTypeValue: String
    ): Resource<T> {

        val body = SendConfirmPostData()

        body.apply {
            requestType = requestTypeValue
            msgId = msgIdValue
            custID = MemoryCacheImpl.getCustProfile()?.custID ?: ""
        }

        val postData = BaseRequestModel(
            A2ARequest(
                body,
                srvID = "ICLIQ"
            )
        )
        return safeApiCall(postData) {
            remoteDataSource.baseRequest(postData)
        }
    }

    suspend fun <T> returnPayment(
        amountValue: String,
        originMessage: String,
        transactionData: TrxDetail
    ): Resource<T> {

        val body = ReturnPaymentPostData()

        body.apply {
            custProfile = MemoryCacheImpl.getCustProfile() ?: CustProfile()
            orgnlMsgId = originMessage
            isDispute = "false"
            disputeRefNo = ""
            rtrnReason = "WRAM"
            rtrnAddInfo = "Wrong Amount"
            cdtrAcct = transactionData.cdtrAcct
            dbtrAcct = transactionData.dbtrAcct
            dbtrName = transactionData.dbtrName
            dbtrAddr = transactionData.dbtrAddr
            dbtrMCC = transactionData.dbtrMCC
            dbtrAgt = transactionData.dbtrAgt
            dbtrRecordID = transactionData.dbtrRecordID
            dbtrAlias = transactionData.dbtrAlias

            amount = amountValue
        }

        val postData = BaseRequestModel(
            A2ARequest(
                body,
                srvID = "RTNPayment"
            )
        )
        return safeApiCall(postData) {
            remoteDataSource.baseRequest(postData)
        }
    }
}

