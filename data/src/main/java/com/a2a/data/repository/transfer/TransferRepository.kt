package com.a2a.data.repository.transfer

import com.a2a.data.constants.Constants
import com.a2a.data.datasource.RemoteDataSource
import com.a2a.data.extentions.formatToViewDateStamp
import com.a2a.data.extentions.formatToViewTimeStamp
import com.a2a.data.model.accountlist.AccountListPostData
import com.a2a.data.model.transfermodel.betwenmyaccount.BetweenMyAccountPostData
import com.a2a.data.repository.BaseRepository
import com.a2a.data.repository.transfer.TransferType.Companion.betweenMyAccountADesc
import com.a2a.data.repository.transfer.TransferType.Companion.betweenMyAccountEDesc
import com.a2a.network.Resource
import java.util.*
import javax.inject.Inject

class TransferRepository @Inject constructor(
    private val remoteDataSource: RemoteDataSource
) : BaseRepository() {

    suspend fun <T> getTransferBetweenMyAccount(
        accountNumberFrom: String, accountNumberTo: String,
        currFrom: String, currTo: String, amount: String
    ): Resource<T>? {
        val postData = BetweenMyAccountPostData()
        postData.apply {
            a2ARequest?.apply {
                header?.apply {
                    bankCode = Constants.BankCode
                    regionCode = Constants.RegionCode
                    srvID = "IntFund"
                    serviceID = 0
                    methodName = ""
                    userID = Constants.UserID
                    password = Constants.Password
                    channel = Constants.Channel
                    timeStamp = Date().formatToViewTimeStamp()
                    guidID = Constants.GuidID
                    deviceID = Constants.DeviceID
                }

                a2ARequest?.body?.apply {
                    stepNumber = 3
                    custProfile.cID = MemoryCacheImpl.getCustProfile()!!.cID
                    custProfile.custID = MemoryCacheImpl.getCustProfile()!!.custID
                    accounts.accountNumberFrom = accountNumberFrom
                    accounts.accountNumberTo = accountNumberTo
                    startDate = Date().formatToViewDateStamp()
                    count = "-1"
                    period = 0
                    eDesc = betweenMyAccountEDesc
                    aDesc = betweenMyAccountADesc
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