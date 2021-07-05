package com.a2a.data.model.common

import com.google.gson.annotations.SerializedName

data class ServiceConfiguration(
    @SerializedName("PWDFlag")
    var pWDFlag: Int = 0
)