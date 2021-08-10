package com.a2a.data.model.cliq


import com.google.gson.annotations.SerializedName

data class GetCustomerResponse(
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
            @SerializedName("Address")
            var address: String = "",
            @SerializedName("AddressCity")
            var addressCity: String = "",
            @SerializedName("AddressCountry")
            var addressCountry: String = "",
            @SerializedName("AddressSPR")
            var addressSPR: String = "",
            @SerializedName("BirthDate")
            var birthDate: String = "",
            @SerializedName("detCustomerType")
            var detCustomerType: String = "",
            @SerializedName("detPrivateNationality")
            var detPrivateNationality: String = "",
            @SerializedName("DocValidDate")
            var docValidDate: String = "",
            @SerializedName("Gender")
            var gender: String = "",
            @SerializedName("Name")
            var name: String = "",
            @SerializedName("NickName")
            var nickName: String = "",
            @SerializedName("placeOfBirth")
            var placeOfBirth: String = "",
            @SerializedName("RecordId")
            var recordId: String = "",
            @SerializedName("Resident")
            var resident: Boolean = false,
            @SerializedName("Status")
            var status: String = "",
            @SerializedName("Surname")
            var surname: String = "",
            @SerializedName("UType")
            var uType: String = "",
            @SerializedName("UValue")
            var uValue: String = ""
        )

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
            var sessionID: Any = Any(),
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