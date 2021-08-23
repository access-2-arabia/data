package com.a2a.data.model.register


import com.google.gson.annotations.SerializedName

data class CustomerSignatureRegistrationPostData(
    @SerializedName("Body")
    var body: Body = Body()
) {
    data class Body(
        @SerializedName("IsSignature")
        var isSignature: Boolean =false,
        @SerializedName("CustProfile")
        var custProfile: CustProfile = CustProfile(),
        @SerializedName("StepNumber")
        var stepNumber: String = ""
    ) {
        data class CustProfile(
            @SerializedName("CustID")
            var custID: String = ""
        )
    }
}