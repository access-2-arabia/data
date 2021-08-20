package com.a2a.data.repository.cliq

import com.a2a.data.datasource.RemoteDataSource
import com.a2a.data.model.cliq.GetCustomerPostData
import com.a2a.data.model.cliq.transactions.HistoryPostData
import com.a2a.data.model.common.A2ARequest
import com.a2a.data.model.common.BaseRequestModel
import com.a2a.data.repository.BaseRepository
import com.a2a.network.Resource
import javax.inject.Inject

class TransactionsRepository @Inject constructor(
    private val remoteDataSource: RemoteDataSource
) : BaseRepository() {

    suspend fun <T> getTransactionsHistory(
        serviceName: String,
        status: String,
        newDateFrom: String,
        newDateTo: String,
        newLastTrxNo:String
    ): Resource<T> {

        val body = HistoryPostData()

        body.apply {
            requestType = "TrxList"
            custProfile = MemoryCacheImpl.getCustProfile()!!
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
}

