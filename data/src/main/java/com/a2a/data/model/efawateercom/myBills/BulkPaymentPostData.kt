package com.a2a.data.model.efawateercom.myBills


import com.a2a.data.model.CustProfileModel
import com.google.gson.annotations.SerializedName

data class BulkPaymentPostData(

    @SerializedName("Accounts")
    var accounts: Accounts = Accounts(),
    @SerializedName("Bills")
    var bills: List<Bill> = listOf(),
    @SerializedName("CustProfile")
    var custProfile: CustProfileModel = CustProfileModel()
) {
    data class Accounts(
        @SerializedName("AccountFrom")
        var accountFrom: String = "",
        @SerializedName("FeesAmount")
        var feesAmount: String = "",
        @SerializedName("PaidAmount")
        var paidAmount: String = ""
    )

    data class Bill(
        @SerializedName("AccountFrom")
        var accountFrom: String = "",
        @SerializedName("Address")
        var address: String = "",
        @SerializedName("BillNo")
        var billNo: String = "",
        @SerializedName("BillerCode")
        var billerCode: String = "",
        @SerializedName("BillingNo")
        var billingNo: String = "",
        @SerializedName("CustInfoFlag")
        var custInfoFlag: String = "",
        @SerializedName("DueAmount")
        var dueAmount: Double = 0.0,
        @SerializedName("eMail")
        var eMail: String = "",
        @SerializedName("FeesAmount")
        var feesAmount: Double = 0.0,
        @SerializedName("ID")
        var iD: String = "",
        @SerializedName("IncPayments")
        var incPayments: String = "",
        @SerializedName("MobileNo")
        var mobileNo: String = "",
        @SerializedName("Name")
        var name: String = "",
        @SerializedName("PaidAmount")
        var paidAmount: Double = 0.0,
        @SerializedName("Phone")
        var phone: String = "",
        @SerializedName("ServiceType")
        var serviceType: String = ""
    )
}