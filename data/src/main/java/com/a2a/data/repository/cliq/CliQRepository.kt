package com.a2a.data.repository.cliq

import MemoryCacheImpl
import com.a2a.data.datasource.AppCash
import com.a2a.data.datasource.RemoteDataSource
import com.a2a.data.model.cliq.createProfile.AliasTypePostData
import com.a2a.data.model.cliq.GetCustomerPostData
import com.a2a.data.model.cliq.createProfile.FundsAccountPostData
import com.a2a.data.model.cliq.createProfile.ReactivateAccountPostData
import com.a2a.data.model.common.A2ARequest
import com.a2a.data.model.common.BaseRequestModel
import com.a2a.data.repository.BaseRepository
import com.a2a.network.Resource
import com.a2a.network.model.CustProfile
import com.google.gson.Gson
import java.util.*
import javax.inject.Inject

class CliQRepository @Inject constructor(
    private val remoteDataSource: RemoteDataSource
) : BaseRepository() {

    suspend fun <T> getCustomer(): Resource<T> {

        val body = GetCustomerPostData()

        body.apply {
            custID = MemoryCacheImpl.getCustProfile()?.custID ?: ""
            uValue = MemoryCacheImpl.getCustProfile()?.docNo ?: ""
            uType = "NID"
            requestType = "GetCust"

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


    suspend fun <T> reactivateAccount(): Resource<T> {

        val body = ReactivateAccountPostData()

        body.apply {
            custID = MemoryCacheImpl.getCustProfile()?.custID ?: ""
            requestType = "CustActivate"
            recordId = AppCash.cliQRecordId.toString()
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

    suspend fun <T> getAliasTypes(): Resource<T> {

        val body = AliasTypePostData()

        body.apply {
            custID = MemoryCacheImpl.getCustProfile()?.custID ?: ""
            lookUpName = "AliasType"
        }

        val postData = BaseRequestModel(
            A2ARequest(
                body,
                srvID = "GetLookUp"
            )
        )

        return safeApiCall(postData) {
            remoteDataSource.baseRequest(postData)
        }
    }

    suspend fun <T> getFundsAccounts(): Resource<T> {

        val body = FundsAccountPostData()

        body.apply {
            srvID = "ICLIQPay"
            custProfile = MemoryCacheImpl.getCustProfile() ?: CustProfile()
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
}

