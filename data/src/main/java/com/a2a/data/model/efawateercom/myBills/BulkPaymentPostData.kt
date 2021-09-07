package com.a2a.data.model.efawateercom.myBills


import com.a2a.network.model.CustProfile
import com.google.gson.annotations.SerializedName

data class BulkPaymentPostData(
    @SerializedName("Accounts")
    var accounts: Accounts = Accounts(),
    @SerializedName("Bills")
    var bills: List<Bill> = listOf(),
    @SerializedName("CustProfile")
    var custProfile: CustProfile = CustProfile()
) {
    data class Accounts(
        @SerializedName("AccountNumberFrom")
        var accountNumberFrom: String = "",
        @SerializedName("AccountFrom")
        var accountFrom: String = "",
        @SerializedName("FeesAmount")
        var feesAmount: String = "",
        @SerializedName("PaidAmount")
        var paidAmount: String = "",
        @SerializedName("CurrencyCodeFrom")
        var currencyCodeFrom: String = "",
        @SerializedName("BranchCode")
        var branchCode: String = ""
    )

    data class Bill(
        @SerializedName("InqRefNo")
        var inqRefNo : String = "",
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