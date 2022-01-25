package com.a2a.data.model.paypal.validation
import com.google.gson.annotations.SerializedName


data class GetVerifiedStatusResponse(
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
        class Body

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
            @SerializedName("AccountStatus")
            var accountStatus: String = "",
            @SerializedName("CountryCode")
            var countryCode: String = "",
            @SerializedName("ElapsedTime")
            var elapsedTime: String = "",
            @SerializedName("ErrorADesc")
            var errorADesc: String = "",
            @SerializedName("ErrorCode")
            var errorCode: String = "",
            @SerializedName("ErrorEDesc")
            var errorEDesc: String = "",
            @SerializedName("RegisterType")
            var registerType: String = "",
            @SerializedName("ResponseEnvelope")
            var responseEnvelope: ResponseEnvelope = ResponseEnvelope(),
            @SerializedName("URL")
            var uRL: String = "",
            @SerializedName("UserInfo")
            var userInfo: UserInfo = UserInfo()
        ) {
            data class ResponseEnvelope(
                @SerializedName("Ack")
                var ack: String = "",
                @SerializedName("Build")
                var build: String = "",
                @SerializedName("CorrelationId")
                var correlationId: String = "",
                @SerializedName("Timestamp")
                var timestamp: String = ""
            )

            data class UserInfo(
                @SerializedName("AccountId")
                var accountId: String = "",
                @SerializedName("AccountType")
                var accountType: String = "",
                @SerializedName("BusinessName")
                var businessName: String = "",
                @SerializedName("EmailAddress")
                var emailAddress: String = "",
                @SerializedName("Name")
                var name: Name = Name()
            ) {
                data class Name(
                    @SerializedName("FirstName")
                    var firstName: String = "",
                    @SerializedName("LastName")
                    var lastName: String = "",
                    @SerializedName("MiddleName")
                    var middleName: String = "",
                    @SerializedName("Salutation")
                    var salutation: String = "",
                    @SerializedName("Suffix")
                    var suffix: String = ""
                )
            }
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