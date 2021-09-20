package com.a2a.data.model.efawateercom.calculatefees
import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize


@Parcelize
data class CalculateFeeseFawatercomPostData(
    @SerializedName("Body")
    var body: Body = Body()
) : Parcelable {
    @Parcelize
    data class Body(
        @SerializedName("AccountNumberFrom")
        var accountNumberFrom: String = "",
        @SerializedName("Amount")
        var amount: String = "",
        @SerializedName("BankRef")
        var bankRef: String = "",
        @SerializedName("BranchCode")
        var branchCode: String = "",
        @SerializedName("CID")
        var cID: Int = 0,
        @SerializedName("CurrencyCodeFrom")
        var currencyCodeFrom: String = "",
        @SerializedName("CurrencyCodeTo")
        var currencyCodeTo: String = "",
        @SerializedName("CurrencyFees")
        var currencyFees: String = "",
        @SerializedName("CustID")
        var custID: String = "",
        @SerializedName("CustMnemonic")
        var custMnemonic: String = "",
        @SerializedName("CustType")
        var custType: String = "",
        @SerializedName("Fees")
        var fees: String = "",
        @SerializedName("StepNumber")
        var stepNumber: Int = 0
    ) : Parcelable
}