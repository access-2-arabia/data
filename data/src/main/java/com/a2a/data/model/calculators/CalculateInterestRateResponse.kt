package com.a2a.data.model.calculators


import com.a2a.data.model.common.ErrorMsg
import com.a2a.data.model.common.Footer
import com.a2a.data.model.common.HeaderResponse
import com.a2a.data.model.common.ServiceConfiguration
import com.google.gson.annotations.SerializedName

data class CalculateInterestRateResponse(
    @SerializedName("A2AResponse")
    var a2AResponse: A2AResponse = A2AResponse(),
    @SerializedName("ErrorMsg")
    var errorMsg: ErrorMsg = ErrorMsg()
) {

    data class A2AResponse(
        @SerializedName("Body")
        var body: Body = Body(),
        @SerializedName("Footer")
        var footer: Footer = Footer(),
        @SerializedName("Header")
        var header: HeaderResponse = HeaderResponse()
    ) {
        data class Body(
            @SerializedName("Amount")
            var amount: Double = 0.0,
            @SerializedName("InterestRate")
            var interestRate: Double = 0.0,
            @SerializedName("MonthlyRate")
            var monthlyRate: Double = 0.0,
            @SerializedName("ServiceConfiguration")
            var serviceConfiguration: ServiceConfiguration = ServiceConfiguration()
        )

    }
}
