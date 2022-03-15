package com.a2a.data.model.cliq.qrPayment

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


@Parcelize
data class AdditionalData(
    var billNumber: String? = "",
    var mobileNumber: String?= "",
    var storeLabel: String? = "",
    var loyaltyNumber: String? = "",
    var referenceLabel: String? = "",
    var customerLabel: String? = "",
    var terminalLabel: String? = "",
    var purposeOfTransaction: String? = "",
    var additionalConsumerDataRequest: String? = "",
    var taxInformation: String? = "",
    var merchantChannel: String? = ""
): Parcelable {}

