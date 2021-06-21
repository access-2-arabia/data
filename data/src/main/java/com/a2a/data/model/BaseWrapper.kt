package com.a2a.data.model

import com.google.gson.annotations.SerializedName

data class BaseWrapper<T>(
    @SerializedName("Header")
    var code: Int = 0,
    @SerializedName("data")
    var data: T? = null,
    @SerializedName("status")
    var status: String = ""
)