package com.a2a.data.repository.cliq

import MemoryCacheImpl
import com.a2a.data.datasource.AppCash
import com.a2a.data.datasource.RemoteDataSource
import com.a2a.data.extentions.formatCliqDate
import com.a2a.data.model.cliq.createProfile.AliasTypePostData
import com.a2a.data.model.cliq.GetCustomerPostData
import com.a2a.data.model.cliq.createProfile.CliQRegistrationPostData
import com.a2a.data.model.cliq.createProfile.FundsAccountPostData
import com.a2a.data.model.cliq.createProfile.ReactivateAccountPostData
import com.a2a.data.model.cliq.pendingRequest.ApproveRequestPostData
import com.a2a.data.model.cliq.pendingRequest.PendingPaymentPostData
import com.a2a.data.model.cliq.pendingRequest.PendingPaymentResponse
import com.a2a.data.model.cliq.pendingRequest.TrxDetail
import com.a2a.data.model.common.A2ARequest
import com.a2a.data.model.common.BaseRequestModel
import com.a2a.data.repository.BaseRepository
import com.a2a.network.Resource
import com.a2a.network.model.CustProfile
import com.google.gson.Gson
import java.util.*
import javax.inject.Inject

class PendingPaymentRepository @Inject constructor(
    private val remoteDataSource: RemoteDataSource
) : BaseRepository() {

    suspend fun <T> getPendingPayment(
        dateFrom: String,
        dateTo: String,
        transactionType: String
    ): Resource<T> {

        val currentCustProfile = MemoryCacheImpl.getCustProfile() ?: CustProfile()

        val body = PendingPaymentPostData()

        body.apply {

            custProfile = currentCustProfile

            requestType = "RTPList"
            custID = currentCustProfile.custID
            trxStatus = "PEND"
            lastTrxNo = "10"
            trxDir = transactionType
            this.dateTo = dateTo
            this.dateFrom = dateFrom
        }

        val postData = BaseRequestModel(
            A2ARequest(
                body,
                srvID = "ICLIQ"
            )
        )

        return safeApiCall(postData) {
            remoteDataSource.baseRequest(postData)
        }
    }

    suspend fun <T> approveIncomingRequest(
        transaction: TrxDetail,
        accountNumber: String,
        isApprove: Boolean,
        eValue: String,
        eDesc: String
    ): Resource<T> {

        val currentCustProfile = MemoryCacheImpl.getCustProfile() ?: CustProfile()

        val body = ApproveRequestPostData()
        val payment = ApproveRequestPostData.Payment()

        body.apply {
            custProfile = currentCustProfile

            payment.apply {
                rTPStatus = isApprove.toString()
                orgnlMsgId = transaction.msgID
                amount = transaction.amount
                curr = transaction.curr
                dbtrAgt = transaction.dbtrAgt
                dbtrAcct = accountNumber
                dbtrName = transaction.dbtrName
                cdtrAgt = transaction.cdtrAgt
                cdtrAcct = transaction.cdtrAcct
                cdtrName = transaction.cdtrName
                rejectADdInfo = eDesc
                rejectReason = eValue
            }
            body.payments.add(payment)
        }

        val postData = BaseRequestModel(
            A2ARequest(
                body,
                srvID = "RTPBulk"
            )
        )

        return safeApiCall(postData) {
            remoteDataSource.baseRequest(postData)
        }
    }
}

