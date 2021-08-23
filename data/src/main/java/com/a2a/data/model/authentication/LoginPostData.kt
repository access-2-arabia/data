package com.a2a.data.model.authentication


import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class LoginPostData(
    @SerializedName("CustProfile")
    var custProfile: CustProfile = CustProfile()
) : Parcelable {
    @Parcelize
    data class CustProfile(
        @SerializedName("CustMnemonic")
        var custMnemonic: String? = null,
        @SerializedName("PWD")
        var pWD: String? = null
    ) : Parcelable
}
