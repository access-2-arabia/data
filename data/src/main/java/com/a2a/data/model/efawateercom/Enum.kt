package com.a2a.data.model.efawateercom

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Enum(
    @SerializedName("ADesc")
    var aDesc: String = "",
    @SerializedName("ArImg")
    var arImg: String = "",
    @SerializedName("ArLogo")
    var arLogo: String = "",
    @SerializedName("ArMsg")
    var arMsg: String = "",
    @SerializedName("ArShortName")
    var arShortName: String = "",
    @SerializedName("BillerSrvType")
    var billerSrvType: List<BillerSrvType> = listOf(),
    @SerializedName("Code")
    var code: String = "",
    @SerializedName("EDesc")
    var eDesc: String = "",
    @SerializedName("Email")
    var email: String = "",
    @SerializedName("EnImg")
    var enImg: String = "",
    @SerializedName("EnLogo")
    var enLogo: String = "",
    @SerializedName("EnMsg")
    var enMsg: String = "",
    @SerializedName("EnShortName")
    var enShortName: String = "",
    @SerializedName("IntType")
    var intType: String = "",
    @SerializedName("Phone")
    var phone: String = "",
    @SerializedName("StmtBankCode")
    var stmtBankCode: String = "",
    @SerializedName("Website")
    var website: String = ""
) : Parcelable