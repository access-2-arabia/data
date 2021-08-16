package com.a2a.data.repository.mail

import MemoryCacheImpl
import com.a2a.data.datasource.RemoteDataSource
import com.a2a.data.model.common.A2ARequest
import com.a2a.data.model.common.BaseRequestModel
import com.a2a.data.model.mail.MailPostData
import com.a2a.data.repository.BaseRepository
import com.a2a.network.Resource
import com.a2a.network.model.CustProfile
import javax.inject.Inject

class MailRepository @Inject constructor(
    private val remoteDataSource: RemoteDataSource
) : BaseRepository() {

    suspend fun <T> getMails(
        stepNumber: String
    ): Resource<T> {

        val body = MailPostData()

        body.apply {
            custProfile = MemoryCacheImpl.getCustProfile() ?: CustProfile()
            this.stepNumber = stepNumber
        }

        val postData = BaseRequestModel(
            A2ARequest(
                body,
                srvID = "Mail"
            )
        )
        return safeApiCall(postData) {
            remoteDataSource.baseRequest(postData)
        }
    }


    suspend fun <T> newMail(
        stepNumber: String,
        text: String,
        subject: String
    ): Resource<T> {

        val body = MailPostData()

        body.apply {
            custProfile = MemoryCacheImpl.getCustProfile() ?: CustProfile()
            this.stepNumber = stepNumber

            email.apply {
                this.text = text
                this.subject = subject
            }
        }

        val postData = BaseRequestModel(
            A2ARequest(
                body,
                srvID = "Mail"
            )
        )
        return safeApiCall(postData) {
            remoteDataSource.baseRequest(postData)
        }
    }


    suspend fun <T> deleteMail(
        mailId: String
    ): Resource<T> {

        val body = MailPostData()

        body.apply {
            custProfile = MemoryCacheImpl.getCustProfile() ?: CustProfile()
            this.stepNumber = "3"

            email.apply {
                enabled = "2"
                iD = mailId
            }
        }

        val postData = BaseRequestModel(
            A2ARequest(
                body,
                srvID = "Mail"
            )
        )
        return safeApiCall(postData) {
            remoteDataSource.baseRequest(postData)
        }
    }

    suspend fun <T> updateMail(
        mailId: String,
        enabled: String,
        stepNumber: String,
    ): Resource<T> {

        val body = MailPostData()

        body.apply {
            custProfile = MemoryCacheImpl.getCustProfile() ?: CustProfile()
            this.stepNumber = stepNumber

            email.apply {
                this.enabled = enabled
                iD = mailId
            }
        }

        val postData = BaseRequestModel(
            A2ARequest(
                body,
                srvID = "Mail"
            )
        )
        return safeApiCall(postData) {
            remoteDataSource.baseRequest(postData)
        }
    }
}