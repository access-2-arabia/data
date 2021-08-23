package com.a2a.data.model.authentication.login

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class Menu(
    @SerializedName("ADesc")
    var aDesc: String = "",
    @SerializedName("AValue")
    var aValue: String = "",
    @SerializedName("EDesc")
    var eDesc: String = "",
    @SerializedName("EValue")
    var eValue: String = "",
    @SerializedName("Enabled")
    var enabled: Boolean = false,
    @SerializedName("ID")
    var iD: String = ""
) : Parcelable
