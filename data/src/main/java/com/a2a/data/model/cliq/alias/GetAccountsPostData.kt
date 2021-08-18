package com.a2a.data.model.cliq.alias


import com.a2a.network.model.CustProfile
import com.google.gson.annotations.SerializedName

data class GetAccountsPostData(
    @SerializedName("CustProfile")
    var custProfile: CustProfile = CustProfile(),
    @SerializedName("SrvID")
    var srvID: String = ""
)

