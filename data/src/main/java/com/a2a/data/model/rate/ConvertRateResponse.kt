package com.a2a.data.model.rate


import com.google.gson.annotations.SerializedName

data class ConvertRateResponse(
    @SerializedName("A2ARequest")
    var a2ARequest: A2ARequest = A2ARequest(),
    @SerializedName("A2AResponse")
    var a2AResponse: A2AResponse = A2AResponse(),
    @SerializedName("ErrorMsg")
    var errorMsg: ErrorMsg = ErrorMsg()
) {
    data class A2ARequest(
        @SerializedName("Body")
        var body: Body = Body(),
        @SerializedName("Footer")
        var footer: Footer = Footer(),
        @SerializedName("Header")
        var header: Header = Header()
    ) {
        class Body(
        )

        data class Footer(
            @SerializedName("Signature")
            var signature: String = ""
        )

        data class Header(
            @SerializedName("BankCode")
            var bankCode: String = "",
            @SerializedName("Channel")
            var channel: String = "",
            @SerializedName("ConnectorID")
            var connectorID: Any = Any(),
            @SerializedName("Device")
            var device: Any = Any(),
            @SerializedName("DeviceID")
            var deviceID: Any = Any(),
            @SerializedName("DeviceToken")
            var deviceToken: Any = Any(),
            @SerializedName("GuidID")
            var guidID: String = "",
            @SerializedName("MethodName")
            var methodName: String = "",
            @SerializedName("Password")
            var password: String = "",
            @SerializedName("RegionCode")
            var regionCode: String = "",
            @SerializedName("ServiceID")
            var serviceID: Int = 0,
            @SerializedName("SessionID")
            var sessionID: Any = Any(),
            @SerializedName("SrvID")
            var srvID: String = "",
            @SerializedName("TimeStamp")
            var timeStamp: String = "",
            @SerializedName("UserID")
            var userID: String = ""
        )
    }

    data class A2AResponse(
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

            data class ServiceConfiguration(
                @SerializedName("PWDFlag")
                var pWDFlag: Int = 0
            )
        }

        data class Footer(
            @SerializedName("Signature")
            var signature: String = ""
        )

        data class Header(
            @SerializedName("GuidID")
            var guidID: String = "",
            @SerializedName("RegionCode")
            var regionCode: String = "",
            @SerializedName("Result")
            var result: Result = Result(),
            @SerializedName("SessionID")
            var sessionID: String = "",
            @SerializedName("SrvID")
            var srvID: Int = 0,
            @SerializedName("TimeStamp")
            var timeStamp: String = ""
        ) {
            data class Result(
                @SerializedName("ADesc")
                var aDesc: String = "",
                @SerializedName("EDesc")
                var eDesc: String = "",
                @SerializedName("ErrorCode")
                var errorCode: Int = 0
            )
        }
    }

    data class ErrorMsg(
        @SerializedName("ADesc")
        var aDesc: String = "",
        @SerializedName("EDesc")
        var eDesc: String = "",
        @SerializedName("ErrorCode")
        var errorCode: Int = 0
    )
}