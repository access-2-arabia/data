package com.a2a.data.model.wu.wuLookup.deliveryservices
import com.a2a.data.model.CustProfileModel
import com.google.gson.annotations.SerializedName


data class DeliveryServicesPostData(
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
        var queryfilter1: String = "",
        @SerializedName("queryfilter2")
        var queryfilter2: String = "",
        @SerializedName("queryfilter3")
        var queryfilter3: String = "",
        @SerializedName("queryfilter4")
        var queryfilter4: String = ""
    )
}