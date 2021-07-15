package com.a2a.data.repository.efawateercom

import com.a2a.data.datasource.RemoteDataSource
import com.a2a.data.model.common.A2ARequest
import com.a2a.data.model.common.BaseRequestModel
import com.a2a.data.model.efawateercom.BillersPostData
import com.a2a.data.model.efawateercom.CategoriesPostData
import com.a2a.data.model.efawateercom.postBill.PostBillPostData
import com.a2a.data.model.efawateercom.prePaidBill.PrepaidInquirePostData
import com.a2a.data.repository.BaseRepository
import com.a2a.network.Resource
import javax.inject.Inject

class OneTimeRepository @Inject constructor(
    private val remoteDataSource: RemoteDataSource
) : BaseRepository() {

    suspend fun <T> getCategories(): Resource<T> {

        val body = CategoriesPostData()

        body.apply {
            requestType = "Category"
        }
        val postData = BaseRequestModel(
            A2ARequest(
                body,
                srvID = "eFwatercom"
            )
        )
        return safeApiCall(postData) {
            remoteDataSource.baseRequest(postData)
        }
    }

    suspend fun <T> getBillers(sentCode: String): Resource<T> {

        val body = BillersPostData()

        body.apply {
            requestType = "BillersList"
            code = sentCode
            category = "TELC"
        }
        val postData = BaseRequestModel(
            A2ARequest(
                body,
                srvID = "eFwatercom"
            )
        )
        return safeApiCall(postData) {
            remoteDataSource.baseRequest(postData)
        }
    }


    suspend fun <T> inquirePostBill(
        billerCodeValue: String,
        billingNoValue: String,
        serviceTypeValue: String
    ): Resource<T> {

        val body = PostBillPostData()

        val custProfile = MemoryCacheImpl.getCustProfile()

        body.apply {
            requestType = "BillInquiry"
            custID = custProfile!!.custID
            cID = custProfile.cID
            iD = custProfile.docNo
            phone = custProfile.mobileNumber
            mobileNo = custProfile.mobileNumber
            address = custProfile.address1
            eMail = custProfile.eMail
            name = custProfile.eName
            billerCode = billerCodeValue
            billNo = billingNoValue
            billingNo = billingNoValue
            serviceType = serviceTypeValue
            custInfoFlag = "EN"
            idType = "NAT"
            incPayments = "Y"
            dateFlag = "2020-11-29T10:05:17.58"
        }
        val postData = BaseRequestModel(
            A2ARequest(
                body,
                srvID = "eFwatercom"
            )
        )
        return safeApiCall(postData) {
            remoteDataSource.baseRequest(postData)
        }
    }


    suspend fun <T> inquirePrepaidBill(
        billerCodeValue: String,
        billingNoValue: String,
        serviceTypeValue: String,
        denominationsValue: String,
        paidAmountValue: Double
    ): Resource<T> {

        val body = PrepaidInquirePostData()

        val custProfile = MemoryCacheImpl.getCustProfile()

        body.apply {
            requestType = "PrepaidValidation"
            cID = custProfile!!.cID
            custID = custProfile.custID
            billerCode = billerCodeValue
            serviceType = serviceTypeValue
            denomination = denominationsValue
            billingNo = billingNoValue
            paidAmount = paidAmountValue
            custInfoFlag = "Y"
            idType = "NAT"
            iD = custProfile.docNo
            nation = "JO"
            name = custProfile.eName
            phone = custProfile.mobileNumber
            address = custProfile.address1
            eMail = custProfile.eMail
        }
        val postData = BaseRequestModel(
            A2ARequest(
                body,
                srvID = "eFwatercom"
            )
        )
        return safeApiCall(postData) {
            remoteDataSource.baseRequest(postData)
        }
    }
}