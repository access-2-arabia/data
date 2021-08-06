package com.a2a.data.model.mail


import android.os.Parcelable
import com.a2a.data.model.common.ErrorMsg
import com.a2a.data.model.common.Footer
import com.a2a.data.model.common.HeaderResponse
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class MailResponse(
    @SerializedName("A2AResponse")
    var a2AResponse: A2AResponse = A2AResponse(),
    @SerializedName("ErrorMsg")
    var errorMsg: ErrorMsg = ErrorMsg()
) : Parcelable {
    @Parcelize
    data class A2AResponse(
        @SerializedName("Body")
        var body: MailBody = MailBody(),
        @SerializedName("Footer")
        var footer: Footer = Footer(),
        @SerializedName("Header")
        var header: HeaderResponse = HeaderResponse()
    ) : Parcelable
}