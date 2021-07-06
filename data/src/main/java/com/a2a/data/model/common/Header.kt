package com.a2a.data.model.common

import android.os.Parcelable
import com.a2a.data.extentions.formatToViewTimeStamp
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize
import java.util.*

@Parcelize
data class Header(
    @SerializedName("BankCode")
    var BankCode: String = "CAB",

    @SerializedName("RegionCode")
    var regionCode: String = "02",

    @SerializedName("UserID")
    var UserID: String = "ibank",


    @SerializedName("Password")
    var Password: String = "ibank@123",

    @SerializedName("Channel")
    var channel: String = "M",

    @SerializedName("Device")
    var device: String = "Android",

    @SerializedName("TimeStamp")
    var timeStamp: String = Date().formatToViewTimeStamp(),

    @SerializedName("DeviceID")
    var deviceID: String = "Mobile",

    @SerializedName("GuidID")
    var GuidID: String = "74402e7c-2d79-4a38-b2f8-396fb34c5c40",

    @SerializedName("DeviceToken")
    var deviceToken: String = "0f8378650bed45839fffa9fbcbd72514",

    @SerializedName("ConnectorID")
    var ConnectorID: String = "CB",


    @SerializedName("SrvID")
    var srvID: String = "",

    @SerializedName("ServiceID")
    var serviceID: String = "",

    @SerializedName("SessionID")
    var sessionID: String? = "",


    ):Parcelable

