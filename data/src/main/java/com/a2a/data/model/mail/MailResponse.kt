package com.a2a.data.model.mail


import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class MailResponse(
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
            @SerializedName("Inbox")
            var inbox: List<Inbox?>? = listOf(),
            @SerializedName("Outbox")
            var outbox: List<Outbox?>? = listOf(),
            @SerializedName("Trash")
            var trash: List<Trash?>? = listOf()
        ) : Parcelable {
            @Parcelize
            data class Inbox(
                @SerializedName("ID")
                var iD: Int? = 0,
                @SerializedName("MailDate")
                var mailDate: String? = "",
                @SerializedName("ReadFlag")
                var readFlag: Boolean? = false,
                @SerializedName("Subject")
                var subject: String? = "",
                @SerializedName("Text")
                var text: String? = ""
            ) : Parcelable

            @Parcelize
            data class Outbox(
                @SerializedName("ID")
                var iD: Int? = 0,
                @SerializedName("MailDate")
                var mailDate: String? = "",
                @SerializedName("ReadFlag")
                var readFlag: Boolean? = false,
                @SerializedName("Subject")
                var subject: String? = "",
                @SerializedName("Text")
                var text: String? = ""
            ) : Parcelable

            @Parcelize
            data class Trash(
                @SerializedName("ID")
                var iD: Int? = 0,
                @SerializedName("MailDate")
                var mailDate: String? = "",
                @SerializedName("ReadFlag")
                var readFlag: Boolean? = false,
                @SerializedName("Subject")
                var subject: String? = "",
                @SerializedName("Text")
                var text: String? = ""
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