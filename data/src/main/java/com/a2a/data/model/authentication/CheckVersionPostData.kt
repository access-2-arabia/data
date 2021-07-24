package com.a2a.data.model.authentication


import com.google.gson.annotations.SerializedName

data class CheckVersionPostData(
    @SerializedName("Version")
    var version: String = ""
)