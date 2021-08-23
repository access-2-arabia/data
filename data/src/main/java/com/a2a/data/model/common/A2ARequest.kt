package com.a2a.data.model.common

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class A2ARequest<T : Parcelable> constructor(
    @SerializedName("Body")
    var body: T? = null,
    @SerializedName("Footer")
    var footer: Footer = Footer(),
    var srvId: String = "",
    @SerializedName("Header")
    var header: Header = Header(srvID = srvId)
) : Parcelable