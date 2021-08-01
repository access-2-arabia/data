package com.a2a.data.model.rate

import com.google.gson.annotations.SerializedName

data class ConvertRatePostData(
    @SerializedName("Currency")
    var currency: Currency = Currency(),
    @SerializedName("StepNumber")
    var stepNumber: String = ""
) {
    data class Currency(
        @SerializedName("AmountFrom")
        var amountFrom: String = "",
        @SerializedName("FromCurrency")
        var fromCurrency: String = "",
        @SerializedName("ToCurrency")
        var toCurrency: String = ""
    )
}

