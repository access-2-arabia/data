package com.a2a.data.model.efawateercom


import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

data class BillersResponseData(
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
            @SerializedName("Bill")
            var bill: Bill = Bill(),
            @SerializedName("ServiceConfiguration")
            var serviceConfiguration: ServiceConfiguration = ServiceConfiguration()
        ) {
            data class Bill(
                @SerializedName("A2AChannel")
                var a2AChannel: String = "",
                @SerializedName("A2APWD")
                var a2APWD: String = "",
                @SerializedName("A2AUserID")
                var a2AUserID: String = "",
                @SerializedName("Code")
                var code: String = "",
                @SerializedName("Enums")
                var enums: List<Enum> = listOf(),
                @SerializedName("ErrorCode")
                var errorCode: Int = 0,
                @SerializedName("ErrorEDesc")
                var errorEDesc: String = "",
                @SerializedName("SMArImg")
                var sMArImg: String = "",
                @SerializedName("SMArMsg")
                var sMArMsg: String = "",
                @SerializedName("SMEnImg")
                var sMEnImg: String = "",
                @SerializedName("SMEnMsg")
                var sMEnMsg: String = "",
                @SerializedName("Type")
                var type: Int = 0
            ) {

                @Parcelize
                data class Enum(
                    @SerializedName("ADesc")
                    var aDesc: String = "",
                    @SerializedName("ArImg")
                    var arImg: String = "",
                    @SerializedName("ArLogo")
                    var arLogo: String = "",
                    @SerializedName("ArMsg")
                    var arMsg: String = "",
                    @SerializedName("ArShortName")
                    var arShortName: String = "",
                    @SerializedName("BillerSrvType")
                    var billerSrvType: List<BillerSrvType> = listOf(),
                    @SerializedName("Code")
                    var code: String = "",
                    @SerializedName("EDesc")
                    var eDesc: String = "",
                    @SerializedName("Email")
                    var email: String = "",
                    @SerializedName("EnImg")
                    var enImg: String = "",
                    @SerializedName("EnLogo")
                    var enLogo: String = "",
                    @SerializedName("EnMsg")
                    var enMsg: String = "",
                    @SerializedName("EnShortName")
                    var enShortName: String = "",
                    @SerializedName("IntType")
                    var intType: String = "",
                    @SerializedName("Phone")
                    var phone: String = "",
                    @SerializedName("StmtBankCode")
                    var stmtBankCode: String = "",
                    @SerializedName("Website")
                    var website: String = ""
                ) : Parcelable {
                    @Parcelize
                    data class BillerSrvType(
                        @SerializedName("ADesc")
                        var aDesc: String = "",
                        @SerializedName("ALabel")
                        var aLabel: String = "",
                        @SerializedName("ArImg")
                        var arImg: String = "",
                        @SerializedName("ArLblShortDesc")
                        var arLblShortDesc: String = "",
                        @SerializedName("ArShortDesc")
                        var arShortDesc: String = "",
                        @SerializedName("BillingNoFlag")
                        var billingNoFlag: Boolean = false,
                        @SerializedName("Code")
                        var code: String = "",
                        @SerializedName("DenoFlag")
                        var denoFlag: Boolean = false,
                        @SerializedName("Denominations")
                        var denominations: List<Denomination> = listOf(),
                        @SerializedName("EDesc")
                        var eDesc: String = "",
                        @SerializedName("ELabel")
                        var eLabel: String = "",
                        @SerializedName("EnImg")
                        var enImg: String = "",
                        @SerializedName("EnLblShortDesc")
                        var enLblShortDesc: String = "",
                        @SerializedName("EnShortDesc")
                        var enShortDesc: String = "",
                        @SerializedName("MArImg")
                        var mArImg: String = "",
                        @SerializedName("MArMsg")
                        var mArMsg: String = "",
                        @SerializedName("MEnImg")
                        var mEnImg: String = "",
                        @SerializedName("MEnMsg")
                        var mEnMsg: String = "",
                        @SerializedName("Postpaid")
                        var postpaid: Boolean = false
                    ) : Parcelable {
                        @Parcelize
                        data class Denomination(
                            @SerializedName("ADesc")
                            var aDesc: String = "",
                            @SerializedName("ArShortDesc")
                            var arShortDesc: String = "",
                            @SerializedName("Code")
                            var code: String = "",
                            @SerializedName("EDesc")
                            var eDesc: String = "",
                            @SerializedName("EnShortDesc")
                            var enShortDesc: String = "",
                            @SerializedName("Type")
                            var type: String = ""
                        ) : Parcelable
                    }
                }
            }

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