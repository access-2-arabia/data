package com.a2a.data.model.efawateercom


import com.google.gson.annotations.SerializedName

data class AddBillPostData(
    @SerializedName("AccStatus")
    var accStatus: String = "",
    @SerializedName("Address")
    var address: String = "",
    @SerializedName("BillNo")
    var billNo: String = "",
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
    @SerializedName("eMail")
    var eMail: String = "",
    @SerializedName("ID")
    var iD: String = "",
    @SerializedName("IdType")
    var idType: String = "",
    @SerializedName("MobileNo")
    var mobileNo: String = "",
    @SerializedName("Name")
    var name: String = "",
    @SerializedName("Nation")
    var nation: String = "",
    @SerializedName("NickName")
    var nickName: String = "",
    @SerializedName("Phone")
    var phone: String = "",
    @SerializedName("RID")
    var rID: Int = 0,
    @SerializedName("RequestType")
    var requestType: String = "",
    @SerializedName("ServiceType")
    var serviceType: String = ""
)
