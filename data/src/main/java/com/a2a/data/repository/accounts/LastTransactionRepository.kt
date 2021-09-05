package com.a2a.data.repository.accounts

import MemoryCacheImpl
import com.a2a.data.constants.Constants
import com.a2a.data.datasource.RemoteDataSource
import com.a2a.data.extentions.formatToViewTimeStamp
import com.a2a.data.model.common.A2ARequest
import com.a2a.data.model.common.BaseRequestModel
import com.a2a.data.model.lasttransaction.LastTransactionPostData
import com.a2a.data.repository.BaseRepository
import com.a2a.network.Resource
import java.util.*
import javax.inject.Inject

class LastTransactionRepository @Inject constructor(
    private val remoteDataSource: RemoteDataSource,
) : BaseRepository() {

    suspend fun <T> getLastTransactionList(
        accountNumber: String,
        toDate: String = "23/06/2021",
        fromDate: String = "23/12/2020",
        numberOfTransactions: String = "10"
    ): Resource<T>? {
        val lastTransactionRepository = LastTransactionPostData()
        lastTransactionRepository.apply {
            body.account.accountNumber = accountNumber
            body.branchCode = MemoryCacheImpl.getCustProfile()!!.branch
            body.custID = MemoryCacheImpl.getCustProfile()!!.custID
            body.dateFrom = fromDate
            body.dateTo = toDate
            body.indexTo = numberOfTransactions
            body.transType = "A"
        }

        val postData =
            BaseRequestModel(
                A2ARequest(
                    lastTransactionRepository.body,
                    srvID = "LastNTrans",
                    serviceIDValue = 0
                )
            )
        return safeApiCall(postData) {
            remoteDataSource.baseRequest(postData)
        }
    }


}