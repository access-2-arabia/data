package com.a2a.data.model.wuLookup.currency

import com.a2a.data.model.CustProfileModel
import com.google.gson.annotations.SerializedName

data class CurrencyPostData(
    @SerializedName("Body")
    var body: Body = Body()
) {
    data class Body(
        var custProfile: CustProfileModel = CustProfileModel(),
        @SerializedName("DeviceId")
        var deviceId: String = "",
        @SerializedName("DeviceType")
        var deviceType: String = "",
        @SerializedName("LookUpName")
        var lookUpName: String = "",
        @SerializedName("queryfilter1")
        var queryfilter1: String = "",
        @SerializedName("queryfilter2")
        var queryfilter2: String = "",
        @SerializedName("queryfilter3")
        var queryfilter3: String = ""
    )
}