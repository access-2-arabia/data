package com.a2a.data.model.login


import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class A2AResponse(
    @SerializedName("Body")
    var body: BodyX? = BodyX(),
    @SerializedName("Footer")
    var footer: FooterX? = FooterX(),
    @SerializedName("Header")
    var header: HeaderX? = HeaderX()
) : Parcelable {

    @Parcelize
    data class BodyX(
        @SerializedName("ServiceConfiguration")
        var serviceConfiguration: ServiceConfiguration? = ServiceConfiguration()
    ) : Parcelable {

        @Parcelize
        data class ServiceConfiguration(
            @SerializedName("PWDFlag")
            var pWDFlag: Int? = 0
        ) : Parcelable
    }


    @Parcelize
    data class FooterX(
        @SerializedName("Signature")
        var signature: String? = ""
    ) : Parcelable

    @Parcelize
    data class HeaderX(
        @SerializedName("GuidID")
        var guidID: String? = "",
        @SerializedName("RegionCode")
        var regionCode: String? = "",
        @SerializedName("Result")
        var result: Result? = Result(),
        @SerializedName("SessionID")
        var sessionID: String? = "",
        @SerializedName("SrvID")
        var srvID: Int? = 0,
        @SerializedName("TimeStamp")
        var timeStamp: String? = ""
    ) : Parcelable {

        @Parcelize
        data class Result(
            @SerializedName("ADesc")
            var aDesc: String? = "",
            @SerializedName("EDesc")
            var eDesc: String? = "",
            @SerializedName("ErrorCode")
            var errorCode: Int? = 0
        ) : Parcelable
    }
}