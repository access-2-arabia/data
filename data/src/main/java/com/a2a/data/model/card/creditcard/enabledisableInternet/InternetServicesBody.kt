package com.a2a.data.model.card.creditcard.enabledisableInternet

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class InternetServicesBody(
    var MailAction: String = "",
    var MailDailyLimit: String = "",
    var InternetAction: String = "",
    var InternetDailyLimit: String = ""
) : Parcelable