package com.a2a.data.model.wu.wuLookup.mexicostate
import com.a2a.data.model.CustProfileModel
import com.google.gson.annotations.SerializedName


data class MexicoStatePostData(
    @SerializedName("Body")
    var body: Body = Body()
) {
    data class Body(
        @SerializedName("CustProfile")
        var custProfile: CustProfileModel = CustProfileModel(),
        @SerializedName("DeviceId")
        var deviceId: String = "",
        @SerializedName("DeviceType")
        var deviceType: String = "",
        @SerializedName("LookUpName")
        var lookUpName: String = "",
        @SerializedName("queryfilter1")
        var queryfilter1: String = ""
    )
}