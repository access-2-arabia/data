package com.a2a.data.repository

import MemoryCacheImpl
import com.a2a.data.datasource.RemoteDataSource
import com.a2a.data.model.cards.AtmManagementPostData
import com.a2a.data.model.common.A2ARequest
import com.a2a.data.model.common.BaseRequest
import com.a2a.network.Resource
import com.a2a.network.model.CustProfile
import javax.inject.Inject


class CardsRepository @Inject constructor(
    private val remoteDataSource: RemoteDataSource
) : BaseRepository() {
    suspend fun <T> requestChequeBook(
        cardNumber: String,
        isStoppedAtm: Boolean,
    ): Resource<T> {
        val postData = AtmManagementPostData()
        postData.apply {
            custProfile = MemoryCacheImpl.getCustProfile() ?: CustProfile()
            cardNo = cardNumber
            stepNumber = if (isStoppedAtm) null else 2
        }
        val request = BaseRequest(A2ARequest(postData, srvId = "CardSStop"))
        return safeApiCall(request) {
            remoteDataSource.baseRequest(request)
        }
    }
}

