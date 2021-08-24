package com.a2a.data.model.cliq


import com.google.gson.annotations.SerializedName

data class AccountsPostDataCliQSendMoneyPostData(
    @SerializedName("CustID")
    var custID: String = "",
    @SerializedName("RecordId")
    var recordId: String = "",
    @SerializedName("RequestType")
    var requestType: String = ""
)

