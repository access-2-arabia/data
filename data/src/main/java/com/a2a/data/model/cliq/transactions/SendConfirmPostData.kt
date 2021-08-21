package com.a2a.data.model.cliq.transactions

import com.google.gson.annotations.SerializedName

data class SendConfirmPostData(

    @SerializedName("CustID")
    var custID: String = "",
    @SerializedName("MsgId")
    var msgId: String = "",
    @SerializedName("RequestType")
    var requestType: String = ""
)

