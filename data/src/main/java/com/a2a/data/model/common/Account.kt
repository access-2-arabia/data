package com.a2a.data.model.common

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Account(
    @SerializedName("AAccountType")
    var aAccountType: String = "",
    @SerializedName("ACurrency")
    var aCurrency: String = "",
    @SerializedName("AccGroupID")
    var accGroupID: String = "",
    @SerializedName("AccountNumber")
    var accountNumber: String = "",
    @SerializedName("AccountType")
    var accountType: String = "",
    @SerializedName("AvailableBalance")
    var availableBalance: String = "",
    @SerializedName("AvailableBalanceFC")
    var availableBalanceFC: String = "",
    @SerializedName("BlockAmt")
    var blockAmt: Double = 0.0,
    @SerializedName("Branch")
    var branch: String = "",
    @SerializedName("BranchCode")
    var branchCode: String = "",
    @SerializedName("CurrencyCode")
    var currencyCode: String = "",
    @SerializedName("CurrencyISOCode")
    var currencyISOCode: String = "",
    @SerializedName("CurrentBalance")
    var currentBalance: String = "",
    @SerializedName("CurrentBalanceFC")
    var currentBalanceFC: String = "",
    @SerializedName("EAccountType")
    var eAccountType: String = "",
    @SerializedName("ECurrency")
    var eCurrency: String = "",
    @SerializedName("Enabled")
    var enabled: Boolean = false,
    @SerializedName("IBAN")
    var iBAN: String = "",
    @SerializedName("NickName")
    var nickName: String = "",
    @SerializedName("Type")
    var type: String = "",
    var isSelect :Boolean?=false
) : Parcelable {
    override fun toString(): String {
        return nickName
    }
}