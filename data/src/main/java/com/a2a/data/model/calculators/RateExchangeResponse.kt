package com.a2a.data.model.calculators


import com.a2a.data.model.common.ErrorMsg
import com.a2a.data.model.common.Footer
import com.a2a.data.model.common.Header
import com.a2a.data.model.common.ServiceConfiguration
import com.google.gson.annotations.SerializedName

data class RateExchangeResponse(
    @SerializedName("A2AResponse")
    var a2AResponse: A2AResponse = A2AResponse(),
    @SerializedName("ErrorMsg")
    var errorMsg: ErrorMsg = ErrorMsg()
) {
    data class A2AResponse(
        @SerializedName("Body")
        var body: Body = Body(),
        @SerializedName("Footer")
        var footer: Footer = Footer(),
        @SerializedName("Header")
        var header: Header = Header()
    ) {
        data class Body(
            @SerializedName("FXRate")
            var fXRate: List<FXRate> = listOf(),
            @SerializedName("ServiceConfiguration")
            var serviceConfiguration: ServiceConfiguration = ServiceConfiguration()
        ) {
            data class FXRate(
                @SerializedName("ADesc")
                var aDesc: String = "",
                @SerializedName("BuyRate")
                var buyRate: Double = 0.0,
                @SerializedName("CED")
                var cED: String = "",
                @SerializedName("CurrencyCode")
                var currencyCode: String = "",
                @SerializedName("CurrencyISOCode")
                var currencyISOCode: String = "",
                @SerializedName("CurrencyImage")
                var currencyImage: String = "",
                @SerializedName("DateRate")
                var dateRate: String = "",
                @SerializedName("DecimalPoints")
                var decimalPoints: Int = 0,
                @SerializedName("EDesc")
                var eDesc: String = "",
                @SerializedName("MaxRate")
                var maxRate: Double = 0.0,
                @SerializedName("MidRate")
                var midRate: Double = 0.0,
                @SerializedName("MinRate")
                var minRate: Double = 0.0,
                @SerializedName("SellRate")
                var sellRate: Double = 0.0
            )


        }
    }
}