package com.a2a.data.model.cliq.pendingRequest

import com.a2a.network.model.CustProfile
import com.google.gson.annotations.SerializedName

data class ApproveRequestPostData(
    @SerializedName("Payments")
    var payments: ArrayList<Payment> = ArrayList(),
    @SerializedName("CustProfile")
    var custProfile: CustProfile = CustProfile()
) {
    data class Payment(
        @SerializedName("Amount")
        var amount: Double = 0.0,
        @SerializedName("CdtrAcct")
        var cdtrAcct: String = "",
        @SerializedName("CdtrAgt")
        var cdtrAgt: String = "",
        @SerializedName("CdtrName")
        var cdtrName: String = "",
        @SerializedName("Curr")
        var curr: String = "",
        @SerializedName("DbtrAcct")
        var dbtrAcct: String = "",
        @SerializedName("DbtrAgt")
        var dbtrAgt: String = "",
        @SerializedName("DbtrName")
        var dbtrName: String = "",
        @SerializedName("OrgnlMsgId")
        var orgnlMsgId: String = "",
        @SerializedName("RTPStatus")
        var rTPStatus: String = "",
        @SerializedName("RejectADdInfo")
        var rejectADdInfo: String = "",
        @SerializedName("RejectReason")
        var rejectReason: String = ""
    )
}
