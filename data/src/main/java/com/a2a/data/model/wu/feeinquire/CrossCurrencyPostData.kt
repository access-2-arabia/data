package com.a2a.data.model.wu.feeinquire

import android.os.Parcelable
import com.a2a.network.model.CustProfile
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class CrossCurrencyPostData(
    @SerializedName("CustProfile")
    var custProfile: CustProfile = CustProfile(),
    var fromAccountNumber: String = "",
    var fromAccountType: String = "",
    var fromCurrency: String = "",
    var toBeneficiaryAccount: String = "",
    var toBeneficiaryCurrency: String = "",
    var toBeneficiaryType: String = "",
    var amount: String = ""
) : Parcelable