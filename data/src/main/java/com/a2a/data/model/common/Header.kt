package com.a2a.data.model.common


import android.os.Parcelable
 import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize

data class Header(
    @SerializedName("Channel")
    var channel: String = "M",
    @SerializedName("BankCode")
    var BankCode: String = "ELAB",
    @SerializedName("UserID")
    var UserID: String = "mbank",
    @SerializedName("Password")
    var Password: String = "ibank@123",
    @SerializedName("Device")
    var device: String = "Android",
    @SerializedName("DeviceID")
    var deviceID: String = "0f8378650bed45839fffa9fbcbd72514",
    @SerializedName("DeviceToken")
    var deviceToken: String = "0f8378650bed45839fffa9fbcbd72514",
    @SerializedName("RegionCode")
    var regionCode: String = "01",
    @SerializedName("SrvID")
    var srvID: String = "",
    @SerializedName("SessionID")
    var sessionID: String? = "",
    @SerializedName("IPAddress")
    var iPAddress: String? = "",
) : Parcelable