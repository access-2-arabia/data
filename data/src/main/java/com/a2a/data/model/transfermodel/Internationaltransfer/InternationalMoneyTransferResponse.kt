package com.a2a.data.model.transfermodel.Internationaltransfer
import android.os.Parcelable

 
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize


@Parcelize
data class InternationalMoneyTransferResponse(
    @SerializedName("A2ARequest")
    var a2ARequest: A2ARequest = A2ARequest(),
    @SerializedName("A2AResponse")
    var a2AResponse: A2AResponse = A2AResponse(),
    @SerializedName("ErrorMsg")
    var errorMsg: ErrorMsg = ErrorMsg()
) : Parcelable {
    @Parcelize
    data class A2ARequest(
        @SerializedName("Body")
        var body: Body = Body(),
        @SerializedName("Footer")
        var footer: Footer = Footer(),
        @SerializedName("Header")
        var header: Header = Header()
    ) : Parcelable {
        @Parcelize
        class Body : Parcelable

        @Parcelize
        data class Footer(
            @SerializedName("Signature")
            var signature: String = ""
        ) : Parcelable

        @Parcelize
        data class Header(
            @SerializedName("BankCode")
            var bankCode: String = "",
            @SerializedName("Channel")
            var channel: String = "",
            @SerializedName("ConnectorID")
            var connectorID: String = "",
            @SerializedName("Device")
            var device: String = "",
            @SerializedName("DeviceID")
            var deviceID: String = "",
            @SerializedName("DeviceToken")
            var deviceToken: String = "",
            @SerializedName("GuidID")
            var guidID: String = "",
            @SerializedName("MethodName")
            var methodName: String = "",
            @SerializedName("Password")
            var password: String = "",
            @SerializedName("RegionCode")
            var regionCode: String = "",
            @SerializedName("ServiceID")
            var serviceID: Int = 0,
            @SerializedName("SessionID")
            var sessionID: String = "",
            @SerializedName("SrvID")
            var srvID: String = "",
            @SerializedName("TimeStamp")
            var timeStamp: String = "",
            @SerializedName("UserID")
            var userID: String = ""
        ) : Parcelable
    }

    @Parcelize
    data class A2AResponse(
        @SerializedName("Body")
        var body: Body = Body(),
        @SerializedName("Footer")
        var footer: Footer = Footer(),
        @SerializedName("Header")
        var header: Header = Header()
    ) : Parcelable {
        @Parcelize
        data class Body(
            @SerializedName("ACCOUNTWITHBANK")
            var aCCOUNTWITHBANK: String = "",
            @SerializedName("ARFIRSTNAME")
            var aRFIRSTNAME: String = "",
            @SerializedName("ARLASTNAME")
            var aRLASTNAME: String = "",
            @SerializedName("ARSECONDNAME")
            var aRSECONDNAME: String = "",
            @SerializedName("ARTHIRDNAME")
            var aRTHIRDNAME: String = "",
            @SerializedName("AccountNumber")
            var accountNumber: String = "",
            @SerializedName("AccountNumberFrom")
            var accountNumberFrom: String = "",
            @SerializedName("AllAmt")
            var allAmt: Double = 0.0,
            @SerializedName("Amount")
            var amount: Double = 0.0,
            @SerializedName("AmountFrom")
            var amountFrom: Double = 0.0,
            @SerializedName("AmountTo")
            var amountTo: Double = 0.0,
            @SerializedName("Amt")
            var amt: Double = 0.0,
            @SerializedName("AmtAfter")
            var amtAfter: Double = 0.0,
            @SerializedName("AmtExtra")
            var amtExtra: Double = 0.0,
            @SerializedName("AmtFrom")
            var amtFrom: Double = 0.0,
            @SerializedName("AmtNorm")
            var amtNorm: Double = 0.0,
            @SerializedName("AmtTo")
            var amtTo: Double = 0.0,
            @SerializedName("BENCOUNTRY")
            var bENCOUNTRY: String = "",
            @SerializedName("BFDTYPE")
            var bFDTYPE: String = "",
            @SerializedName("BankRef")
            var bankRef: String = "",
            @SerializedName("BenAccIBAN")
            var benAccIBAN: String = "",
            @SerializedName("BenName")
            var benName: String = "",
            @SerializedName("BenName2")
            var benName2: String = "",
            @SerializedName("BenName3")
            var benName3: String = "",
            @SerializedName("BenName4")
            var benName4: String = "",
            @SerializedName("BillStatus")
            var billStatus: Int = 0,
            @SerializedName("BranchCode")
            var branchCode: String = "",
            @SerializedName("CAmt")
            var cAmt: Double = 0.0,
            @SerializedName("CID")
            var cID: Int = 0,
            @SerializedName("CanDate")
            var canDate: String = "",
            @SerializedName("Channel")
            var channel: String = "",
            @SerializedName("ChannelID")
            var channelID: Int = 0,
            @SerializedName("Charge")
            var charge: Double = 0.0,
            @SerializedName("ChargesFor")
            var chargesFor: String = "",
            @SerializedName("CurrencyCodeFrom")
            var currencyCodeFrom: String = "",
            @SerializedName("CurrencyCodeTo")
            var currencyCodeTo: String = "",
            @SerializedName("CurrentBal")
            var currentBal: Double = 0.0,
            @SerializedName("CustType")
            var custType: Int = 0,
            @SerializedName("DateFrom")
            var dateFrom: String = "",
            @SerializedName("DatePost")
            var datePost: String = "",
            @SerializedName("DateTo")
            var dateTo: String = "",
            @SerializedName("DateTrans")
            var dateTrans: String = "",
            @SerializedName("DateValueFrom")
            var dateValueFrom: String = "",
            @SerializedName("DateValueTo")
            var dateValueTo: String = "",
            @SerializedName("DecimalPoints")
            var decimalPoints: Int = 0,
            @SerializedName("DepositeNo")
            var depositeNo: String = "",
            @SerializedName("EndDate")
            var endDate: String = "",
            @SerializedName("EqvAmount")
            var eqvAmount: Double = 0.0,
            @SerializedName("Error")
            var error: String = "",
            @SerializedName("ErrorCode")
            var errorCode: Int = 0,
            @SerializedName("ErrorEDesc")
            var errorEDesc: String = "",
            @SerializedName("ExchangeRate")
            var exchangeRate: Double = 0.0,
            @SerializedName("ExpCode")
            var expCode: Double = 0.0,
            @SerializedName("FNDFlag")
            var fNDFlag: Int = 0,
            @SerializedName("Fees")
            var fees: Double = 0.0,
            @SerializedName("IBAN")
            var iBAN: String = "",
            @SerializedName("INTERMEDBANK")
            var iNTERMEDBANK: String = "",
            @SerializedName("LimitFlag")
            var limitFlag: Boolean = false,
            @SerializedName("LocalAmtCredit")
            var localAmtCredit: Double = 0.0,
            @SerializedName("LocalAmtDebit")
            var localAmtDebit: Double = 0.0,
            @SerializedName("LogID")
            var logID: Int = 0,
            @SerializedName("NarativeLines")
            var narativeLines: Int = 0,
            @SerializedName("NextPaymentDate")
            var nextPaymentDate: String = "",
            @SerializedName("PaidAmt")
            var paidAmt: Double = 0.0,
            @SerializedName("PaymentDetail")
            var paymentDetail: String = "",
            @SerializedName("PaymentDetail2")
            var paymentDetail2: String = "",
            @SerializedName("PortalID")
            var portalID: String = "",
            @SerializedName("Position")
            var position: Int = 0,
            @SerializedName("PrincipleInterest")
            var principleInterest: Double = 0.0,
            @SerializedName("ProcessDate")
            var processDate: String = "",
            @SerializedName("RID")
            var rID: Int = 0,
            @SerializedName("Rate")
            var rate: Double = 0.0,
            @SerializedName("Reference")
            var reference: String = "",
            @SerializedName("RegionCode")
            var regionCode: String = "",
            @SerializedName("ReqChannelCore")
            var reqChannelCore: String = "",
            @SerializedName("ResCode")
            var resCode: Int = 0,
            @SerializedName("SWIFTROUTING")
            var sWIFTROUTING: String = "",
            @SerializedName("SrvID")
            var srvID: Int = 0,
            @SerializedName("TotalCr")
            var totalCr: Double = 0.0,
            @SerializedName("TotalDr")
            var totalDr: Double = 0.0,
            @SerializedName("TotalDue")
            var totalDue: Double = 0.0,
            @SerializedName("TransRsn")
            var transRsn: String = ""
        ) : Parcelable

        @Parcelize
        data class Footer(
            @SerializedName("Signature")
            var signature: String = ""
        ) : Parcelable

        @Parcelize
        data class Header(
            @SerializedName("GuidID")
            var guidID: String = "",
            @SerializedName("RegionCode")
            var regionCode: String = "",
            @SerializedName("Result")
            var result: Result = Result(),
            @SerializedName("SessionID")
            var sessionID: String = "",
            @SerializedName("SrvID")
            var srvID: Int = 0,
            @SerializedName("TimeStamp")
            var timeStamp: String = ""
        ) : Parcelable {
            @Parcelize
            data class Result(
                @SerializedName("ADesc")
                var aDesc: String = "",
                @SerializedName("EDesc")
                var eDesc: String = "",
                @SerializedName("ErrorCode")
                var errorCode: Int = 0
            ) : Parcelable
        }
    }

    @Parcelize
    data class ErrorMsg(
        @SerializedName("ADesc")
        var aDesc: String = "",
        @SerializedName("EDesc")
        var eDesc: String = "",
        @SerializedName("ErrorCode")
        var errorCode: Int = 0
    ) : Parcelable
}