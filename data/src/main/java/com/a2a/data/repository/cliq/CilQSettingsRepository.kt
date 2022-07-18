package com.a2a.data.repository.cliq

import com.a2a.data.constants.Constants
import com.a2a.data.datasource.AppCash
import com.a2a.data.datasource.RemoteDataSource
import com.a2a.data.model.cliq.AccountsPostData
import com.a2a.data.model.cliq.settings.*
import com.a2a.data.model.common.A2ARequest
import com.a2a.data.model.common.BaseRequestModel
import com.a2a.data.repository.BaseRepository
import com.a2a.network.Resource
import com.a2a.network.model.CustProfile
import javax.inject.Inject

class CilQSettingsRepository @Inject constructor(
    private val remoteDataSource: RemoteDataSource
) : BaseRepository() {

    suspend fun <T> getAccounts(): Resource<T> {

        val body = AccountsPostData()
        val currentCustProfile = MemoryCacheImpl.getCustProfile() ?: CustProfile()

        body.apply {
            requestType = "GetAcc"
            recordId = AppCash.cliQRecordId.toString()
            custID = currentCustProfile.custID
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


    suspend fun <T> getAccountsCliQ(): Resource<T> {

        val body = com.a2a.data.model.cliq.alias.GetAccountsPostData()
        val currentCustProfile = MemoryCacheImpl.getCustProfile() ?: CustProfile()

        body.apply {
            srvID = "ICLIQ"
            custProfile = currentCustProfile
        }

        val postData = BaseRequestModel(
            A2ARequest(
                body,
                srvID = "AccBal"
            )
        )
        return safeApiCall(postData) {
            remoteDataSource.baseRequest(postData)
        }
    }

    suspend fun <T> deleteCust(
    ): Resource<T> {

        val body = GetAccountsPostData()
        val currentCustProfile = MemoryCacheImpl.getCustProfile() ?: CustProfile()

        body.apply {
            requestType = "DeleteCust"
            uType = "NID"
            recordId = AppCash.cliQRecordId.toString()
            uValue = currentCustProfile.nationalityID
            custID = currentCustProfile.custID
            custProfile = currentCustProfile
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


    suspend fun <T> deleteAlias(
        currentAlias: Alias
    ): Resource<T> {

        val body = DeleteAliasPostData()
        val currentCustProfile = MemoryCacheImpl.getCustProfile() ?: CustProfile()

        body.apply {
            requestType = "DeleteAlias"
            uType = "NID"
            alias.recordId = currentAlias.recordId
            recordId = AppCash.cliQRecordId.toString()
            uValue = currentCustProfile.nationalityID
            custID = currentCustProfile.custID
            custProfile = currentCustProfile
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

    suspend fun <T> suspendCust(): Resource<T> {

        val body = GetAccountsPostData()
        val currentCustProfile = MemoryCacheImpl.getCustProfile() ?: CustProfile()

        body.apply {
            requestType = "CustSuspend"
            uType = "NID"
            recordId = AppCash.cliQRecordId.toString()
            uValue = currentCustProfile.nationalityID
            custID = currentCustProfile.custID
            custProfile = currentCustProfile
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

    suspend fun <T> suspendAlias(
        currentAlias: Alias,
        currentRequestType: String
    ): Resource<T> {

        val body = DeleteAliasPostData()
        val currentCustProfile = MemoryCacheImpl.getCustProfile() ?: CustProfile()

        body.apply {
            requestType = currentRequestType
            uType = "NID"
            alias.recordId = currentAlias.recordId
            recordId = AppCash.cliQRecordId.toString()
            uValue = currentCustProfile.nationalityID
            custID = currentCustProfile.custID
            custProfile = currentCustProfile
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

    suspend fun <T> addAndUpdateAliasAccount(
        currentAccount: CliQAccount,
        currentAlias: Alias,
        requestType: String,
        isAccountChanges: Boolean
    ): Resource<T> {

        val body = AddAliasPostData()
        val currentCustProfile = MemoryCacheImpl.getCustProfile() ?: CustProfile()

        body.apply {
            currentAccount.custId = currentCustProfile.custID

            when (requestType) {
                Constants.RequestType.EditAlias.type -> {
                    updateAlias = isAccountChanges
                    UpdateAccount = false
                    addAlias = false
                    addAccount = false
                    Account = currentAccount
                }
                Constants.RequestType.EditAccount.type -> {
                    UpdateAccount = isAccountChanges
                    addAlias = false
                    updateAlias = false
                    addAccount = false
                    Account = currentAccount
                }
                Constants.RequestType.AddAccount.type -> {
                    addAccount = true
                    UpdateAccount = false
                    addAlias = false
                    updateAlias = false
                    Account = currentAccount
                }
                Constants.RequestType.AddAlias.type -> {
                    addAlias = true
                    UpdateAccount = false
                    addAccount = false
                    updateAlias = false
                    Account = currentAccount
                }
            }

            Alias = currentAlias
            Alias.type = currentAlias.eValue
            cust.recordId = AppCash.cliQRecordId.toString()
            custProfile = currentCustProfile
            branchCode = currentCustProfile.branch
        }

        val postData = BaseRequestModel(
            A2ARequest(
                body,
                srvID = "AddAlias"
            )
        )
        return safeApiCall(postData) {
            remoteDataSource.baseRequest(postData)
        }
    }

    suspend fun <T> addAndUpdateAccount(
        currentAccount: AddAccountResponse.Account,
        currentAlias: AddAccountResponse.Alias.Alias,
        requestType: String,
        isAccountChanges: Boolean
    ): Resource<T> {

        val body = AddAccountResponse()
        val currentCustProfile = MemoryCacheImpl.getCustProfile() ?: CustProfile()

        body.apply {

            when (requestType) {

                Constants.RequestType.EditAccount.type -> {
                    updateAccount = isAccountChanges
                    addAlias = false
                    updateAlias = false
                    addAccount = false
                }
                Constants.RequestType.AddAccount.type -> {
                    addAccount = true
                    updateAccount = false
                    addAlias = false
                    updateAlias = false
                }
            }

            alias.alias = currentAlias
            account = currentAccount
            cust.recordId = AppCash.cliQRecordId.toString()
            branchCode = currentCustProfile.branch
        }

        val postData = BaseRequestModel(
            A2ARequest(
                body,
                srvID = "AddAlias"
            )
        )
        return safeApiCall(postData) {
            remoteDataSource.baseRequest(postData)
        }
    }

    suspend fun <T> deleteAccount(
        currentAccount: CliQAccount,
    ): Resource<T> {

        val body = DeleteAccountsPostData()
        val currentCustProfile = MemoryCacheImpl.getCustProfile() ?: CustProfile()

        body.apply {
            requestType = "DeleteAccount"
            recordId = currentAccount.recordId
            custProfile = currentCustProfile
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

    suspend fun <T> getAlias(): Resource<T> {

        val body = GetAliasPostData()
        val currentCustProfile = MemoryCacheImpl.getCustProfile() ?: CustProfile()

        body.apply {
            requestType = "GetAlias"
            recordId = AppCash.cliQRecordId.toString()
            custID = currentCustProfile.custID
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

