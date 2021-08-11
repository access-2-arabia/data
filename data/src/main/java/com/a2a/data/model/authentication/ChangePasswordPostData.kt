package com.a2a.data.model.authentication


import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class ChangePasswordPostData(
    @SerializedName("CustProfile")
    var custProfile: CustProfile = CustProfile()
) : Parcelable{
    @Parcelize
    data class CustProfile(
        @SerializedName("CID")
        var cID: Int = 0,
        @SerializedName("CustID")
        var custID: String = "",
        @SerializedName("PasswordOld")
        var passwordOld: String = "",
        @SerializedName("Password")
        var password: String = ""
    ) : Parcelable
}


