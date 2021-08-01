package com.a2a.data.model.dialogmodel

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


@Parcelize
data class DialogModel(

    var message: String? = "",
    var image: Int? = 0,
    var approveButton: Boolean? = false,
    var cancelButton: Boolean? = false,
    var buttonvisability:Boolean?=false

) : Parcelable