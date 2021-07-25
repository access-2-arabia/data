package com.a2a.data.model.authentication


import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class CheckVersionPostData(
    @SerializedName("Version")
    var version: String = ""
) : Parcelable