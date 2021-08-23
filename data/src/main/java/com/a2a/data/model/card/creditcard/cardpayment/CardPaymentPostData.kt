package com.a2a.data.model.card.creditcard.cardpayment

import com.google.gson.annotations.SerializedName

data class CardPaymentPostData(
    @SerializedName("Body")
    var body: Body = Body()
)  {
    data class Body(
        @SerializedName("Accounts")
        var accounts: Accounts = Accounts(),
        @SerializedName("BranchCode")
        var branchCode: String = "",
        @SerializedName("Cards")
        var cards: Cards = Cards()
    )  {
        data class Accounts(
            @SerializedName("AccountNumber")
            var accountNumber: String = "",
            @SerializedName("Amount")
            var amount: String = "",
            @SerializedName("Currency")
            var currency: String = ""
        )
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
        )
    }
}