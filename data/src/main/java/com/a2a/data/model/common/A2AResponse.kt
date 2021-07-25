package com.a2a.data.model.common

import com.google.gson.annotations.SerializedName

data class A2AResponse<T> constructor(
    @SerializedName("Body")
    var body: T? = null,
    @SerializedName("Footer")
    var footer: Footer = Footer(),
    @SerializedName("Header")
    var header: HeaderResponse = HeaderResponse()
)