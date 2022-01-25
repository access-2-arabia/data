package com.a2a.data.model.paypal.faq

import com.a2a.network.model.CustProfile
import com.google.gson.annotations.SerializedName


data class FAQPostData(
    @SerializedName("Body")
    var body: Body = Body()
) {
    data class Body(
        @SerializedName("CustProfile")
        var custProfile: CustProfile = CustProfile(),
        @SerializedName("PageName")
        var pageName: String = "",
        @SerializedName("StepNumber")
        var stepNumber: Int = 0
    )
}