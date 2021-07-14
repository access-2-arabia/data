package com.a2a.data.model.lookup

import com.google.gson.annotations.SerializedName


data class LookUpResponse(
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
        data class Body(
            @SerializedName("LocX")
            var locX: String = "",
            @SerializedName("LocY")
            var locY: String = "",
            @SerializedName("LookUpName")
            var lookUpName: String = ""
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
            var connectorID: String = "",
            @SerializedName("Device")
            var device: String = "",
            @SerializedName("DeviceID")
            var deviceID: String = "",
            @SerializedName("DeviceToken")
            var deviceToken: String = "",
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
            var sessionID: String = "",
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
            @SerializedName("Banks")
            var banks: List<Bank> = listOf(),
            @SerializedName("Currency")
            var currency: List<Currency> = listOf(),
            @SerializedName("RTGSAccTypes")
            var rTGSAccTypes: List<RTGSAccType> = listOf(),
            @SerializedName("RTGSTransferList")
            var rTGSTransferList: List<RTGSTransfer> = listOf(),
            @SerializedName("Country")
            var CountryList: List<Country> = listOf()
        ) {
            data class Bank(
                @SerializedName("ADesc")
                var aDesc: String = "",
                @SerializedName("AValue")
                var aValue: String = "",
                @SerializedName("DescEnAr")
                var descEnAr: String = "",
                @SerializedName("EDesc")
                var eDesc: String = "",
                @SerializedName("EValue")
                var eValue: String = ""
            )

            data class Currency(
                @SerializedName("ADesc")
                var aDesc: String = "",
                @SerializedName("Code")
                var code: String = "",
                @SerializedName("DescEnAr")
                var descEnAr: String = "",
                @SerializedName("EDesc")
                var eDesc: String = "",
                @SerializedName("ID")
                var iD: Int = 0,
                @SerializedName("ISOCode")
                var iSOCode: String = ""
            )

            data class RTGSAccType(
                @SerializedName("ADesc")
                var aDesc: String = "",
                @SerializedName("AValue")
                var aValue: String = "",
                @SerializedName("DescEnAr")
                var descEnAr: String = "",
                @SerializedName("EDesc")
                var eDesc: String = "",
                @SerializedName("EValue")
                var eValue: String = ""
            )

            data class RTGSTransfer(
                @SerializedName("ADesc")
                var aDesc: String = "",
                @SerializedName("AValue")
                var aValue: String = "",
                @SerializedName("DescEnAr")
                var descEnAr: String = "",
                @SerializedName("EDesc")
                var eDesc: String = "",
                @SerializedName("EValue")
                var eValue: String = ""
            )


            data class Country(
                @SerializedName("ID")
                var iD: String = "",
                @SerializedName("EDesc")
                var countryEDesc: String = "",
                @SerializedName("ADesc")
                var countryADesc: String = "",
                @SerializedName("EValue")
                var countryEValue: String = "",
                @SerializedName("AValue")
                var countryAValue: String = "",
                @SerializedName("Telecom")
                var countryTelecom: String = "",
                @SerializedName("Code")
                var countryCode: String = "",
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