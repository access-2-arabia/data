package com.a2a.data.repository

import MemoryCacheImpl
import com.a2a.data.datasource.RemoteDataSource
import com.a2a.data.model.common.A2ARequest
import com.a2a.data.model.common.BaseRequest
import com.a2a.data.model.mail.MailPostData
import com.a2a.data.model.mail.SendMailPostData
import com.a2a.data.model.mail.UpdateMailPostData
import com.a2a.data.utility.SrvID
import com.a2a.network.Resource
import com.a2a.network.model.CustProfile
import javax.inject.Inject


class MailRepository @Inject constructor(
    private val remoteDataSource: RemoteDataSource
) : BaseRepository() {


    suspend fun <T> getMails(): Resource<T> {
        val postData = MailPostData()
        postData.apply {
            custProfile.cID = MemoryCacheImpl.getCustProfile()?.cID ?: CustProfile().cID
        }
        val request = BaseRequest(A2ARequest(srvId = SrvID.MAIL_UTILS, body = postData))
        return safeApiCall(request) { remoteDataSource.baseRequest(request) }
    }

    suspend fun <T> sendMails(title: String, message: String): Resource<T> {
        val postData = SendMailPostData()
        postData.apply {
            custProfile.cID = MemoryCacheImpl.getCustProfile()?.cID ?: CustProfile().cID
            email.apply {
                subject = title
                text = message
            }
        }
        val request = BaseRequest(A2ARequest(srvId = SrvID.MAIL_UTILS, body = postData))
        return safeApiCall(request) { remoteDataSource.baseRequest(request) }
    }

    suspend fun <T> updateMails(
        enabledAction: Int,
        idList: MutableList<Int>,
        step: Int
    ): Resource<T> {
        val postData = UpdateMailPostData()
        postData.apply {
            stepNumber = step
            custProfile.cID = MemoryCacheImpl.getCustProfile()?.cID ?: CustProfile().cID
            email.apply {
                enabled = enabledAction
                iDS = idList
            }
        }
        val request = BaseRequest(A2ARequest(srvId = SrvID.MAIL_UTILS, body = postData))
        return safeApiCall(request) { remoteDataSource.baseRequest(request) }
    }

}

