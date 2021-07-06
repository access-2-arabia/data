package com.a2a.data.model.lookup


import com.google.gson.annotations.SerializedName

data class LookupPostData(
    @SerializedName("LocX")
    var locX: String = "",
    @SerializedName("LocY")
    var locY: String = "",
    @SerializedName("LookUpName")
    var lookUpName: String = ""
)