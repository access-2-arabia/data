package com.a2a.data.model.authentication


import com.a2a.data.model.common.ErrorMsg
import com.a2a.data.model.common.FooterResponse
import com.a2a.data.model.common.HeaderResponse
import com.a2a.network.model.CustProfile
import com.google.gson.annotations.SerializedName

data class ForgotPasswordResponse(
    @SerializedName("A2AResponse")
    var a2AResponse: A2AResponse = A2AResponse(),
    @SerializedName("ErrorMsg")
    var errorMsg: ErrorMsg = ErrorMsg()
) {
    data class A2AResponse(
        @SerializedName("Body")
        var body: Body = Body(),
        @SerializedName("Footer")
        var footer: FooterResponse = FooterResponse(),
        @SerializedName("Header")
        var header: HeaderResponse = HeaderResponse()
    ) {
        data class Body(
            @SerializedName("Authenticate")
            var authenticate: Authenticate = Authenticate(),
            @SerializedName("CustProfile")
            var custProfile: CustProfile = CustProfile(),
            @SerializedName("OTP")
            var oTP: OTP = OTP()
        ) {
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
        }
    }

}