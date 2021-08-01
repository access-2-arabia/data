package com.a2a.data.model.logout


import com.google.gson.annotations.SerializedName


data class LogoutPostData(
    @SerializedName("CustProfile")
    var custProfile: CustProfile = CustProfile()
) {
    data class CustProfile(
        @SerializedName("CID")
        var cID: Int = 0,
        @SerializedName("CustID")
        var custID: String = "",
        @SerializedName("RID")
        var rID: Int = 0,
    )
}