package com.a2a.data.model.card.creditcard.enabledisableInternet

import com.google.gson.annotations.SerializedName

data class EnableDisableInternetPostData(
    @SerializedName("Body")
    var body: Body = Body()
) {

    data class Body(
        @SerializedName("Action")
        var action: String = "",
        @SerializedName("CardNumber")
        var cardNumber: String = "",
        @SerializedName("RegionCode")
        var regionCode: String = "",
        @SerializedName("StepNumber")
        var stepNumber: String = ""
    )
}