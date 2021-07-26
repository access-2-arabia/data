package com.a2a.data.model.efawateercom.myBills


import com.google.gson.annotations.SerializedName

data class MyBillPostData(

    @SerializedName("CID")
    var cID: Int = 0,
    @SerializedName("CustID")
    var custID: String = "",
    @SerializedName("RID")
    var rID: Int = 0,
    @SerializedName("RequestType")
    var requestType: String = ""
)