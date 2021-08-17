package com.a2a.data.model.cliq.sendMoney


import com.a2a.network.model.CustProfile
import com.google.gson.annotations.SerializedName

data class SendMoneyPostData(
    @SerializedName("AccountNumberFrom")
    var accountNumberFrom: String = "",
    @SerializedName("Amount")
    var amount: String = "",
    @SerializedName("Amt")
    var amt: String = "",
    @SerializedName("CdtrAcct")
    var cdtrAcct: String = "",
    @SerializedName("CdtrName")
    var cdtrName: String = "",
    @SerializedName("CdtrPstlAdr")
    var cdtrPstlAdr: String = "",
    @SerializedName("CdtrRecordID")
    var cdtrRecordID: String = "",
    @SerializedName("Curr")
    var curr: String = "",
    @SerializedName("CurrCodeTo")
    var currCodeTo: String = "",
    @SerializedName("CurrFrom")
    var currFrom: String = "",
    @SerializedName("CustID")
    var custID: String = "",
    @SerializedName("AccountNumberTo")
    var accountNumberTo: String = "",
    @SerializedName("CdtrAlias")
    var cdtrAlias: String = "",
    @SerializedName("CdtrMCC")
    var cdtrMCC: String = "",
    @SerializedName("CdtrValue")
    var cdtrValue: String = "",
    @SerializedName("CtgyPurp")
    var ctgyPurp: String = "",
    @SerializedName("CustProfile")
    var custProfile: CustProfile = CustProfile(),
    @SerializedName("DbtValue")
    var dbtValue: String = "",
    @SerializedName("DbtrAcct")
    var dbtrAcct: String = "",
    @SerializedName("DbtrIsIndvl")
    var dbtrIsIndvl: String = "",
    @SerializedName("DbtrAlias")
    var dbtrAlias: String = "",
    @SerializedName("DbtrBic")
    var dbtrBic: String = "",
    @SerializedName("CdtrBic")
    var cdtrBic: String = "",
    @SerializedName("CdtrIsIndvl")
    var cdtrIsIndvl: String = "",
    @SerializedName("DbtrMCC")
    var dbtrMCC: String = "",
    @SerializedName("DbtrName")
    var dbtrName: String = "",
    @SerializedName("DbtrPstlAdr")
    var dbtrPstlAdr: String = "",
    @SerializedName("DbtrRecordID")
    var dbtrRecordID: String = "",
    @SerializedName("Fees")
    var fees: Int = 0,
    @SerializedName("SenderName")
    var senderName: String = "",
    @SerializedName("SenderPstlAdr")
    var senderPstlAdr: String = "",
    @SerializedName("StepNumber")
    var stepNumber: Int = 0,

)