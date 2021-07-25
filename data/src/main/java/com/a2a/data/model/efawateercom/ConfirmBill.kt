package com.a2a.data.model.efawateercom

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ConfirmBill(
    val nickName: String,
    val billerName: String,
    val billerCode: String,
    val serviceType: String,
    val referenceNumber: String,
    val billCategory: String,
    val description:String,
    val category:String
):Parcelable
