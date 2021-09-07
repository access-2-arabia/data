package com.a2a.data.repository.efawateercom

import com.a2a.data.datasource.RemoteDataSource
import com.a2a.data.model.common.A2ARequest
import com.a2a.data.model.common.BaseRequestModel
import com.a2a.data.model.efawateercom.AddBillPostData
import com.a2a.data.model.efawateercom.BillersPostData
import com.a2a.data.model.efawateercom.CategoriesPostData
import com.a2a.data.model.efawateercom.postBill.PayPostPaidPostData
import com.a2a.data.model.efawateercom.postBill.PostBillPostData
import com.a2a.data.model.efawateercom.prePaidBill.PayPrepaidPostData
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
            category = sentCode
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
            dateFlag = "N"
            accStatus = "1"
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


    suspend fun <T> payPrePaid(
        billerCode: Int,
        serviceType: String,
        billingNo: String,
        dueAmount: Double,
        paidAmount: Double,
        fees: Double,
        accountSelected: String,
        denomination: String,
        validationCode: String,
        billerEDesc: String
    ): Resource<T> {

        val body = PayPrepaidPostData()
        val currentCustProfile = MemoryCacheImpl.getCustProfile()

        body.apply {

            bill.requestType = "PrepaidPayment"

            if (currentCustProfile != null) {
                bill.cID = custProfile.cID
                bill.custID = custProfile.custID
                bill.iD = custProfile.docNo
                bill.name = custProfile.eName
                bill.phone = custProfile.mobileNumber
                bill.mobileNo = custProfile.mobileNumber
                bill.address = custProfile.address1
                bill.eMail = custProfile.eMail

                custProfile = currentCustProfile

            }

            bill.denomination = denomination
            bill.validationCode = validationCode
            bill.billerCode = billerCode.toString()
            bill.serviceType = serviceType
            bill.billingNo = billingNo
            bill.dueAmount = dueAmount
            bill.dueAmt = dueAmount
            bill.paidAmount = paidAmount
            bill.paidAmt = paidAmount
            bill.fees = fees
            bill.feesAmount = fees
            bill.billerEDesc = billerEDesc
            bill.prePaid = "Y"

            accounts.accountFrom = accountSelected
            accounts.accountNumberFrom = accountSelected
            accounts.paidAmount = paidAmount.toString()
            accounts.paidAmt = paidAmount.toString()
            accounts.feesAmount = fees.toString()
        }

        val postData = BaseRequestModel(
            A2ARequest(
                body,
                srvID = "eFwaterPay"
            )
        )

        return safeApiCall(postData) {
            remoteDataSource.baseRequest(postData)
        }
    }


    suspend fun <T> payPostPaid(
        billerCode: Int,
        serviceType: String,
        billingNo: String,
        dueAmount: Double,
        paidAmount: Double,
        fees: Double,
        accountSelected: String,
        billerEDesc: String
    ): Resource<T> {

        val body = PayPostPaidPostData()
        val currentCustProfile = MemoryCacheImpl.getCustProfile()

        body.apply {

            bill.requestType = "BillPayment"

            if (currentCustProfile != null) {
                bill.cID = custProfile.cID
                bill.custID = custProfile.custID
                bill.iD = custProfile.docNo
                bill.name = custProfile.eName
                bill.phone = custProfile.mobileNumber
                bill.mobileNo = custProfile.mobileNumber
                bill.address = custProfile.address1
                bill.eMail = custProfile.eMail

                custProfile = currentCustProfile

            }

            bill.repID = 0
            bill.billerCode = billerCode.toString()
            bill.serviceType = serviceType
            bill.billingNo = billingNo
            bill.incPayments = "Y"
            bill.dueAmount = dueAmount
            bill.dueAmt = dueAmount
            bill.paidAmount = paidAmount
            bill.paidAmt = paidAmount
            bill.fees = fees
            bill.feesAmount = fees
            bill.billerEDesc = billerEDesc


            accounts.accountFrom = accountSelected
            accounts.accountNumberFrom = accountSelected
            accounts.paidAmount = paidAmount.toString()
            accounts.paidAmt = paidAmount.toString()
            accounts.feesAmount = fees.toString()

        }

        val postData = BaseRequestModel(
            A2ARequest(
                body,
                srvID = "eFwaterPay"
            )
        )

        return safeApiCall(postData) {
            remoteDataSource.baseRequest(postData)
        }

    }

    suspend fun <T> addNewBill(
        billerCodeValue: String,
        billingNoValue: String,
        serviceTypeValue: String,
        nickNameValue: String
    ): Resource<T> {

        val body = AddBillPostData()
        val currentCustProfile = MemoryCacheImpl.getCustProfile()

        body.apply {

            requestType = "AddBill"
            cID = currentCustProfile!!.cID
            custID = currentCustProfile.custID
            rID = 0
            billerCode = billerCodeValue
            serviceType = serviceTypeValue
            billingNo = billingNoValue
            billNo = billingNoValue
            idType = "NAT"
            custInfoFlag = "EN"
            iD = currentCustProfile.docNo
            name = currentCustProfile.eName
            phone = currentCustProfile.mobileNumber
            mobileNo = currentCustProfile.mobileNumber
            address = currentCustProfile.address1
            eMail = currentCustProfile.eMail
            accStatus = "1"
            nickName = nickNameValue

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

