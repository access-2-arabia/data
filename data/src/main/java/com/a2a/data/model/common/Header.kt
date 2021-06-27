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
    var deviceID: String = MemoryCacheImpl.getDeviceId(),
    @SerializedName("DeviceToken")
    var deviceToken: String = MemoryCacheImpl.getDeviceId(),
    @SerializedName("RegionCode")
    var regionCode: String = "01",
    @SerializedName("SrvID")
    var srvID: String = "",
    @SerializedName("SessionID")
    var sessionID: String? = MemoryCacheImpl.getSessionID(),
    @SerializedName("IPAddress")
    var iPAddress: String? = MemoryCacheImpl.getIpAddress(),
    @SerializedName("Result")
    var result: Result? = Result()
) : Parcelable
