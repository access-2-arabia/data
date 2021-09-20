package com.a2a.data.model.wu.wuLookup.mexicocity
import com.a2a.network.model.CustProfile
import com.google.gson.annotations.SerializedName


data class MexicoCityPostData(
    @SerializedName("Body")
    var body: Body = Body()
) {
    data class Body(
        @SerializedName("CustProfile")
        var custProfile: CustProfile = CustProfile(),
        @SerializedName("DeviceId")
        var deviceId: String = "",
        @SerializedName("DeviceType")
        var deviceType: String = "",
        @SerializedName("LookUpName")
        var lookUpName: String = "",
        @SerializedName("queryfilter1")
        var queryfilter1: String = "",
        @SerializedName("State")
        var state: String = ""
    )
}