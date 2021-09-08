package com.a2a.data.model.efawateercom.prePaidBill

import com.a2a.network.model.CustProfile
import com.google.gson.annotations.SerializedName

data class PayPrepaidPostData(
    @SerializedName("Accounts")
    var accounts: Accounts = Accounts(),
    @SerializedName("Bill")
    var bill: Bill = Bill(),
    @SerializedName("CustProfile")
    var custProfile: CustProfile = CustProfile()
)
{
    data class Accounts(
        @SerializedName("AccountFrom")
        var accountFrom: String = "",
        @SerializedName("AccountNumberFrom")
        var accountNumberFrom: String = "",
        @SerializedName("FeesAmount")
        var feesAmount: String = "",
        @SerializedName("PaidAmount")
        var paidAmount: String = "",
        @SerializedName("PaidAmt")
        var paidAmt: String = "",
        @SerializedName("BranchCode")
        var branchCode: String = ""
    )

    data class Bill(
        @SerializedName("Address")
        var address: String = "",
        @SerializedName("BillerCode")
        var billerCode: String = "",
        @SerializedName("BillingNo")
        var billingNo: String = "",
        @SerializedName("CID")
        var cID: Int = 0,
        @SerializedName("CustID")
        var custID: String = "",
        @SerializedName("Denomination")
        var denomination: String = "",
        @SerializedName("DueAmount")
        var dueAmount: Double = 0.0,
        @SerializedName("DueAmt")
        var dueAmt: Double = 0.0,
        @SerializedName("eMail")
        var eMail: String = "",
        @SerializedName("Fees")
        var fees: Double = 0.0,
        @SerializedName("FeesAmount")
        var feesAmount: Double = 0.0,
        @SerializedName("ID")
        var iD: String = "",
        @SerializedName("MobileNo")
        var mobileNo: String = "",
        @SerializedName("Name")
        var name: String = "",
        @SerializedName("PaidAmount")
        var paidAmount: Double = 0.0,
        @SerializedName("PaidAmt")
        var paidAmt: Double = 0.0,
        @SerializedName("Phone")
        var phone: String = "",
        @SerializedName("RID")
        var rID: Int = 0,
        @SerializedName("RequestType")
        var requestType: String = "",
        @SerializedName("ServiceType")
        var serviceType: String = "",
        @SerializedName("ValidationCode")
        var validationCode: String = "",
        @SerializedName("BillerEDesc")
        var billerEDesc: String = "",
        @SerializedName("PrePaid")
        var prePaid: String = "",
        @SerializedName("InqRefNo")
        var inqRefNo: String = ""
    )
}
