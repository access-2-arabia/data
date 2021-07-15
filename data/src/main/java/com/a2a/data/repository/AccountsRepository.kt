package com.a2a.data.repository

import MemoryCacheImpl
import com.a2a.data.datasource.RemoteDataSource
import com.a2a.data.model.accounts.AccountTransactionPostData
import com.a2a.data.model.accounts.FilterTransaction
import com.a2a.data.model.accounts.GetAccountsPostData
import com.a2a.data.model.common.A2ARequest
import com.a2a.data.model.common.BaseRequest
import com.a2a.network.Resource
import com.a2a.network.model.CustProfile
import javax.inject.Inject


class AccountsRepository @Inject constructor(
    private val remoteDataSource: RemoteDataSource
) : BaseRepository() {


    suspend fun <T> getAccountTransaction(filterAccount: FilterTransaction): Resource<T> {
        val postData = AccountTransactionPostData()
        postData.custProfile = MemoryCacheImpl.getCustProfile() ?: CustProfile()
        postData.account.apply {
            accountNumber = filterAccount.accountNumber
            dateFrom = filterAccount.dateFrom
            dateTo = filterAccount.dateTo
            filterBy = filterAccount.filteredBy
            transactionCount = filterAccount.transactionCount.toString()
            transactionType = filterAccount.transactionType
            amountType = filterAccount.amountType
            fromAmount = filterAccount.amountFrom.toString()
            toAmount = filterAccount.amountTo.toString()
        }

        val request = BaseRequest(A2ARequest(postData, srvId = "LastNTrans"))
        return safeApiCall(request) {
            remoteDataSource.baseRequest(request)
        }
    }

    suspend fun <T> getAccounts(serviceId: String): Resource<T> {
        val postData = GetAccountsPostData()
        postData.custProfile = MemoryCacheImpl.getCustProfile() ?: CustProfile()
        postData.serviceId = serviceId

        val request = BaseRequest(A2ARequest(postData, srvId = "AccBal"))
        return safeApiCall(request) {
            remoteDataSource.baseRequest(request)
        }
    }

}

