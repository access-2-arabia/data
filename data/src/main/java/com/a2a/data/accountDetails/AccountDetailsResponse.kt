package com.a2a.data.accountDetails
import com.google.gson.annotations.SerializedName


data class AccountDetailsResponse(
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
            @SerializedName("ATypeDesc")
            var aTypeDesc: String = "",
            @SerializedName("AccCredit")
            var accCredit: Double = 0.0,
            @SerializedName("AccCurr")
            var accCurr: AccCurr = AccCurr(),
            @SerializedName("AccDebit")
            var accDebit: Double = 0.0,
            @SerializedName("AccLimit")
            var accLimit: Double = 0.0,
            @SerializedName("AccountNumber")
            var accountNumber: String = "",
            @SerializedName("AllAmt")
            var allAmt: Double = 0.0,
            @SerializedName("AmountFloat")
            var amountFloat: Double = 0.0,
            @SerializedName("AmtCredit")
            var amtCredit: Double = 0.0,
            @SerializedName("AmtDebit")
            var amtDebit: Double = 0.0,
            @SerializedName("AmtFloat")
            var amtFloat: Double = 0.0,
            @SerializedName("AmtHold")
            var amtHold: Double = 0.0,
            @SerializedName("AmtTo")
            var amtTo: Double = 0.0,
            @SerializedName("AvailableBalance")
            var availableBalance: Double = 0.0,
            @SerializedName("AvailableBalanceFC")
            var availableBalanceFC: Double = 0.0,
            @SerializedName("AvlBal")
            var avlBal: Double = 0.0,
            @SerializedName("BankRef")
            var bankRef: String = "",
            @SerializedName("BillStatus")
            var billStatus: Int = 0,
            @SerializedName("BranchCode")
            var branchCode: String = "",
            @SerializedName("BranchDetails")
            var branchDetails: BranchDetails = BranchDetails(),
            @SerializedName("CanDate")
            var canDate: String = "",
            @SerializedName("Channel")
            var channel: String = "",
            @SerializedName("ChannelID")
            var channelID: Int = 0,
            @SerializedName("ClearBal")
            var clearBal: Double = 0.0,
            @SerializedName("ClearBalance")
            var clearBalance: Double = 0.0,
            @SerializedName("CurBal")
            var curBal: Double = 0.0,
            @SerializedName("CurrBal")
            var currBal: Double = 0.0,
            @SerializedName("CurrencyCode")
            var currencyCode: String = "",
            @SerializedName("CurrentBalance")
            var currentBalance: Double = 0.0,
            @SerializedName("CurrentBalanceFC")
            var currentBalanceFC: Double = 0.0,
            @SerializedName("DateFrom")
            var dateFrom: String = "",
            @SerializedName("DateMaturity")
            var dateMaturity: String = "",
            @SerializedName("DateOpen")
            var dateOpen: String = "",
            @SerializedName("DateTo")
            var dateTo: String = "",
            @SerializedName("DateTrans")
            var dateTrans: String = "",
            @SerializedName("EndDate")
            var endDate: String = "",
            @SerializedName("EqlBal")
            var eqlBal: Double = 0.0,
            @SerializedName("EquivBal")
            var equivBal: Double = 0.0,
            @SerializedName("EquivBalance")
            var equivBalance: Double = 0.0,
            @SerializedName("EqvBal")
            var eqvBal: Double = 0.0,
            @SerializedName("ErrorCode")
            var errorCode: Int = 0,
            @SerializedName("HasPassword")
            var hasPassword: Boolean = false,
            @SerializedName("ID")
            var iD: Int = 0,
            @SerializedName("InterestRate")
            var interestRate: Double = 0.0,
            @SerializedName("IsBlocking")
            var isBlocking: Boolean = false,
            @SerializedName("IsDormant")
            var isDormant: Boolean = false,
            @SerializedName("IsNavigate")
            var isNavigate: Boolean = false,
            @SerializedName("LedBal")
            var ledBal: Double = 0.0,
            @SerializedName("Limit")
            var limit: Double = 0.0,
            @SerializedName("LimitAmt")
            var limitAmt: Double = 0.0,
            @SerializedName("LogID")
            var logID: Int = 0,
            @SerializedName("MaturityDate")
            var maturityDate: String = "",
            @SerializedName("MaturityDays")
            var maturityDays: Int = 0,
            @SerializedName("NextPaymentDate")
            var nextPaymentDate: String = "",
            @SerializedName("NonClearBal")
            var nonClearBal: Double = 0.0,
            @SerializedName("NonClearBalance")
            var nonClearBalance: Double = 0.0,
            @SerializedName("OpeningDate")
            var openingDate: String = "",
            @SerializedName("PortalID")
            var portalID: String = "",
            @SerializedName("RegionCode")
            var regionCode: String = "",
            @SerializedName("ReqChannelCodeCore")
            var reqChannelCodeCore: String = "",
            @SerializedName("ReqChannelCore")
            var reqChannelCore: String = "",
            @SerializedName("ReqChannelUserCore")
            var reqChannelUserCore: String = "",
            @SerializedName("ResCode")
            var resCode: Int = 0,
            @SerializedName("ReservedBal")
            var reservedBal: Double = 0.0,
            @SerializedName("ReservedBalance")
            var reservedBalance: Double = 0.0,
            @SerializedName("StartDate")
            var startDate: String = "",
            @SerializedName("Status")
            var status: String = "",
            @SerializedName("TotalCr")
            var totalCr: Double = 0.0,
            @SerializedName("TotalDr")
            var totalDr: Double = 0.0,
            @SerializedName("TransCount")
            var transCount: Int = 0,
            @SerializedName("WrkBal")
            var wrkBal: Double = 0.0
        ) {
            data class AccCurr(
                @SerializedName("CED")
                var cED: Int = 0
            )

            class BranchDetails(
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