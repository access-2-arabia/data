package com.a2a.data.repository.wu

import MemoryCacheImpl
import com.a2a.data.datasource.RemoteDataSource
import com.a2a.data.model.accountlist.AccountListResponse
import com.a2a.data.model.accountlist.AccountListResponse.A2AResponse.Body.Account
import com.a2a.data.model.common.A2ARequest
import com.a2a.data.model.common.BaseRequestModel
import com.a2a.data.model.common.Header
import com.a2a.data.model.wu.feeinquire.FeeInquirePostData
import com.a2a.data.model.wu.feeinquire.FeeInquireResponse
import com.a2a.data.model.wu.wuLookup.country.CountryPostData
import com.a2a.data.model.wu.wuLookup.currency.CurrencyPostData
import com.a2a.data.repository.BaseRepository
import com.a2a.network.Resource
import javax.inject.Inject

class WuRepository @Inject constructor(
    private val remoteDataSource: RemoteDataSource
) : BaseRepository() {

    suspend fun <T> getWuCountries(
    ): Resource<T>? {
        val countryPostData = CountryPostData()
        countryPostData.apply {
            body.lookUpName = "DestinationCountries"
            body.custProfile = MemoryCacheImpl.getCustProfile()!!
            body.deviceType = "Online"
            body.deviceId = "Online"
            body.queryfilter1 = "en"
            body.queryfilter2 = "JO JOD"
        }
        val postData =
            BaseRequestModel(
                A2ARequest(
                    countryPostData.body,
                    srvID = "GetWULookup",
                    serviceIDValue = 0
                )
            )
        return safeApiCall(postData)
        {
            remoteDataSource.baseRequest(postData)
        }
    }

    suspend fun <T> getWuCurrency(
        countryIsoCode: String
    ): Resource<T>? {
        val currencyPostData = CurrencyPostData()
        currencyPostData.apply {
            body.lookUpName = "CountriesCurrencies"
            body.custProfile = MemoryCacheImpl.getCustProfile()!!
            body.deviceType = "Online"
            body.deviceId = "Online"
            body.queryfilter1 = "en"
            body.queryfilter2 = "JO JOD"
            body.queryfilter3 = countryIsoCode
        }
        val postData =
            BaseRequestModel(
                A2ARequest(
                    currencyPostData.body,
                    srvID = "GetWULookup",
                    serviceIDValue = 0
                )
            )
        return safeApiCall(postData)
        {
            remoteDataSource.baseRequest(postData)
        }
    }


    suspend fun <T> getFeeInquire(
        feeInquire: FeeInquirePostData,
        account: Account,
        principalAmountValue: Double,
        expectedPayoutAmountValue: Double
    ): Resource<T>? {
        val feeInquirePostData = FeeInquirePostData()
        feeInquirePostData.apply {
            body.regionCode = "02"
            body.accountNumber = account.accountNumber
            body.custStatus = true.toString()
            body.mobFlag = false
            body.cID = MemoryCacheImpl.getCustProfile()!!.cID
            body.repID = MemoryCacheImpl.getCustProfile()!!.repID.toString()
            body.custType = MemoryCacheImpl.getCustProfile()!!.custType
            body.deviceId = "Online"
            body.deviceType = "Mobile"
            body.orgcountryIsoCode = "JO"
            body.orgcurrencyIsoCode = "JOD"
            body.principalAmount = principalAmountValue
            body.expectedPayoutAmount = expectedPayoutAmountValue
            body.dstcountryIsoCode = feeInquire.body.dstcountryIsoCode
            body.dstcurrencyIsoCode = feeInquire.body.dstcurrencyIsoCode
            body.transactionType = feeInquire.body.transactionType
            body.myWuNumber = feeInquire.body.myWuNumber
            body.prmCode = feeInquire.body.prmCode
        }
        val postData =
            BaseRequestModel(
                A2ARequest(
                    feeInquirePostData.body,
                    srvID = "WUFeeInq",
                    serviceIDValue = 0
                )
            )
        return safeApiCall(postData)
        {
            remoteDataSource.baseRequest(postData)
        }
    }
}