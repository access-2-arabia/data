package com.a2a.data.model.efawateercom


import com.google.gson.annotations.SerializedName

data class BillersPostData(
    @SerializedName("Category")
    var category: String = "",
    @SerializedName("Code")
    var code: String = "",
    @SerializedName("RequestType")
    var requestType: String = ""
)
