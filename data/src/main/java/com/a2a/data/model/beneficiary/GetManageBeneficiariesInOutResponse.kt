package com.a2a.data.model.beneficiary
import com.google.gson.annotations.SerializedName


data class GetManageBeneficiariesInOutResponse(
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
            @SerializedName("BeneficiaryIn")
            var beneficiaryIn: List<BeneficiaryIn> = listOf(),
            @SerializedName("BeneficiaryOut")
            var beneficiaryOut: List<Any> = listOf(),
            @SerializedName("ServiceConfiguration")
            var serviceConfiguration: ServiceConfiguration = ServiceConfiguration()
        ) {
            data class BeneficiaryIn(
                @SerializedName("ADesc")
                var aDesc: String = "",
                @SerializedName("Address")
                var address: String = "",
                @SerializedName("AdminFlag")
                var adminFlag: Boolean = false,
                @SerializedName("AliasType")
                var aliasType: String = "",
                @SerializedName("Attr")
                var attr: String = "",
                @SerializedName("BankCode")
                var bankCode: String = "",
                @SerializedName("BankName")
                var bankName: String = "",
                @SerializedName("BenType")
                var benType: String = "",
                @SerializedName("Branch")
                var branch: String = "",
                @SerializedName("City")
                var city: String = "",
                @SerializedName("ClientAccNo")
                var clientAccNo: String = "",
                @SerializedName("ClientName")
                var clientName: String = "",
                @SerializedName("Country")
                var country: String = "",
                @SerializedName("CustID")
                var custID: Int = 0,
                @SerializedName("EDesc")
                var eDesc: String = "",
                @SerializedName("Enabled")
                var enabled: Boolean = false,
                @SerializedName("FName")
                var fName: String = "",
                @SerializedName("IBAN")
                var iBAN: String = "",
                @SerializedName("ID")
                var iD: Int = 0,
                @SerializedName("ISCliq")
                var iSCliq: Boolean = false,
                @SerializedName("LName")
                var lName: String = "",
                @SerializedName("RegionCode")
                var regionCode: String = "",
                @SerializedName("SName")
                var sName: String = "",
                @SerializedName("Swift")
                var swift: String = "",
                @SerializedName("TName")
                var tName: String = "",
                @SerializedName("TblCust")
                var tblCust: Any = Any(),
                @SerializedName("Trusted")
                var trusted: Boolean = false
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