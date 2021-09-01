package com.a2a.data.model.card.creditcard.enabledisableInternet

data class InternetServicesBody(
    private var mailAction: String,
    private var mailLimit: String,
    private var internetAction: String,
    private var internetLimit: String
)