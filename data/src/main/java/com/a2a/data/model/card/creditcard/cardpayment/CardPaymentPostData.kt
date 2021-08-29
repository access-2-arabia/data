package com.a2a.data.model.card.creditcard.cardpayment

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class CardPaymentPostData(
    @SerializedName("Body")
    var body: Body = Body()
) : Parcelable {
    @Parcelize
    data class Body(
        @SerializedName("Accounts")
        var accounts: Accounts = Accounts(),
        @SerializedName("BranchCode")
        var branchCode: String = "",
        @SerializedName("Cards")
        var cards: Cards = Cards(),
        @SerializedName("StepNumber")
        var StepNumber: String = ""
    ) : Parcelable {
        @Parcelize
        data class Accounts(
            @SerializedName("AccountNumberFrom")
            var AccountNumberFrom: String = "",
            @SerializedName("Amount")
            var amount: String = "",
            @SerializedName("Currency")
            var currency: String = ""
        ) : Parcelable

        @Parcelize
        data class Cards(
            @SerializedName("AccountNumber")
            var accountNumber: String = "",
            @SerializedName("Amount")
            var amount: String = "",
            @SerializedName("CardNumber")
            var cardNumber: String = "",
            @SerializedName("CurrencyFrom")
            var currencyFrom: String = "",
            @SerializedName("CurrencyTo")
            var currencyTo: String = ""
        ) : Parcelable
    }
}