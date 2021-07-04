package com.a2a.data.repository.accounts

import MemoryCacheImpl
import com.a2a.data.constants.Constants
import com.a2a.data.datasource.RemoteDataSource
import com.a2a.data.extentions.formatToViewTimeStamp
import com.a2a.data.model.CustProfile
import com.a2a.data.model.accountlist.AccountListPostData
import com.a2a.data.model.login.LoginPostData
import com.a2a.data.repository.BaseRepository
import com.a2a.network.Resource
import java.util.*
import javax.inject.Inject

class AccountsRepository @Inject constructor(
    private val remoteDataSource: RemoteDataSource
) : BaseRepository() {

    suspend fun <T> getAccountsList(custProfilevalue: LoginPostData.A2ARequest.Body.CustProfile): Resource<T>? {
        val postData = AccountListPostData()
        postData.apply {
            a2ARequest?.apply {
                header?.apply {
                    bankCode = Constants.BankCode
                    regionCode = Constants.RegionCode
                    srvID = "DashBoard"
                    serviceID = 0
                    methodName = ""
                    userID = Constants.UserID
                    password = Constants.Password
                    channel = Constants.Channel
                    timeStamp = Date().formatToViewTimeStamp()
                    guidID = Constants.GuidID
                    deviceID = MemoryCacheImpl.getDeviceId()
                    deviceToken = Constants.TokenId
                    device="Android"
                }

                a2ARequest?.body?.apply {
                    custProfile = custProfilevalue
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