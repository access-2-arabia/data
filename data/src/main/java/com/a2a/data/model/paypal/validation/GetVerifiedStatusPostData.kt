package com.a2a.data.model.paypal.validation
import com.a2a.network.model.CustProfile
import com.google.gson.annotations.SerializedName


data class GetVerifiedStatusPostData(
    @SerializedName("Body")
    var body: Body = Body()
) {
    data class Body(
        @SerializedName("callback")
        var callback: String = "",
        @SerializedName("cancelUrl")
        var cancelUrl: String = "",
        @SerializedName("CustProfile")
        var custProfile: CustProfile = CustProfile(),
        @SerializedName("ipnNotificationUrl")
        var ipnNotificationUrl: String = "",
        @SerializedName("returnUrl")
        var returnUrl: String = "",
        @SerializedName("StepNumber")
        var stepNumber: Int = 0
    )
}