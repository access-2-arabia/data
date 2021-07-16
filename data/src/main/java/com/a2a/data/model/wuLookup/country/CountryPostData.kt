package com.a2a.data.model.wuLookup.country

import android.os.Parcelable
import com.a2a.data.model.CustProfile
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize


data class CountryPostData(
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
        @SerializedName("queryfilter2")
        var queryfilter2: String = ""
    )
}