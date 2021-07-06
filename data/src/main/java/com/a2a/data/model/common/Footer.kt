package com.a2a.data.model.common

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize


@Parcelize
data class Footer(
    @SerializedName("Signature")
    var signature: String = ""
):Parcelable