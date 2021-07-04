package com.a2a.data.repository.transfer

import com.a2a.data.constants.Constants
import com.a2a.data.datasource.RemoteDataSource
import com.a2a.data.extentions.formatToViewDateStamp
import com.a2a.data.extentions.formatToViewTimeStamp
import com.a2a.data.model.accountlist.AccountListPostData
import com.a2a.data.model.transfermodel.betwenmyaccount.BetweenMyAccountPostData
import com.a2a.data.model.transfermodel.betwenmyaccount.ValidationBetweenMyAccountPostData
import com.a2a.data.model.transfermodel.withincab.ValidationWithinCabPostData
import com.a2a.data.model.transfermodel.withincab.WithinCabPostData
import com.a2a.data.repository.BaseRepository
import com.a2a.data.repository.transfer.TransferType.Companion.betweenMyAccountADesc
import com.a2a.data.repository.transfer.TransferType.Companion.betweenMyAccountEDesc
import com.a2a.network.Resource
import java.util.*
import javax.inject.Inject

class TransferRepository @Inject constructor(
    private val remoteDataSource: RemoteDataSource
) : BaseRepository() {


    suspend fun <T> getValidationTransferBetweenMyAccount(
        accountNumberFromValue: String, accountNumberToValue: String,
        currFrom: String, currTo: String, amountValue: String
    ): Resource<T>? {
        val postData = ValidationBetweenMyAccountPostData()
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

                    deviceID = Constants.DeviceID
                }

                a2ARequest?.body?.apply {
                    stepNumber = "2"
                    repID = "0"
                    cID = MemoryCacheImpl.getCustProfile()!!.cID.toString()
                    custID = MemoryCacheImpl.getCustProfile()!!.custID
                    accountNumberFrom = accountNumberFromValue
                    accountNumberTo = accountNumberToValue
                    currencyFrom = currFrom
                    currencyTo = currTo
                    custType = MemoryCacheImpl.getCustProfile()!!.custType.toString()
                    amount = amountValue
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

    suspend fun <T> getTransferBetweenMyAccount(
        accountNumberFrom: String, accountNumberTo: String,
        currFrom: String, currTo: String, amountValue: String
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
                    accounts.currencyFrom = currFrom
                    accounts.currencyTo = currTo
                    accounts.amount = amountValue
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


    suspend fun <T> getValidationTransferWithinCab(
        accountNumberFromValue: String, accountNumberToValue: String,
        currFrom: String, currTo: String, amountValue: String
    ): Resource<T>? {
        val postData = ValidationWithinCabPostData()
        postData.apply {
            a2ARequest?.apply {
                header?.apply {
                    bankCode = Constants.BankCode
                    regionCode = Constants.RegionCode
                    srvID = "ExtFund"
                    serviceID = 0
                    methodName = ""
                    userID = Constants.UserID
                    password = Constants.Password
                    channel = Constants.Channel
                    timeStamp = Date().formatToViewTimeStamp()

                    deviceID = Constants.DeviceID
                }

                a2ARequest?.body?.apply {
                    stepNumber = "2"
                    repID = "0"
                    cID = MemoryCacheImpl.getCustProfile()!!.cID.toString()
                    custID = MemoryCacheImpl.getCustProfile()!!.custID
                    accountNumberFrom = accountNumberFromValue
                    accountNumberTo = accountNumberToValue
                    currencyFrom = currFrom
                    currencyTo = currTo
                    custType = MemoryCacheImpl.getCustProfile()!!.custType.toString()
                    amount = amountValue
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


    suspend fun <T> getTransferWithinCab(
        accountNumberFrom: String, accountNumberTo: String,
        currFrom: String, currTo: String, amountValue: String
    ): Resource<T>? {
        val postData = WithinCabPostData()
        postData.apply {
            a2ARequest?.apply {
                header?.apply {
                    bankCode = Constants.BankCode
                    regionCode = Constants.RegionCode
                    srvID = "ExtFund"
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
                    accounts.currencyFrom = currFrom
                    accounts.currencyTo = currTo
                    accounts.amount = amountValue
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