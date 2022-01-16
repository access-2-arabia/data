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
        paymentTypePostDataValue: GetPaymentTypePostData
    ): Resource<T>? {
        val paymentTypePostData = GetPaymentTypePostData()
        paymentTypePostData.apply {
            body.custProfile = MemoryCacheImpl.getCustProfile()!!
            body.reqType = paymentTypePostDataValue.body.reqType
            body.stepNumber = paymentTypePostDataValue.body.stepNumber
            body.subCategory = paymentTypePostDataValue.body.subCategory
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
        inquirePostDataValue: InquirePostData
    ): Resource<T>? {
        val inquirePostData = InquirePostData()
        inquirePostData.apply {
            body.custProfile = MemoryCacheImpl.getCustProfile()!!
            body.payNo = inquirePostDataValue.body.payNo
            body.serviceType = inquirePostDataValue.body.serviceType
            body.stepNumber = inquirePostDataValue.body.stepNumber
            body.subCategory = inquirePostDataValue.body.subCategory
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
        damanPayPostDataValue: DamanPayPostData
    ): Resource<T>? {
        val damanPayPostData = DamanPayPostData()
        damanPayPostData.apply {
            body.stepNumber = damanPayPostDataValue.body.stepNumber
            body.custProfile = MemoryCacheImpl.getCustProfile()!!
            body.accFrom = damanPayPostDataValue.body.accFrom
            body.accTo = damanPayPostDataValue.body.accTo
            body.currFrom = damanPayPostDataValue.body.currFrom
            body.currTo = damanPayPostDataValue.body.currTo
            body.fees = damanPayPostDataValue.body.fees
            body.payno = damanPayPostDataValue.body.payno
            body.serviceType = damanPayPostDataValue.body.serviceType
            body.dueAmount = damanPayPostDataValue.body.dueAmount
            body.subCategory = damanPayPostDataValue.body.subCategory
            body.amt = damanPayPostDataValue.body.amt
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