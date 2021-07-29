package com.a2a.data.repository.accounts

import MemoryCacheImpl
import com.a2a.data.constants.Constants
import com.a2a.data.datasource.RemoteDataSource
import com.a2a.data.model.accountlist.AccountListPostData
import com.a2a.data.model.accountlist.ChangeNicknamePostData
import com.a2a.data.model.accountlist.EStatementPostData
import com.a2a.data.model.common.A2ARequest
import com.a2a.data.model.common.BaseRequestModel
import com.a2a.data.repository.BaseRepository
import com.a2a.network.Resource
import javax.inject.Inject

class AccountsRepository @Inject constructor(
    private val remoteDataSource: RemoteDataSource
) : BaseRepository() {

    suspend fun <T> getAccountsList(): Resource<T>? {
        val accountPostData = AccountListPostData()
        accountPostData.apply {
            body.custProfile = MemoryCacheImpl.getCustProfile()!!
            body.branchCode = Constants.BankCode
        }
        val postData =
            BaseRequestModel(
                A2ARequest(
                    accountPostData.body,
                    srvID = "DashBoard",
                    serviceIDValue = 0
                )
            )
        return safeApiCall(postData) {
            remoteDataSource.baseRequest(postData)
        }
    }

    suspend fun <T> requestEStatement(accountNumber: String): Resource<T>? {
        val accountPostData = EStatementPostData()
        accountPostData.apply {
            accounts.custID = MemoryCacheImpl.getCustProfile()?.custID ?: ""
            accounts.accountNumber = accountNumber


        }
        val postData = BaseRequestModel(
            A2ARequest(
                accountPostData,
                srvID = "ReqEStatmt",
                serviceIDValue = 0
            )
        )
        return safeApiCall(postData) {
            remoteDataSource.baseRequest(postData)
        }
    }

    suspend fun <T> changeNickname(accountNumber: String, description: String): Resource<T>? {
        val accountPostData = ChangeNicknamePostData()
        val account = ChangeNicknamePostData.Account()
        account.accountNumber = accountNumber
        account.description = description
        account.enabled = "Yes"

        val listAccount: List<ChangeNicknamePostData.Account> = listOf(account)
        accountPostData.apply {
            cID = MemoryCacheImpl.getCustProfile()?.cID ?: 0
            stepNumber = 3
            custProfile.cID = MemoryCacheImpl.getCustProfile()?.cID ?: 0
            custProfile.rID = MemoryCacheImpl.getCustProfile()?.rID ?: 0
            accountPostData.accounts = listAccount
        }

        val postData = BaseRequestModel(
            A2ARequest(
                accountPostData,
                srvID = "Pref",
                serviceIDValue = 0
            )
        )
        return safeApiCall(postData) {
            remoteDataSource.baseRequest(postData)
        }
    }


}