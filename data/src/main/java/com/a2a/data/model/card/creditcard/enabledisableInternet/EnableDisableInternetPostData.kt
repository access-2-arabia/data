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
        @SerializedName("MailDailyLimit")
        var mailDailyLimit: String = "",
        @SerializedName("Periodicity")
        var periodicity: String = "",
        @SerializedName("MailAction")
        var mailAction: String = "",
        @SerializedName("InternetDailyLimit")
        var internetDailyLimit: String = "",
        @SerializedName("InternetAction")
        var internetAction: String = ""
    )
}