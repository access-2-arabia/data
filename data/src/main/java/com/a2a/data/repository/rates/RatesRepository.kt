package com.a2a.data.repository.rates

import com.a2a.data.datasource.RemoteDataSource
import com.a2a.data.model.common.A2ARequest
import com.a2a.data.model.common.BaseRequestModel
import com.a2a.data.model.rate.ConvertRatePostData
import com.a2a.data.model.rate.RateExchangePostData


import com.a2a.data.repository.BaseRepository
import com.a2a.network.Resource
import javax.inject.Inject

class RatesRepository @Inject constructor(
    private val remoteDataSource: RemoteDataSource
) : BaseRepository() {

    suspend fun <T> getCurrencyExChange(): Resource<T> {

        val body = RateExchangePostData()

        val postData = BaseRequestModel(
            A2ARequest(
                body,
                srvID = "FXRate"
            )
        )
        return safeApiCall(postData) {
            remoteDataSource.baseRequest(postData)
        }
    }

    suspend fun <T> convertCurrency(
        fromCurrency: String,
        toCurrency: String,
        amountToConvert: String
    ): Resource<T> {

        val body = ConvertRatePostData()

        body.apply {
            stepNumber = "2"
            currency.fromCurrency = fromCurrency
            currency.toCurrency = toCurrency
            currency.amountFrom = amountToConvert
        }

        val postData = BaseRequestModel(
            A2ARequest(
                body,
                srvID = "FXRate"
            )
        )
        return safeApiCall(postData) {
            remoteDataSource.baseRequest(postData)
        }
    }
}