package com.a2a.data.model.authentication

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class ForgetPasswordPostData(
    @SerializedName("CustProfile")
    var custProfile: CustProfile? = CustProfile()
) : Parcelable {
    @Parcelize
    data class CustProfile(
        @SerializedName("CustID")
        var custID: String? = "",
        @SerializedName("MobileNumber")
        var mobileNumber: String? = "",
        @SerializedName("NationalID")
        var nationalID: String? = ""
    ) : Parcelable
}