package com.a2a.data.model.lookup


import com.google.gson.annotations.SerializedName

data class LookPostData(
    @SerializedName("LookUpName")
    var lookUpName: String = ""
)