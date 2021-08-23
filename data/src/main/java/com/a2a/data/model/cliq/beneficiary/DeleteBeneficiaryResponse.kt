package com.a2a.data.model.cliq.beneficiary

import com.a2a.data.model.Result
import com.google.gson.annotations.SerializedName

data class DeleteBeneficiaryResponse(
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
            @SerializedName("Result")
            var result: Result = Result()
        )
    }

    data class A2AResponse(
        @SerializedName("Body")
        var body: Body = Body(),
        @SerializedName("Footer")
        var footer: Footer = Footer(),
        @SerializedName("Header")
        var header: A2ARequest.Header = A2ARequest.Header()
    ) {
        data class Body(
            @SerializedName("ServiceConfiguration")
            var serviceConfiguration: ServiceConfiguration = ServiceConfiguration()
        ) {
            data class ServiceConfiguration(
                @SerializedName("PWDFlag")
                var pWDFlag: Int = 0
            )
        }
        data class Footer(
            @SerializedName("Signature")
            var signature: String = ""
        )
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