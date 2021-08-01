package com.a2a.data.model.wu.feeinquire

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class CrossCurrencyPostData(
    var fromAccountNumber: String = "",
    var fromAccountType: String = "",
    var fromCurrency: String = "",
    var toBeneficiaryAccount: String = "",
    var toBeneficiaryCurrency: String = "",
    var toBeneficiaryType: String = "",
    var amount: String = ""
) : Parcelable