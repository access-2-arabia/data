package com.a2a.data.model.cliq.settings


import com.a2a.network.model.CustProfile
import com.google.gson.annotations.SerializedName

data class GetAccountsPostData(
    @SerializedName("CustID")
    var custID: String = "",
    @SerializedName("RequestType")
    var requestType: String = "",
    @SerializedName("UType")
    var uType: String = "",
    @SerializedName("UValue")
    var uValue: String = "",
    @SerializedName("CustProfile")
    var custProfile: CustProfile = CustProfile(),
    @SerializedName("RecordId")
    var recordId: String = ""
)
