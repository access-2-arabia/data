package com.a2a.data.repository.accounts

import MemoryCacheImpl
import com.a2a.data.constants.Constants
import com.a2a.data.datasource.RemoteDataSource
import com.a2a.data.extentions.formatToViewTimeStamp
import com.a2a.data.model.lasttransaction.LastTransactionPostData
import com.a2a.data.repository.BaseRepository
import com.a2a.network.Resource
import java.util.*
import javax.inject.Inject

class LastTransactionRepository @Inject constructor(
    private val remoteDataSource: RemoteDataSource
) : BaseRepository() {

    suspend fun <T> getLastTransactionList(
        accountNumber: String,
        toDate: String = "3/06/2021",
        fromDate: String = "23/12/2020"
    ): Resource<T>? {
        val postData = LastTransactionPostData()
        postData.apply {
            a2ARequest?.apply {
                header?.apply {
                    bankCode = Constants.BankCode
                    regionCode = Constants.RegionCode
                    srvID = "LastNTrans"
                    serviceID = 0
                    methodName = ""
                    userID = Constants.UserID
                    password = Constants.Password
                    channel = Constants.Channel
                    timeStamp = Date().formatToViewTimeStamp()
                    deviceID = Constants.DeviceID
                    connectorID = Constants.ConnectorID
                }

                a2ARequest?.body?.apply {
                    account.accountNumber = accountNumber
                    branchCode = MemoryCacheImpl.getCustProfile()!!.branch
                    custID = MemoryCacheImpl.getCustProfile()!!.custID
                    dateFrom = fromDate
                    dateTo = toDate
                    indexTo = "10"
                    transType = "A"
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