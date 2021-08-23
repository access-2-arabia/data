package com.a2a.data.model.authentication.login

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class LoginDetails(
    @SerializedName("LastFailedLogin")
    var lastFailedLogin: String = "",
    @SerializedName("LastFailedTransfer")
    var lastFailedTransfer: String = "",
    @SerializedName("LastSuccessLogin")
    var lastSuccessLogin: String = "",
    @SerializedName("LastSuccessTransfer")
    var lastSuccessTransfer: String = "",
    @SerializedName("PasswordExpiryDate")
    var passwordExpiryDate: String = "",
    @SerializedName("PasswordExpiryDays")
    var passwordExpiryDays: Int = 0
) : Parcelable
