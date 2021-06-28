package com.a2a.data.model.lasttransaction
import com.google.gson.annotations.SerializedName


data class LastTransactionResponse(
    @SerializedName("A2ARequest")
    var a2ARequest: A2ARequest = A2ARequest(),
    @SerializedName("A2AResponse")
    var a2AResponse: A2AResponse = A2AResponse(),
    @SerializedName("ErrorMsg")
    var errorMsg: ErrorMsg = ErrorMsg()
) {
    data class A2ARequest(
        @SerializedName("Body")
        var body: Body = Body(),
        @SerializedName("Footer")
        var footer: Footer = Footer(),
        @SerializedName("Header")
        var header: Header = Header()
    ) {
        class Body(
        )

        data class Footer(
            @SerializedName("Signature")
            var signature: String = ""
        )

        data class Header(
            @SerializedName("BankCode")
            var bankCode: String = "",
            @SerializedName("Channel")
            var channel: String = "",
            @SerializedName("ConnectorID")
            var connectorID: Any = Any(),
            @SerializedName("Device")
            var device: Any = Any(),
            @SerializedName("DeviceID")
            var deviceID: Any = Any(),
            @SerializedName("DeviceToken")
            var deviceToken: Any = Any(),
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
            var sessionID: Any = Any(),
            @SerializedName("SrvID")
            var srvID: String = "",
            @SerializedName("TimeStamp")
            var timeStamp: String = "",
            @SerializedName("UserID")
            var userID: String = ""
        )
    }

    data class A2AResponse(
        @SerializedName("Body")
        var body: Body = Body(),
        @SerializedName("Footer")
        var footer: Footer = Footer(),
        @SerializedName("Header")
        var header: Header = Header()
    ) {
        data class Body(
            @SerializedName("AccountTransactions")
            var accountTransactions: List<AccountTransaction> = listOf(),
            @SerializedName("AccountTransactionsTotalCR")
            var accountTransactionsTotalCR: String = "",
            @SerializedName("AccountTransactionsTotalDR")
            var accountTransactionsTotalDR: String = "",
            @SerializedName("ServiceConfiguration")
            var serviceConfiguration: ServiceConfiguration = ServiceConfiguration()
        ) {
            data class AccountTransaction(
                @SerializedName("ADesc")
                var aDesc: String = "",
                @SerializedName("Amount")
                var amount: Double = 0.0,
                @SerializedName("AmountFC")
                var amountFC: Double = 0.0,
                @SerializedName("Amt")
                var amt: Double = 0.0,
                @SerializedName("AvBal")
                var avBal: Double = 0.0,
                @SerializedName("AvailableBalance")
                var availableBalance: Double = 0.0,
                @SerializedName("AvailableBalanceFC")
                var availableBalanceFC: Double = 0.0,
                @SerializedName("BlockBal")
                var blockBal: Double = 0.0,
                @SerializedName("CreditAmount")
                var creditAmount: Double = 0.0,
                @SerializedName("CurrentBalance")
                var currentBalance: Double = 0.0,
                @SerializedName("DatePost")
                var datePost: String = "",
                @SerializedName("DateValue")
                var dateValue: String = "",
                @SerializedName("DebitAmount")
                var debitAmount: Double = 0.0,
                @SerializedName("DelayDays")
                var delayDays: Int = 0,
                @SerializedName("EDesc")
                var eDesc: String = "",
                @SerializedName("InstallAmt")
                var installAmt: Double = 0.0,
                @SerializedName("InstallmentDate")
                var installmentDate: String = "",
                @SerializedName("LDInterest")
                var lDInterest: Double = 0.0,
                @SerializedName("Limit")
                var limit: Double = 0.0,
                @SerializedName("nDateSched")
                var nDateSched: String = "",
                @SerializedName("NarrLine1")
                var narrLine1: String = "",
                @SerializedName("NarrLine2")
                var narrLine2: String = "",
                @SerializedName("NarrLine3")
                var narrLine3: String = "",
                @SerializedName("PDInterest")
                var pDInterest: Double = 0.0,
                @SerializedName("PaidAmt")
                var paidAmt: Double = 0.0,
                @SerializedName("RemainBal")
                var remainBal: Double = 0.0,
                @SerializedName("RepayDate")
                var repayDate: String = "",
                @SerializedName("RunBal")
                var runBal: Double = 0.0,
                @SerializedName("TransIndex")
                var transIndex: Int = 0,
                @SerializedName("TrxCode")
                var trxCode: String = "",
                @SerializedName("TrxDate")
                var trxDate: String = "",
                @SerializedName("TrxRefNo")
                var trxRefNo: String = "",
                @SerializedName("Type")
                var type: String = ""
            )

            data class ServiceConfiguration(
                @SerializedName("PWDFlag")
                var pWDFlag: Int = 0,
                @SerializedName("TransCount")
                var transCount: String = ""
            )
        }

        data class Footer(
            @SerializedName("Signature")
            var signature: String = ""
        )

        data class Header(
            @SerializedName("GuidID")
            var guidID: String = "",
            @SerializedName("RegionCode")
            var regionCode: String = "",
            @SerializedName("Result")
            var result: Result = Result(),
            @SerializedName("SessionID")
            var sessionID: Any = Any(),
            @SerializedName("SrvID")
            var srvID: Int = 0,
            @SerializedName("TimeStamp")
            var timeStamp: String = ""
        ) {
            data class Result(
                @SerializedName("ADesc")
                var aDesc: String = "",
                @SerializedName("EDesc")
                var eDesc: String = "",
                @SerializedName("ErrorCode")
                var errorCode: Int = 0
            )
        }
    }

    data class ErrorMsg(
        @SerializedName("ADesc")
        var aDesc: String = "",
        @SerializedName("EDesc")
        var eDesc: String = "",
        @SerializedName("ErrorCode")
        var errorCode: Int = 0
    )
}