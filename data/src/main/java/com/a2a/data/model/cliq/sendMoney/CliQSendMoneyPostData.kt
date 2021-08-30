package  com.a2a.data.model.cliq.sendMoney


import com.a2a.data.model.common.Header
import com.a2a.network.model.CustProfile
import com.google.gson.annotations.SerializedName

data class CliQSendMoneyPostData(
    @SerializedName("QRVOFC")
    var qRVOFC: String = "",
    @SerializedName("QRVOFCFixed")
    var qRVOFCFixed: String = "",
    @SerializedName("QRVOFCPercentage")
    var qRVOFCPercentage: String = "",
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
    @SerializedName("CdtrBic")
    var cdtrBic: String = "",
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
    @SerializedName("CdtrIsIndvl")
    var cdtrIsIndvl: String = "",
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
    @SerializedName("DbtrAcct")
    var dbtrAcct: String = "",
    @SerializedName("DbtrAlias")
    var dbtrAlias: String = "",
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
    @SerializedName("PayRefNo")
    var payRefNo: String = "",
    @SerializedName("QRBillNumber")
    var qRBillNumber: String = "",
    @SerializedName("QRCodeRefID")
    var qRCodeRefID: String = "",
    @SerializedName("QRCountryCode")
    var qRCountryCode: String = "",
    @SerializedName("QRCustomerLabel")
    var qRCustomerLabel: String = "",
    @SerializedName("QRDateandTime")
    var qRDateandTime: String = "",
    @SerializedName("QRFlag")
    var qRFlag: String = "",
    @SerializedName("QRLocation")
    var qRLocation: String = "",
    @SerializedName("QRLoyaltyNumber")
    var qRLoyaltyNumber: String = "",
    @SerializedName("QRMemeberID")
    var qRMemeberID: String = "",
    @SerializedName("QRMerchantCity")
    var qRMerchantCity: String = "",
    @SerializedName("QRMerchantID")
    var qRMerchantID: String = "",
    @SerializedName("QRMobileNumber")
    var qRMobileNumber: String = "",
    @SerializedName("QRStoreLabel")
    var qRStoreLabel: String = "",
    @SerializedName("QRTerminalLabel")
    var qRTerminalLabel: String = "",
    @SerializedName("QRValue")
    var qRValue: String = "",
    @SerializedName("QRValueofConvenience")
    var qRValueofConvenience: String = "",
    @SerializedName("QRTaxId")
    var QRTaxId: String = "",
    @SerializedName("QRAddLangTemp")
    var QRAddLangTemp: String = "",
    @SerializedName("QRVerificationCode")
    var qRVerificationCode: String = "",
    @SerializedName("RgltryRptg")
    var rgltryRptg: String = "",
    @SerializedName("RmtInf")
    var rmtInf: String = "",
    @SerializedName("StepNumber")
    var stepNumber: Int = 0,
    @SerializedName("Authenticate")
    var authenticate: CliQRequestMoneyResponse.A2ARequest.Body.Authenticate = CliQRequestMoneyResponse.A2ARequest.Body.Authenticate(),
    @SerializedName("OTP")
    var oTP: CliQRequestMoneyResponse.A2ARequest.Body.OTP = CliQRequestMoneyResponse.A2ARequest.Body.OTP(),
    @SerializedName("ServiceConfiguration")
    var serviceConfiguration: CliQRequestMoneyResponse.A2ARequest.Body.ServiceConfiguration = CliQRequestMoneyResponse.A2ARequest.Body.ServiceConfiguration(),
    @SerializedName("BenAccIBAN")
    var benAccIBAN: String = "",
    )