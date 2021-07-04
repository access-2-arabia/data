package com.a2a.data.model.calculators


import com.a2a.data.model.common.Footer
import com.a2a.data.model.common.Header
import com.google.gson.annotations.SerializedName

data class CalculateInterestRatePostData(
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
            @SerializedName("Amount")
            var amount: String = "",
            @SerializedName("Curr")
            var curr: String = "",
            @SerializedName("Period")
            var period: String = "",
            @SerializedName("StepNumber")
            var stepNumber: String = ""
        )
    }
}