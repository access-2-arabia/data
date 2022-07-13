package com.a2a.data.repository.marketplace

import com.a2a.data.datasource.RemoteDataSource
import com.a2a.data.model.common.A2ARequest
import com.a2a.data.model.common.BaseRequestModel
import com.a2a.data.model.mail.MailPostData
import com.a2a.data.model.marketplace.MarketPlacePostData
import com.a2a.data.model.wu.sendmoney.SendMoneyValidationPostData
import com.a2a.data.repository.BaseRepository
import com.a2a.network.Resource
import com.a2a.network.model.CustProfile
import javax.inject.Inject

class MarketPlaceRepository @Inject constructor(
    private val remoteDataSource: RemoteDataSource
) : BaseRepository() {

    suspend fun <T> getMarketPlace(
        marketPlace: MarketPlacePostData
    ): Resource<T>? {
        var marketPlacePostData = MarketPlacePostData()
        marketPlacePostData.body.custProfile = marketPlace.body.custProfile
        val postData =
            BaseRequestModel(
                A2ARequest(
                    marketPlacePostData.body,
                    srvID = "MkPlcURL",
                    serviceIDValue = 0
                )
            )
        return safeApiCall(postData)
        {
            remoteDataSource.baseRequest(postData)
        }
    }
}