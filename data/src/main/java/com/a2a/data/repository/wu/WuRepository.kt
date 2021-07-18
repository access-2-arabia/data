package com.a2a.data.repository.wu

import MemoryCacheImpl
import com.a2a.data.datasource.RemoteDataSource
import com.a2a.data.model.common.A2ARequest
import com.a2a.data.model.common.BaseRequestModel
import com.a2a.data.model.wuLookup.country.CountryPostData
import com.a2a.data.model.wuLookup.currency.CurrencyPostData
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
            body.lookUpName = "CountriesCurrencies"
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
                    srvID = "DestinationCountries",
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
}