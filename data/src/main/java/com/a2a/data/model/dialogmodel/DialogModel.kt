package com.a2a.data.model.dialogmodel

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize


@Parcelize
data class DialogModel(
    var aMessage: String? = "",
    var eMessage: String? = "",
    var errorCode: Int? = 0,
    var image: Int? = 0,
    var approveButton: Boolean? = false,
    var cancelButton: Boolean? = false

) : Parcelable