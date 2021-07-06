package com.a2a.data.model.calculators


import com.a2a.data.model.common.Footer
import com.a2a.data.model.common.Header
import com.google.gson.annotations.SerializedName

data class ConvertRatePostData(
    @SerializedName("A2ARequest")
    var a2ARequest: A2ARequest = A2ARequest()
) {
    data class A2ARequest(
        @SerializedName("Body")
        var body: Body = Body(),
        @SerializedName("Footer")
        var footer: Footer = Footer(),
        @SerializedName("Header")
        var header: Header = Header()
    ) {
        data class Body(
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


    }
}