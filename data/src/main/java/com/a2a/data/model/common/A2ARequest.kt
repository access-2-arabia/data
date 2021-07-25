package com.a2a.data.model.common

import com.google.gson.annotations.SerializedName

data class A2ARequest<T> constructor(
    @SerializedName("Body")
    var body: T? = null,
    @SerializedName("Footer")
    var footer: Footer = Footer(),
    var srvId: String = "",
    @SerializedName("Header")
    var header: Header = Header(srvID = srvId)
)