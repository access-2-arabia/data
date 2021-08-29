package com.a2a.data.model.card.creditcard.cardpayment

import android.os.Parcelable
import com.a2a.network.model.CustProfile
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
        @SerializedName("CustProfile")
        var custProfile: CustProfile = CustProfile(),
        @SerializedName("StepNumber")
        var stepNumber: String = ""
    ) : Parcelable {
        @Parcelize
        data class Accounts(
            @SerializedName("AccountNumberFrom")
            var accountNumberFrom: String = "",
            @SerializedName("AccountNumberTo")
            var accountNumberTo: String = "",
            @SerializedName("Amount")
            var amount: String = "",
            @SerializedName("Currency")
            var currency: String = "",
            @SerializedName("CurrencyFrom")
            var currencyFrom: String = "",
            @SerializedName("CurrencyTo")
            var currencyTo: String = ""
        ) : Parcelable

        @Parcelize
        data class Cards(
            @SerializedName("Amount")
            var amount: String = "",
            @SerializedName("CardNumber")
            var cardNumber: String = ""
        ) : Parcelable

    }
}
