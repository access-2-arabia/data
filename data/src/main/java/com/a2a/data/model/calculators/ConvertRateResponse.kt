package com.a2a.data.model.calculators


import com.a2a.data.model.common.ErrorMsg
import com.a2a.data.model.common.Footer
import com.a2a.data.model.common.HeaderResponse
import com.a2a.data.model.common.ServiceConfiguration
import com.google.gson.annotations.SerializedName

data class ConvertRateResponse(
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
        var header: HeaderResponse = HeaderResponse()
    ) {
        data class Body(
            @SerializedName("Currency")
            var currency: Currency = Currency(),
            @SerializedName("ServiceConfiguration")
            var serviceConfiguration: ServiceConfiguration = ServiceConfiguration()
        ) {
            data class Currency(
                @SerializedName("AllAmt")
                var allAmt: Double = 0.0,
                @SerializedName("AmountFrom")
                var amountFrom: Double = 0.0,
                @SerializedName("AmountTo")
                var amountTo: Double = 0.0,
                @SerializedName("AmtCr")
                var amtCr: Double = 0.0,
                @SerializedName("AmtDb")
                var amtDb: Double = 0.0,
                @SerializedName("AmtToConvert")
                var amtToConvert: Double = 0.0,
                @SerializedName("BillStatus")
                var billStatus: Int = 0,
                @SerializedName("CalculatedAmount")
                var calculatedAmount: Double = 0.0,
                @SerializedName("CanDate")
                var canDate: String = "",
                @SerializedName("Channel")
                var channel: String = "",
                @SerializedName("ChannelID")
                var channelID: Int = 0,
                @SerializedName("DateFrom")
                var dateFrom: String = "",
                @SerializedName("DateTo")
                var dateTo: String = "",
                @SerializedName("DateTrans")
                var dateTrans: String = "",
                @SerializedName("EndDate")
                var endDate: String = "",
                @SerializedName("ErrorCode")
                var errorCode: Int = 0,
                @SerializedName("ErrorEDesc")
                var errorEDesc: String = "",
                @SerializedName("FromCurrency")
                var fromCurrency: String = "",
                @SerializedName("LocalAmtCr")
                var localAmtCr: Double = 0.0,
                @SerializedName("LocalAmtDb")
                var localAmtDb: Double = 0.0,
                @SerializedName("LocalChargeAmt")
                var localChargeAmt: Double = 0.0,
                @SerializedName("LogID")
                var logID: Int = 0,
                @SerializedName("NextPaymentDate")
                var nextPaymentDate: String = "",
                @SerializedName("PortalID")
                var portalID: String = "",
                @SerializedName("Rate")
                var rate: Double = 0.0,
                @SerializedName("ReqChannelCore")
                var reqChannelCore: String = "",
                @SerializedName("ToCurrency")
                var toCurrency: String = "",
                @SerializedName("TotalCr")
                var totalCr: Double = 0.0,
                @SerializedName("TotalDr")
                var totalDr: Double = 0.0,
                @SerializedName("TreasuryRate")
                var treasuryRate: Double = 0.0
            )
        }


    }

}