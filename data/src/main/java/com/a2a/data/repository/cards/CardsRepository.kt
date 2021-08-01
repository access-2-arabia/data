package com.a2a.data.repository.cards

import com.a2a.data.datasource.RemoteDataSource
import com.a2a.data.model.card.creditcard.CreditCardPostData
import com.a2a.data.model.card.debit.DebitCardPostData
import com.a2a.data.model.common.A2ARequest
import com.a2a.data.model.common.BaseRequestModel
import com.a2a.data.repository.BaseRepository
import com.a2a.network.Resource
import javax.inject.Inject

class CardsRepository @Inject constructor(
    private val remoteDataSource: RemoteDataSource
) : BaseRepository() {


    suspend fun <T> getCreditCard(
    ): Resource<T>? {
        val creditCardPostData = CreditCardPostData()
        creditCardPostData.apply {
            body.custID = MemoryCacheImpl.getCustProfile()!!.custID
            body.rIMNumber = MemoryCacheImpl.getCustProfile()!!.custID
            body.cardType = "A"
            body.maskPan = "N"
            body.regionCode = MemoryCacheImpl.getCustProfile()!!.custID
        }
        val postData =
            BaseRequestModel(
                A2ARequest(
                    creditCardPostData.body,
                    srvID = "CardList",
                    serviceIDValue = 0
                )
            )
        return safeApiCall(postData)
        {
            remoteDataSource.baseRequest(postData)
        }
    }


    suspend fun <T> getDebitPrepaidCard(
    ): Resource<T>? {
        val debitCardPostData = DebitCardPostData()
        debitCardPostData.apply {
            body.custID = MemoryCacheImpl.getCustProfile()!!.custID
        }
        val postData =
            BaseRequestModel(
                A2ARequest(
                    debitCardPostData.body,
                    srvID = "CardSList",
                    serviceIDValue = 0
                )
            )
        return safeApiCall(postData)
        {
            remoteDataSource.baseRequest(postData)
        }
    }


}