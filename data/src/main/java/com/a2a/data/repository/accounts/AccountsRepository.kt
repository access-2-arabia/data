package com.a2a.data.repository.accounts

import MemoryCacheImpl
import com.a2a.data.constants.Constants
import com.a2a.data.datasource.RemoteDataSource
import com.a2a.data.model.accountlist.*
import com.a2a.data.model.common.A2ARequest
import com.a2a.data.model.common.BaseRequestModel
import com.a2a.data.model.logout.LogoutPostData
import com.a2a.data.repository.BaseRepository
import com.a2a.network.Resource
import com.a2a.network.model.CustProfile
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
                    srvID = "Pref",
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
                srvID = "Pref",
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
            stepNumber = 3
            custProfile = MemoryCacheImpl.getCustProfile() ?: CustProfile()
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

    suspend fun <T> logout(): Resource<T> {

        val body = LogoutPostData()

        val currentCustProfile = MemoryCacheImpl.getCustProfile()


        body.apply {
            if (currentCustProfile != null) {
                custProfile.cID = currentCustProfile.cID
                custProfile.custID = currentCustProfile.custID
            }
        }

        val postData = BaseRequestModel(
            A2ARequest(
                body,
                srvID = "Logout"
            )
        )
        return safeApiCall(postData) {
            remoteDataSource.baseRequest(postData)
        }
    }

    suspend fun <T> showHideAccounts(selectedAccounts: List<AccountListResponse.A2AResponse.Body.Account>): Resource<T> {
        val body = ShowHidePostData()

        body.apply {
            stepNumber = 3
            custProfile = MemoryCacheImpl.getCustProfile() ?: CustProfile()
            accounts = selectedAccounts
        }
        val postData = BaseRequestModel(
            A2ARequest(
                body,
                srvID = "Pref"
            )
        )
        return safeApiCall(postData) {
            remoteDataSource.baseRequest(postData)
        }
    }
}