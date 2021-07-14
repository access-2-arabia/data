package com.a2a.data.model.efawateercom


import com.google.gson.annotations.SerializedName

data class CategoriesPostData(
    @SerializedName("RequestType")
    var requestType: String = ""
)