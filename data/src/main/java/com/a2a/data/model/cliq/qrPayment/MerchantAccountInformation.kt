package com.a2a.data.model.cliq.qrPayment

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class MerchantAccountInformation(
    var merchantID: String = "",
    var BICCode: String = ""
) : Parcelable {
}