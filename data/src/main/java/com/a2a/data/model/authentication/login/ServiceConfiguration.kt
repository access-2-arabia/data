package com.a2a.data.model.authentication.login

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class ServiceConfiguration(
    @SerializedName("AccountType")
    var accountType: String = "",
    @SerializedName("Advertisement")
    var advertisement: String = "",
    @SerializedName("BankName")
    var bankName: String = "",
    @SerializedName("CardType")
    var cardType: String = "",
    @SerializedName("EStatementDate")
    var eStatementDate: String = "",
    @SerializedName("EStatementType")
    var eStatementType: String = "",
    @SerializedName("Fees")
    var fees: String = "",
    @SerializedName("ForgotType")
    var forgotType: String = "",
    @SerializedName("Layout")
    var layout: String = "",
    @SerializedName("LoginType")
    var loginType: String = "",
    @SerializedName("PWDFlag")
    var pWDFlag: Int = 0,
    @SerializedName("RegistrationType")
    var registrationType: String = ""
) : Parcelable