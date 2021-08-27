package com.a2a.data.model.card.debit.chargeprepaid

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize


@Parcelize
data class ChargePrepaidValidationPostData(
    @SerializedName("Body")
    var body: Body = Body()
) : Parcelable {
    @Parcelize
    data class Body(
        @SerializedName("AccountNumberFrom")
        var accountNumberFrom: String = "",
        @SerializedName("AccountNumberTo")
        var accountNumberTo: String = "",
        @SerializedName("Amount")
        var amount: String = "",
        @SerializedName("BankRef")
        var bankRef: String = "",
        @SerializedName("BranchCode")
        var branchCode: String = "",
        @SerializedName("CurrencyCodeFrom")
        var currencyCodeFrom: String = "",
        @SerializedName("CurrencyCodeTo")
        var currencyCodeTo: String = "",
        @SerializedName("StepNumber")
        var stepNumber: String = ""
    ) : Parcelable
}