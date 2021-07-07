package com.a2a.data.model.common

import com.google.gson.annotations.SerializedName


data class ErrorMsg(
    @SerializedName("ADesc")
    var aDesc: String = "",
    @SerializedName("EDesc")
    var eDesc: String = "",
    @SerializedName("ErrorCode")
    var errorCode: Int = 10000
)