package com.a2a.data.model.mail


import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize
import android.os.Parcelable

@Parcelize
data class UpdateMailResponse(
    @SerializedName("A2AResponse")
    var a2AResponse: A2AResponse? = A2AResponse(),
    @SerializedName("ErrorMsg")
    var errorMsg: ErrorMsg? = ErrorMsg()
) : Parcelable {
    @Parcelize
    data class A2AResponse(
        @SerializedName("Body")
        var body: Body? = Body(),
        @SerializedName("Footer")
        var footer: Footer? = Footer(),
        @SerializedName("Header")
        var header: Header? = Header()
    ) : Parcelable {
        @Parcelize
        data class Body(
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
        data class Footer(
            @SerializedName("Signature")
            var signature: String? = ""
        ) : Parcelable

        @Parcelize
        data class Header(
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

    @Parcelize
    data class ErrorMsg(
        @SerializedName("ADesc")
        var aDesc: String? = "",
        @SerializedName("EDesc")
        var eDesc: String? = "",
        @SerializedName("ErrorCode")
        var errorCode: Int? = 0
    ) : Parcelable
}