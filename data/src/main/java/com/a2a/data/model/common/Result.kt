package com.a2a.data.model.common

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class Result(
    @SerializedName("ADesc")
    var aDesc: String? = "",
    @SerializedName("EDesc")
    var eDesc: String? = "",
    @SerializedName("ErrorCode")
    var errorCode: Int? = 0
) : Parcelable