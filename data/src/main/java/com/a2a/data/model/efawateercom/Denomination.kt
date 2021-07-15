package com.a2a.data.model.efawateercom

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Denomination(
    @SerializedName("ADesc")
    var aDesc: String = "",
    @SerializedName("ArShortDesc")
    var arShortDesc: String = "",
    @SerializedName("Code")
    var code: String = "",
    @SerializedName("EDesc")
    var eDesc: String = "",
    @SerializedName("EnShortDesc")
    var enShortDesc: String = "",
    @SerializedName("Type")
    var type: String = ""
) : Parcelable