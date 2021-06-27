package com.a2a.data.repository.accounts

import MemoryCacheImpl
import com.a2a.data.constants.Constants
import com.a2a.data.datasource.RemoteDataSource
import com.a2a.data.extentions.formatToViewTimeStamp
import com.a2a.data.model.accountlist.AccountListPostData
import com.a2a.data.repository.BaseRepository
import com.a2a.network.Resource
import java.util.*
import javax.inject.Inject

class AccountsRepository @Inject constructor(
    private val remoteDataSource: RemoteDataSource
) : BaseRepository() {

    suspend fun <T> getAccountsList(): Resource<T>? {
        val postData = AccountListPostData()
        postData.apply {
            a2ARequest?.apply {
                header?.apply {
                    bankCode = Constants.BankCode
                    regionCode = Constants.RegionCode
                    srvID = "Login"
                    serviceID = 3287
                    methodName = ""
                    userID = Constants.UserID
                    password = Constants.Password
                    channel = Constants.Channel
                    timeStamp = Date().formatToViewTimeStamp()
                    guidID = Constants.GuidID
                    deviceID = Constants.DeviceID
                }

                a2ARequest?.body?.apply {
                    custProfile.cID = MemoryCacheImpl.getCustProfile()!!.cID
                    custProfile.custID = MemoryCacheImpl.getCustProfile()!!.custID
                    custProfile.repID = MemoryCacheImpl.getCustProfile()!!.repID
                    custProfile.custMnemonic = MemoryCacheImpl.getCustProfile()!!.custMnemonic
                    custProfile.custType = MemoryCacheImpl.getCustProfile()!!.custType
                    branchCode = MemoryCacheImpl.getCustProfile()!!.branch
                }
                a2ARequest?.footer?.apply {
                    signature = ""
                }
            }
        }
        return safeApiCall(postData) {
            remoteDataSource.baseRequest(postData)

        }
    }


}