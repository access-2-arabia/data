package com.a2a.data.model.common


import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize

data class HeaderResponse(
    @SerializedName("GuidID")
    var guidID: String = "",
    @SerializedName("RegionCode")
    var regionCode: String = "",
    @SerializedName("Result")
    var result: Result = Result(),
    @SerializedName("SessionID")
    var sessionID: String = "",
    @SerializedName("SrvID")
    var srvID: Int = 0,
    @SerializedName("TimeStamp")
    var timeStamp: String = ""
)
