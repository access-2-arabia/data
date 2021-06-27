package com.a2a.data.model.authentication


import com.a2a.data.model.common.CustProfile
import com.a2a.data.model.common.Footer
import com.a2a.data.model.common.Header
import com.google.gson.annotations.SerializedName

data class LoginResponse(
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
            @SerializedName("AuthCountry")
            var authCountry: List<Any> = listOf(),
            @SerializedName("Authenticate")
            var authenticate: Authenticate = Authenticate(),
            @SerializedName("CustProfile")
            var custProfile: CustProfile = CustProfile(),
            @SerializedName("LoginDetails")
            var loginDetails: LoginDetails = LoginDetails(),
            @SerializedName("ActivityLog")
            var activityLog: ActivityLog = ActivityLog(),
            @SerializedName("OTP")
            var oTP: OTP = OTP(),
            @SerializedName("ServiceConfiguration")
            var serviceConfiguration: ServiceConfiguration = ServiceConfiguration(),

            ) {
            data class ActivityLog(
                @SerializedName("LastFailedTransfer")
                var lastFailedTransfer: String = "",
                @SerializedName("LastSuccessTransfer")
                var lastSuccessTransfer: String = "",
                @SerializedName("NoOfFailExternalTrx")
                var noOfFailExternalTrx: Int = 0,
                @SerializedName("NoOfFailInternalTrx")
                var noOfFailInternalTrx: Int = 0,
                @SerializedName("NoOfFailInternationalTrx")
                var noOfFailInternationalTrx: Int = 0,
                @SerializedName("NoOfSuccExternalTrx")
                var noOfSuccExternalTrx: Int = 0,
                @SerializedName("NoOfSuccInternalTrx")
                var noOfSuccInternalTrx: Int = 0,
                @SerializedName("NoOfSuccInternationalTrx")
                var noOfSuccInternationalTrx: Int = 0
            )

            data class LoginDetails(
                @SerializedName("LastFailedLogin")
                var lastFailedLogin: String = "",
                @SerializedName("LastSuccessLogin")
                var lastSuccessLogin: String = "",
                @SerializedName("NoSuccLogin")
                var noSuccLogin: Int = 0,
                @SerializedName("PasswordExpiryDate")
                var passwordExpiryDate: String = "",
                @SerializedName("PasswordExpiryDays")
                var passwordExpiryDays: Int = 0
            )

            data class Authenticate(
                @SerializedName("UTR")
                var uTR: String = ""
            )


            data class OTP(
                @SerializedName("OTPLength")
                var oTPLength: Int = 0,
                @SerializedName("OTPTimer")
                var oTPTimer: Int = 0
            )

            data class ServiceConfiguration(
                @SerializedName("PWDFlag")
                var pWDFlag: Int = 0
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