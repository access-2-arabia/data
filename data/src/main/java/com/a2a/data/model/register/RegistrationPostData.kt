package com.a2a.data.model.register

import com.google.gson.annotations.SerializedName

data class RegistrationPostData(
    @SerializedName("Body")
    var body: Body = Body()
) {
    data class Body(
        @SerializedName("PAN")
        var pAN: String = "",
        @SerializedName("PIN")
        var pIN: String = "",
        @SerializedName("RegionCode")
        var regionCode: String = "",
        @SerializedName("CustProfile")
        var custProfile: CustProfile = CustProfile()
    )  {
        data class CustProfile(
            @SerializedName("MobileNumber")
            var mobileNumber: String = ""
        )
    }
}