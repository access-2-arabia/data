package com.a2a.data.model.login


import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class A2ARequest(
    @SerializedName("Body")
    var body: Body? = Body(),
    @SerializedName("Footer")
    var footer: Footer? = Footer(),
    @SerializedName("Header")
    var header: Header? = Header()
) : Parcelable {
    @Parcelize
    data class Body(
        @SerializedName("CustProfile")
        var custProfile: CustProfile? = CustProfile(),
        @SerializedName("Email")
        var email: Email? = Email(),
        @SerializedName("StepNumber")
        var stepNumber: Int? = 0
    ) : Parcelable {

        @Parcelize
        data class CustProfile(
            @SerializedName("CID")
            var cID: Int? = 0
        ) : Parcelable

        @Parcelize
        data class Email(
            @SerializedName("Enabled")
            var enabled: Int? = 0,
            @SerializedName("IDS")
            var iDS: List<Int>? = listOf()
        ) : Parcelable
    }

    @Parcelize
    data class Footer(
        @SerializedName("Signature")
        var signature: String? = ""
    ) : Parcelable

    @Parcelize
    data class Header(
        @SerializedName("BankCode")
        var bankCode: String? = "",
        @SerializedName("Channel")
        var channel: String? = "",
        @SerializedName("ConnectorID")
        var connectorID: String? = "",
        @SerializedName("Device")
        var device: String? = "",
        @SerializedName("DeviceID")
        var deviceID: String? = "",
        @SerializedName("GuidID")
        var guidID: String? = "",
        @SerializedName("MethodName")
        var methodName: String? = "",
        @SerializedName("Password")
        var password: String? = "",
        @SerializedName("RegionCode")
        var regionCode: String? = "",
        @SerializedName("ServiceID")
        var serviceID: Int? = 0,
        @SerializedName("SessionID")
        var sessionID: String? = "",
        @SerializedName("SrvID")
        var srvID: String? = "",
        @SerializedName("TimeStamp")
        var timeStamp: String? = "",
        @SerializedName("UserID")
        var userID: String? = ""
    ) : Parcelable
}