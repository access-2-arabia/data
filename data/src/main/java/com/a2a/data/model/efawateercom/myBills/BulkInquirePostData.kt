package com.a2a.data.model.efawateercom.myBills


import com.a2a.data.model.CustProfileModel
import com.google.gson.annotations.SerializedName

data class BulkInquirePostData(
    @SerializedName("Bills")
    var bills: List<Bill> = listOf(),
    @SerializedName("CustProfile")
    var custProfile: CustProfileModel = CustProfileModel(),
    @SerializedName("StepNumber")
    var stepNumber: String = ""
) {
    data class Bill(
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
        @SerializedName("eMail")
        var eMail: String = "",
        @SerializedName("ID")
        var iD: String = "",
        @SerializedName("IncPayments")
        var incPayments: String = "",
        @SerializedName("MobileNo")
        var mobileNo: String = "",
        @SerializedName("Name")
        var name: String = "",
        @SerializedName("Phone")
        var phone: String = "",
        @SerializedName("ServiceType")
        var serviceType: String = ""
    )
}