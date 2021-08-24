package com.a2a.data.model.common

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class A2AResponse<T : Parcelable>(
    @SerializedName("Body")
    var body: T? = null,
    @SerializedName("Footer")
    var footer: FooterResponse = FooterResponse(),
    @SerializedName("Header")
    var header: HeaderResponse = HeaderResponse()
) : Parcelable