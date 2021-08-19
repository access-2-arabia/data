package com.a2a.data.model.card.creditcard.lasttransaction

import com.google.gson.annotations.SerializedName



data class CardLastTransactionPostData(
    @SerializedName("Body")
    var body: Body = Body()
) {
    data class Body(
        @SerializedName("CardNumber")
        var cardNumber: String = "",
        @SerializedName("DateFrom")
        var dateFrom: String = "",
        @SerializedName("DateTo")
        var dateTo: String = "",
        @SerializedName("RegionCode")
        var regionCode: String = ""
    )
}