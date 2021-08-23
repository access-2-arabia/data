package com.a2a.data.model.register

import com.a2a.network.model.CustProfile
import com.google.gson.annotations.SerializedName

data class RegistrationPostData(
    @SerializedName("Body")
    var body: Body = Body()
) {
    data class Body(
        @SerializedName("MobileNumber")
        var mobileNumber: String = "",
        @SerializedName("PAN")
        var pAN: String = "",
        @SerializedName("PIN")
        var pIN: String = "",
        @SerializedName("RegionCode")
        var regionCode: String = "",
        @SerializedName("IsSignature")
        var isSignature: Boolean =false,
        @SerializedName("CustProfile")
        var custProfile: CustProfile = CustProfile()
    )
}