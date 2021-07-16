package com.a2a.data.model.efawateercom.prePaidBill

import com.google.gson.annotations.SerializedName

data class PrepaidInquirePostData(
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
    @SerializedName("CustInfoFlag")
    var custInfoFlag: String = "",
    @SerializedName("Denomination")
    var denomination: String = "",
    @SerializedName("eMail")
    var eMail: String = "",
    @SerializedName("ID")
    var iD: String = "",
    @SerializedName("IdType")
    var idType: String = "",
    @SerializedName("Name")
    var name: String = "",
    @SerializedName("Nation")
    var nation: String = "",
    @SerializedName("PaidAmount")
    var paidAmount: Double = 0.0,
    @SerializedName("Phone")
    var phone: String = "",
    @SerializedName("RID")
    var rID: Int = 0,
    @SerializedName("RequestType")
    var requestType: String = "",
    @SerializedName("ServiceType")
    var serviceType: String = ""
)
