package com.a2a.data.repository.transfer

import com.google.gson.annotations.SerializedName


data class Accounts(
    @SerializedName("AccountNumberFrom")
    var accountNumberFrom: String = "",
    @SerializedName("AccountNumberTo")
    var accountNumberTo: String = "",
    @SerializedName("Amount")
    var amount: String = "",
    @SerializedName("CurrencyFrom")
    var currencyFrom: String = "",
    @SerializedName("CurrencyTo")
    var currencyTo: String? = null
)
