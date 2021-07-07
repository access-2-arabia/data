package com.a2a.data.model


import com.google.gson.annotations.SerializedName

data class LookUpPostData(
    @SerializedName("LookUpName")
    var lookUpName: String? = "",
    @SerializedName("LocX")
    var locX: Double = 0.0,
    @SerializedName("LocY")
    var locY: Double = 0.0
)