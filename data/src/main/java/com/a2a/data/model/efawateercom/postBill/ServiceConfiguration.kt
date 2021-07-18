package com.a2a.data.model.efawateercom.postBill

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ServiceConfiguration(
    @SerializedName("PWDFlag")
    var pWDFlag: Int = 0
) : Parcelable
