package com.a2a.data.repository.dammanpay

import com.a2a.data.datasource.RemoteDataSource
import com.a2a.data.model.common.A2ARequest
import com.a2a.data.model.common.BaseRequestModel
import com.a2a.data.model.dammanpay.DamanPayPostData
import com.a2a.data.model.dammanpay.GetPaymentTypePostData
import com.a2a.data.model.dammanpay.InquirePostData
import com.a2a.data.repository.BaseRepository
import com.a2a.network.Resource
import javax.inject.Inject

class DammanPayRepository @Inject constructor(
    private val remoteDataSource: RemoteDataSource
) : BaseRepository() {

    suspend fun <T> getPaymentType(
    ): Resource<T>? {
        val paymentTypePostData = GetPaymentTypePostData()
        paymentTypePostData.apply {
            body.custProfile = MemoryCacheImpl.getCustProfile()!!
            body.reqType = paymentTypePostData.body.reqType
            body.stepNumber = paymentTypePostData.body.stepNumber
        }
        val postData =
            BaseRequestModel(
                A2ARequest(
                    paymentTypePostData.body,
                    srvID = "DamanPay",
                    serviceIDValue = 0
                )
            )
        return safeApiCall(postData)
        {
            remoteDataSource.baseRequest(postData)
        }
    }

    suspend fun <T> getInquire(
    ): Resource<T>? {
        val inquirePostData = InquirePostData()
        inquirePostData.apply {
            body.custProfile = MemoryCacheImpl.getCustProfile()!!
            body.payNo = inquirePostData.body.payNo
            body.serviceType = inquirePostData.body.serviceType
            body.stepNumber = inquirePostData.body.stepNumber
        }
        val postData =
            BaseRequestModel(
                A2ARequest(
                    inquirePostData.body,
                    srvID = "DamanPay",
                    serviceIDValue = 0
                )
            )
        return safeApiCall(postData)
        {
            remoteDataSource.baseRequest(postData)
        }
    }

    suspend fun <T> getDammanPay(
    ): Resource<T>? {
        val damanPayPostData = DamanPayPostData()
        damanPayPostData.apply {
            body.stepNumber = damanPayPostData.body.stepNumber
            body.custProfile = MemoryCacheImpl.getCustProfile()!!
            body.accFrom = damanPayPostData.body.accFrom
            body.accTo = damanPayPostData.body.accTo
            body.currFrom = damanPayPostData.body.currFrom
            body.currTo = damanPayPostData.body.currTo
            body.fees = damanPayPostData.body.fees
            body.payno = damanPayPostData.body.payno
            body.serviceType = damanPayPostData.body.serviceType
            body.dueAmount = damanPayPostData.body.dueAmount
        }
        val postData =
            BaseRequestModel(
                A2ARequest(
                    damanPayPostData.body,
                    srvID = "DamanPay",
                    serviceIDValue = 0
                )
            )
        return safeApiCall(postData)
        {
            remoteDataSource.baseRequest(postData)
        }
    }
}