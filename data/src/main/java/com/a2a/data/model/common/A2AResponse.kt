package com.a2a.data.model.common

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class A2AResponse<R : Parcelable>(
    @SerializedName("Body")
    var body: R? = null,
    @SerializedName("Footer")
    var footer: Footer? = Footer(),
    @SerializedName("Header")
    var header: Header? = Header()
) : Parcelable
