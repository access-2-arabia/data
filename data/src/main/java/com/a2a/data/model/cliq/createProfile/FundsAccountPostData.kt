package com.a2a.data.model.cliq.createProfile


import com.a2a.network.model.CustProfile
import com.google.gson.annotations.SerializedName

data class FundsAccountPostData(
    @SerializedName("CustProfile")
    var custProfile: CustProfile = CustProfile(),
    @SerializedName("SrvID")
    var srvID: String = ""
)