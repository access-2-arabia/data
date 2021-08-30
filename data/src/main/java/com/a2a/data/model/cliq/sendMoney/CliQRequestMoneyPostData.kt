package com.a2a.data.model.cliq.sendMoney


import com.a2a.network.model.CustProfile
import com.google.gson.annotations.SerializedName

data class CliQRequestMoneyPostData(

    @SerializedName("AccountNumberFrom")
    var accountNumberFrom: String = "",
    @SerializedName("AccountNumberTo")
    var accountNumberTo: String = "",
    @SerializedName("Amount")
    var amount: String = "",
    @SerializedName("Amt")
    var amt: String = "",
    @SerializedName("CdtrAcct")
    var cdtrAcct: String = "",
    @SerializedName("CdtrAlias")
    var cdtrAlias: String = "",
    @SerializedName("CdtrMCC")
    var cdtrMCC: String = "",
    @SerializedName("CdtrName")
    var cdtrName: String = "",
    @SerializedName("CdtrPstlAdr")
    var cdtrPstlAdr: String = "",
    @SerializedName("CdtrRecordID")
    var cdtrRecordID: String = "",
    @SerializedName("CdtrValue")
    var cdtrValue: String = "",
    @SerializedName("CtgyPurp")
    var ctgyPurp: String = "",
    @SerializedName("Curr")
    var curr: String = "",
    @SerializedName("CurrCodeTo")
    var currCodeTo: String = "",
    @SerializedName("CurrFrom")
    var currFrom: String = "",
    @SerializedName("CustID")
    var custID: String = "",
    @SerializedName("CustIDTO")
    var custIDTO: String = "",
    @SerializedName("CustProfile")
    var custProfile: CustProfile = CustProfile(),
    @SerializedName("DbtValue")
    var dbtValue: String = "",
    @SerializedName("DbtrAcct")
    var dbtrAcct: String = "",
    @SerializedName("DbtrAlias")
    var dbtrAlias: String = "",
    @SerializedName("DbtrBic")
    var dbtrBic: String = "",
    @SerializedName("CdtrBic")
    var cdtrBic: String = "",
    @SerializedName("CdtrIsIndvl")
    var cdtrIsIndvl: String = "",
    @SerializedName("DbtrIsIndvl")
    var dbtrIsIndvl: String = "",
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
    @SerializedName("Authenticate")
    var authenticate: CliQRequestMoneyResponse.A2ARequest.Body.Authenticate = CliQRequestMoneyResponse.A2ARequest.Body.Authenticate(),
    @SerializedName("OTP")
    var oTP: CliQRequestMoneyResponse.A2ARequest.Body.OTP = CliQRequestMoneyResponse.A2ARequest.Body.OTP(),
    @SerializedName("ServiceConfiguration")
    var serviceConfiguration: CliQRequestMoneyResponse.A2ARequest.Body.ServiceConfiguration = CliQRequestMoneyResponse.A2ARequest.Body.ServiceConfiguration(),
    @SerializedName("StepNumber")
    var stepNumber: Int = 0,
    @SerializedName("BenAccIBAN")
    var benAccIBAN: String = "",
)