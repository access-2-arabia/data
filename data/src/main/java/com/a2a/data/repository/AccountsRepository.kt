package com.a2a.data.repository

import MemoryCacheImpl
import com.a2a.data.datasource.RemoteDataSource
import com.a2a.data.model.GetAccountDetailsPostData
import com.a2a.data.model.common.A2ARequest
import com.a2a.data.model.common.BaseRequest
import com.a2a.data.utility.SrvID
import com.a2a.network.Resource
import com.a2a.network.model.CustProfile
import javax.inject.Inject


class AccountsRepository @Inject constructor(
    private val remoteDataSource: RemoteDataSource
) : BaseRepository() {


    suspend fun <T> updateAccountDetails(
        account: GetAccountDetailsPostData.Accounts,
        language: Int
    ): Resource<T> {
        val postData = GetAccountDetailsPostData()
        postData.apply {
            custProfile = MemoryCacheImpl.getCustProfile() ?: CustProfile()
            accounts = account
            lang = language
        }
        val request = BaseRequest(A2ARequest(srvId = SrvID.UPDATE_ACCOUNT_DETAILS, body = postData))
        return safeApiCall(request) { remoteDataSource.baseRequest(request) }
    }
}

