package com.a2a.data.repository

import MemoryCacheImpl
import com.a2a.data.datasource.RemoteDataSource
import com.a2a.data.model.accounts.AccountTransactionPostData
import com.a2a.data.model.accounts.FilterTransaction
import com.a2a.data.model.accounts.GetAccountsPostData
import com.a2a.data.model.common.A2ARequest
import com.a2a.data.model.common.BaseRequest
import com.a2a.data.model.loans.RequestLoanPostData
import com.a2a.network.Resource
import com.a2a.network.model.CustProfile
import javax.inject.Inject


class LoansRepository @Inject constructor(
    private val remoteDataSource: RemoteDataSource
) : BaseRepository() {

    suspend fun <T> requestLoan(requestData: RequestLoanPostData.Request): Resource<T> {
        val postData = RequestLoanPostData()

        postData.apply {
            custProfile = MemoryCacheImpl.getCustProfile() ?: CustProfile()
            request = requestData
        }

        val request = BaseRequest(A2ARequest(postData, srvId = "LoanReq"))
        return safeApiCall(request) {
            remoteDataSource.baseRequest(request)
        }
    }


}

