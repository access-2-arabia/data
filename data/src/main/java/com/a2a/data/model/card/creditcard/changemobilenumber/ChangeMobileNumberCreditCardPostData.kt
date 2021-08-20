package com.a2a.data.model.card.creditcard.changemobilenumber
import com.google.gson.annotations.SerializedName


data class ChangeMobileNumberCreditCardPostData(
    @SerializedName("Body")
    var body: Body = Body()
) {
    data class Body(
        @SerializedName("CardNumber")
        var cardNumber: String = "",
        @SerializedName("NewMobNo")
        var newMobNo: String = "",
        @SerializedName("RegionCode")
        var regionCode: String = "",
        @SerializedName("StepNumber")
        var stepNumber: String = ""
    )
}