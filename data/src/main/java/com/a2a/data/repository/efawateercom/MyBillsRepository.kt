package com.a2a.data.repository.efawateercom

import MemoryCacheImpl
import com.a2a.data.datasource.RemoteDataSource
import com.a2a.data.model.common.A2ARequest
import com.a2a.data.model.common.BaseRequestModel
import com.a2a.data.model.efawateercom.myBills.*
import com.a2a.data.repository.BaseRepository
import com.a2a.network.Resource
import javax.inject.Inject

class MyBillsRepository @Inject constructor(
    private val remoteDataSource: RemoteDataSource
) : BaseRepository() {

    suspend fun <T> getMyBills(): Resource<T> {

        val body = MyBillPostData()
        val custProfile = MemoryCacheImpl.getCustProfile()

        body.apply {

            body.requestType = "GetRegBilling"
            body.rID = 0
            if (custProfile != null) {
                body.cID = custProfile.cID
                body.custID = custProfile.custID
            }
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

    suspend fun <T> deleteBills(
        billerCode: String,
        billingNo: String,
        serviceType: String
    ): Resource<T> {

        val body = DeleteBillPostData()
        val custProfile = MemoryCacheImpl.getCustProfile()

        body.apply {
            body.requestType = "RemoveBill"
            body.rID = 0
            body.billerCode = billerCode
            body.billingNo = billingNo
            body.serviceType = serviceType
            body.cID = custProfile!!.cID
            body.custID = custProfile.custID
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

    suspend fun <T> bulkInquire(
        selectedBills: SelectedBills
    ): Resource<T> {

        val body = BulkInquirePostData()
        val currentCustProfile = MemoryCacheImpl.getCustProfile()
        val listToInquire = ArrayList<BulkInquirePostData.Bill>()

        for (i in selectedBills.indices) {
            val billInquire = BulkInquirePostData.Bill()

            billInquire.apply {

                billNo = selectedBills[i].billingNo
                billingNo = selectedBills[i].billingNo
                billerCode = selectedBills[i].billerCode
                serviceType = selectedBills[i].serviceType
                if (currentCustProfile != null) {
                    name = currentCustProfile.eName
                    eMail = currentCustProfile.eMail
                    iD = currentCustProfile.docNo
                    mobileNo = currentCustProfile.mobileNumber
                    phone = currentCustProfile.mobileNumber
                    address = currentCustProfile.address1
                }
                incPayments = "Y"
                custInfoFlag = "EN"

            }
            listToInquire.add(billInquire)
        }

        body.apply {
            stepNumber = "4"
            if (currentCustProfile != null)
                custProfile = currentCustProfile
            bills = listToInquire
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

    suspend fun <T> bulkPayment(
        selectedBills: Array<BulkInquireResponse.A2AResponse.Body.Bill>,
        accountNumber: String,
        currencyCode: String,
        totalFees: Double,
        inquireReferenceNumber:String
    ): Resource<T> {

        val body = BulkPaymentPostData()
        val currentCustProfile = MemoryCacheImpl.getCustProfile()
        val listToInquire = ArrayList<BulkPaymentPostData.Bill>()

        var paidAmount = 0.0

        for (i in selectedBills.indices) {
            val bill = BulkPaymentPostData.Bill()

            bill.apply {
                accountFrom = accountNumber
                billNo = selectedBills[i].billingNo
                billingNo = selectedBills[i].billingNo
                billerCode = selectedBills[i].billerCode.toString()
                serviceType = selectedBills[i].serviceType
                if (currentCustProfile != null) {
                    name = currentCustProfile.eName
                    eMail = currentCustProfile.eMail
                    iD = currentCustProfile.docNo
                    mobileNo = currentCustProfile.mobileNumber
                    phone = currentCustProfile.mobileNumber
                    address = currentCustProfile.address1
                }
                incPayments = "N"
                custInfoFlag = "EN"
                dueAmount = selectedBills[i].bills.first().dueAmount

                if (selectedBills[i].bills.first().paidAmount == 0.0) {
                    bill.paidAmount = selectedBills[i].bills.first().dueAmount
                    paidAmount += selectedBills[i].bills.first().dueAmount
                } else {
                    bill.paidAmount =
                        selectedBills[i].bills.first().paidAmount + selectedBills[i].bills.first().feesAmt
                    paidAmount += selectedBills[i].bills.first().paidAmount + selectedBills[i].bills.first().feesAmt
                }

                bill.apply {
                    feesAmount = selectedBills[i].bills.first().feesAmt
                }
                listToInquire.add(bill)
            }
        }

        body.apply {
            if (currentCustProfile != null)
                custProfile = currentCustProfile
            bills = listToInquire

            accounts.accountNumberFrom = accountNumber
            accounts.accountFrom = accountNumber
            accounts.paidAmount = paidAmount.toString()
            accounts.feesAmount = totalFees.toString()
            accounts.currencyCodeFrom = currencyCode
        }

        val postData = BaseRequestModel(
            A2ARequest(
                body,
                srvID = "eFwatrBulk"
            )
        )
        return safeApiCall(postData) {
            remoteDataSource.baseRequest(postData)
        }
    }

    suspend fun <T> bulkInquire(
        bill: MyBillResponse.A2AResponse.Body.Bill
    ): Resource<T> {

        val body = BulkInquirePostData()
        val currentCustProfile = MemoryCacheImpl.getCustProfile()
        val listToInquire = ArrayList<BulkInquirePostData.Bill>()

        val billInquire = BulkInquirePostData.Bill()

        billInquire.apply {

            billNo = bill.billingNo
            billingNo = bill.billingNo
            billerCode = bill.billerCode
            serviceType = bill.serviceType
            if (currentCustProfile != null) {
                name = currentCustProfile.eName
                eMail = currentCustProfile.eMail
                iD = currentCustProfile.docNo
                mobileNo = currentCustProfile.mobileNumber
                phone = currentCustProfile.mobileNumber
                address = currentCustProfile.address1
            }
            incPayments = "Y"
            custInfoFlag = "EN"

        }

        listToInquire.add(billInquire)

        body.apply {
            stepNumber = "4"
            if (currentCustProfile != null) {
                custProfile.cID = currentCustProfile.cID
                custProfile.custID = currentCustProfile.custID
                custProfile.rID = currentCustProfile.rID
            }
            bills = listToInquire
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