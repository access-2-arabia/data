package com.a2a.data.model.authentication.login

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class DefaultPageMenu(
    @SerializedName("ATitle")
    var aTitle: String = "",
    @SerializedName("ETitle")
    var eTitle: String = "",
    @SerializedName("ID")
    var iD: Int = 0,
    @SerializedName("MenuFlag")
    var menuFlag: Boolean = false
) : Parcelable
