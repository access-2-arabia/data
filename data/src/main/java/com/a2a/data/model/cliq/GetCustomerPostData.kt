package com.a2a.data.model.cliq

import com.google.gson.annotations.SerializedName

data class GetCustomerPostData(
    @SerializedName("CustID")
    var custID: String = "",
    @SerializedName("RequestType")
    var requestType: String = "",
    @SerializedName("UType")
    var uType: String = "",
    @SerializedName("UValue")
    var uValue: String = ""
)