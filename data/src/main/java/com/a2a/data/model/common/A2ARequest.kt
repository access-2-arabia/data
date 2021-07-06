package com.a2a.data.model.common

import com.google.gson.annotations.SerializedName
import java.io.Serializable


data class A2ARequest<T> constructor(
    @SerializedName("Body")
    var body: T? = null,
    @SerializedName("Footer")
    var footer: Footer = Footer(),
    var srvID: String = "",
    var serviceIDValue: Int = 0,
    @SerializedName("Footer")
    var hedar: Header = Header(srvID = srvID, serviceID = serviceIDValue),
) :Serializable