package com.a2a.data.model.card.creditcard.enabledisableInternet

data class InternetServicesBody(
    var MailAction: String = "",
    var MailDailyLimit: String = "",
    var InternetAction: String = "",
    var InternetDailyLimit: String = ""
)