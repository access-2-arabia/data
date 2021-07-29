package com.a2a.data.model.card.creditcard
import com.google.gson.annotations.SerializedName


data class CreditCardPostData(
    @SerializedName("Body")
    var body: Body = Body()
) {
    data class Body(
        @SerializedName("CardType")
        var cardType: String = "",
        @SerializedName("CustID")
        var custID: String = "",
        @SerializedName("MaskPan")
        var maskPan: String = "",
        @SerializedName("RIMNumber")
        var rIMNumber: String = "",
        @SerializedName("RegionCode")
        var regionCode: String = ""
    )
}