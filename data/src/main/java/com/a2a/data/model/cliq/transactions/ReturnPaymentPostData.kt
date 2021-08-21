package com.a2a.data.model.cliq.transactions


import com.a2a.network.model.CustProfile
import com.google.gson.annotations.SerializedName

data class ReturnPaymentPostData(

    @SerializedName("Amount")
    var amount: String = "",
    @SerializedName("CustProfile")
    var custProfile: CustProfile = CustProfile(),
    @SerializedName("CdtrAcct")
    var cdtrAcct: String = "",
    @SerializedName("DisputeRefNo")
    var disputeRefNo: String = "",
    @SerializedName("IsDispute")
    var isDispute: String = "",
    @SerializedName("OrgnlMsgId")
    var orgnlMsgId: String = "",
    @SerializedName("RtrnAddInfo")
    var rtrnAddInfo: String = "",
    @SerializedName("RtrnReason")
    var rtrnReason: String = "",

    @SerializedName("DbtrAcct")
    var dbtrAcct: String = "",
    @SerializedName("dbtrName")
    var dbtrName: String = "",
    @SerializedName("DbtrAddr")
    var dbtrAddr: String = "",
    @SerializedName("DbtrMCC")
    var dbtrMCC: String = "",
    @SerializedName("DbtrAgt")
    var dbtrAgt: String = "",
    @SerializedName("DbtrRecordID")
    var dbtrRecordID: String = "",
    @SerializedName("DbtrAlias")
    var dbtrAlias: String = "",
)