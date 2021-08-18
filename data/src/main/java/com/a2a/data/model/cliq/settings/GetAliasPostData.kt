package com.a2a.data.model.cliq.settings


import com.google.gson.annotations.SerializedName

data class GetAliasPostData(

    @SerializedName("CustID")
    var custID: String = "",
    @SerializedName("RecordId")
    var recordId: String = "",
    @SerializedName("RequestType")
    var requestType: String = ""
)
