package com.a2a.data.model.efawateercom.postBill


import com.google.gson.annotations.SerializedName

data class PostBillPostData(
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
    @SerializedName("DateFlag")
    var dateFlag: String = "",
    @SerializedName("eMail")
    var eMail: String = "",
    @SerializedName("EndDate")
    var endDate: String = "",
    @SerializedName("ID")
    var iD: String = "",
    @SerializedName("IdType")
    var idType: String = "",
    @SerializedName("IncPayments")
    var incPayments: String = "",
    @SerializedName("MobileNo")
    var mobileNo: String = "",
    @SerializedName("Name")
    var name: String = "",
    @SerializedName("Nation")
    var nation: String = "",
    @SerializedName("Phone")
    var phone: String = "",
    @SerializedName("RID")
    var rID: Int = 0,
    @SerializedName("RequestType")
    var requestType: String = "",
    @SerializedName("ServiceType")
    var serviceType: String = "",
    @SerializedName("StartDate")
    var startDate: String = ""
)
