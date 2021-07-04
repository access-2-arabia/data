package com.a2a.data.repository

import com.a2a.data.datasource.RemoteDataSource
import com.a2a.data.model.calculators.CalculateInterestRatePostData
import com.a2a.data.model.calculators.ConvertRatePostData
import com.a2a.network.Resource
import javax.inject.Inject


class CalculatorsRepository @Inject constructor(
    private val remoteDataSource: RemoteDataSource
) : BaseRepository() {


    suspend fun <T> calculateRate(amount: String, period: String, curr: String): Resource<T> {
        val postData = CalculateInterestRatePostData()
        postData.apply {
            a2ARequest.header.channel = "M"
            a2ARequest.body.curr = curr
            a2ARequest.body.amount = amount
            a2ARequest.body.period = period
            a2ARequest.body.stepNumber = "2"
            a2ARequest.header.srvID = "IntrstRate"
        }
        return safeApiCall(postData) { remoteDataSource.baseRequest(postData) }
    }

    suspend fun <T> convertRate(
        fromCurrency: String,
        toCurrency: String,
        amount: String
    ): Resource<T> {
        val postData = ConvertRatePostData()
        postData.apply {
            a2ARequest.header.srvID = "FXRate"
            a2ARequest.header.channel = "M"
            a2ARequest.body.currency.fromCurrency = fromCurrency
            a2ARequest.body.currency.toCurrency = toCurrency
            a2ARequest.body.currency.amountFrom = amount
            a2ARequest.body.stepNumber = "2"
        }
        return safeApiCall(postData) { remoteDataSource.baseRequest(postData) }
    }
  suspend fun <T> getRateExchange(

    ): Resource<T> {
        val postData = ConvertRatePostData()
        postData.apply {
            a2ARequest.header.srvID = "FXRate"
            a2ARequest.header.channel = "M"

        }
        return safeApiCall(postData) { remoteDataSource.baseRequest(postData) }
    }


}

