package com.a2a.data.model.authentication


import com.a2a.network.model.CustProfile
import com.google.gson.annotations.SerializedName

data class ChangePasswordPostData(
    @SerializedName("CustProfile")
    var custProfile: CustProfile = CustProfile()
)


