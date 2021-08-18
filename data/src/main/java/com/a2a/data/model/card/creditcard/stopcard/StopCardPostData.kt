package com.a2a.data.model.card.creditcard.stopcard
import com.google.gson.annotations.SerializedName

data class StopCardPostData(
    @SerializedName("Body")
    var body: Body = Body()
) {
    data class Body(
        @SerializedName("CardNumber")
        var cardNumber: String = "",
        @SerializedName("OppReason")
        var oppReason: String = ""
    )
}