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
        @SerializedName("Amount")
        var amount: Double = 0.0,
        @SerializedName("Periodicity")
        var periodicity: String = "",
        var MailAction: String = "",
        var MailDailyLimit: String = "",
        var InternetAction: String = "",
        var InternetDailyLimit: String = ""

    )
}