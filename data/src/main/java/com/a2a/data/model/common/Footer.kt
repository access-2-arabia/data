package com.a2a.data.model.common


import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class Footer(
    @SerializedName("Result")
    var result: Result = Result(),
    @SerializedName("Signature")
    var signature: String = ""
) : Parcelable