package com.a2a.data.model.authentication


import com.a2a.network.model.CustProfile
import com.google.gson.annotations.SerializedName

data class MailPostData(
    @SerializedName("CustProfile")
    var custProfile: CustProfile = CustProfile()
)