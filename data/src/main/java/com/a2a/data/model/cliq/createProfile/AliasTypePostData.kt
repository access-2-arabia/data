package com.a2a.data.model.cliq.createProfile


import com.google.gson.annotations.SerializedName

data class AliasTypePostData(
    @SerializedName("CustID")
    var custID: String = "",
    @SerializedName("LookUpName")
    var lookUpName: String = ""
)