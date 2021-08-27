package com.a2a.data.model.card.debit.chargeprepaid
import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize


@Parcelize
data class ChargePrepaidPostData(
    @SerializedName("Body")
    var body: Body = Body()
) : Parcelable {
    @Parcelize
    data class Body(
        @SerializedName("Accounts")
        var accounts: Accounts = Accounts(),
        @SerializedName("BankRef")
        var bankRef: String = "",
        @SerializedName("BranchCode")
        var branchCode: String = "",
        @SerializedName("Cards")
        var cards: Cards = Cards(),
        @SerializedName("CustProfile")
        var custProfile: CustProfile = CustProfile(),
        @SerializedName("StepNumber")
        var stepNumber: Int = 0,
        @SerializedName("TRXRefNo")
        var tRXRefNo: String = ""
    ) : Parcelable {
        @Parcelize
        data class Accounts(
            @SerializedName("AccountFrom")
            var accountFrom: String = "",
            @SerializedName("Amount")
            var amount: String = "",
            @SerializedName("CurrencyCodeFrom")
            var currencyCodeFrom: String = "",
            @SerializedName("Fees")
            var fees: String = ""
        ) : Parcelable

        @Parcelize
        data class Cards(
            @SerializedName("CardNumber")
            var cardNumber: String = "",
            @SerializedName("Program")
            var program: String = ""
        ) : Parcelable

        @Parcelize
        data class CustProfile(
            @SerializedName("CID")
            var cID: String = "",
            @SerializedName("CustID")
            var custID: String = "",
            @SerializedName("CustMnemonic")
            var custMnemonic: String = "",
            @SerializedName("CustType")
            var custType: Int = 0
        ) : Parcelable
    }
}