package com.a2a.data.model.authentication


import com.a2a.data.model.common.Header
import com.a2a.network.model.CustProfile
import com.google.gson.annotations.SerializedName

data class ForgotPasswordPostData(
    @SerializedName("A2ARequest")
    var a2ARequest: A2ARequest = A2ARequest()
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
            @SerializedName("CustProfile")
            var custProfile: CustProfile = CustProfile()
        )

        data class Footer(
            @SerializedName("Signature")
            var signature: String = ""
        )
    }
}