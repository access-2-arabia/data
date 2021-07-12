package com.a2a.data.repository.accounts

import com.a2a.data.accountDetails.AccountDetailsPostData
import com.a2a.data.constants.Constants
import com.a2a.data.datasource.RemoteDataSource
import com.a2a.data.model.accountlist.AccountListPostData
import com.a2a.data.model.common.A2ARequest
import com.a2a.data.model.common.BaseRequestModel
import com.a2a.data.repository.BaseRepository
import com.a2a.network.Resource
import javax.inject.Inject

class AccountsDetailsRepository @Inject constructor(
    private val remoteDataSource: RemoteDataSource
) : BaseRepository() {

    suspend fun <T> getAccountDetails(accountNumberValue: String): Resource<T>? {
        val accountPostData = AccountDetailsPostData()
        accountPostData.apply {
            body.stepNumber = 7
            body.accountNumber = MemoryCacheImpl.getCustProfile()!!.custMnemonic
            body.accountNumber = accountNumberValue
            body.branchCode = Constants.BankCode
        }
        val postData =
            BaseRequestModel(
                A2ARequest(
                    accountPostData.body,
                    srvID = "MngBenf",
                    serviceIDValue = 0
                )
            )

        return safeApiCall(postData) {
            remoteDataSource.baseRequest(postData)

        }
    }
}