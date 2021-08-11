package com.a2a.data.model.cliq.createProfile


import com.google.gson.annotations.SerializedName

data class ReactivateAccountPostData(

    @SerializedName("CustID")
    var custID: String = "",
    @SerializedName("RecordId")
    var recordId: String = "",
    @SerializedName("RequestType")
    var requestType: String = ""
)