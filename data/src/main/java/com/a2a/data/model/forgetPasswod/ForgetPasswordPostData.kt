package com.a2a.data.model.forgetPasswod


import com.google.gson.annotations.SerializedName

data class ForgetPasswordPostData(
    @SerializedName("CustProfile")
    var custProfile: CustProfile = CustProfile()
) {
    data class CustProfile(
        @SerializedName("CustID")
        var custID: String = "",
        @SerializedName("MobileNumber")
        var mobileNumber: String = "",
        @SerializedName("NationalID")
        var nationalID: String = ""
    )
}