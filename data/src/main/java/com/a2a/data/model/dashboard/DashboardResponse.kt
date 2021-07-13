package com.a2a.data.model.dashboard


import com.a2a.data.model.common.Account
import com.google.gson.annotations.SerializedName

data class DashboardResponse(
    @SerializedName("A2AResponse")
    var a2AResponse: A2AResponse = A2AResponse(),
    @SerializedName("ErrorMsg")
    var errorMsg: ErrorMsg = ErrorMsg()
) {


    data class A2AResponse(
        @SerializedName("Body")
        var body: Body = Body(),
        @SerializedName("Footer")
        var footer: Footer = Footer(),
        @SerializedName("Header")
        var header: Header = Header()
    ) {
        data class Body(
            @SerializedName("AccGroups")
            var accGroups: List<AccGroup> = listOf(),
            @SerializedName("Accounts")
            var accounts: List<Account> = listOf(),
            @SerializedName("Cards")
            var cards: List<Card> = listOf(),
            @SerializedName("Loans")
            var loans: List<Loan> = listOf(),
            @SerializedName("ServiceConfiguration")
            var serviceConfiguration: ServiceConfiguration = ServiceConfiguration()
        ) {
            data class AccGroup(
                @SerializedName("ABalanceTip")
                var aBalanceTip: String = "",
                @SerializedName("ADesc")
                var aDesc: String = "",
                @SerializedName("EBalanceTip")
                var eBalanceTip: String = "",
                @SerializedName("EDesc")
                var eDesc: String = "",
                @SerializedName("GroupID")
                var groupID: Int = 0,
                @SerializedName("ID")
                var iD: Int = 0,
                @SerializedName("RegionCode")
                var regionCode: String = ""
            )


            data class Card(
                @SerializedName("ACardType")
                var aCardType: String = "",
                @SerializedName("ACurrency")
                var aCurrency: String = "",
                @SerializedName("AStatus")
                var aStatus: String = "",
                @SerializedName("AllAmt")
                var allAmt: Double = 0.0,
                @SerializedName("AmountLimit")
                var amountLimit: String = "",
                @SerializedName("AvailableBalance")
                var availableBalance: String = "",
                @SerializedName("BillStatus")
                var billStatus: Int = 0,
                @SerializedName("CanDate")
                var canDate: String = "",
                @SerializedName("CardAccountNumber")
                var cardAccountNumber: String = "",
                @SerializedName("CardHolderName")
                var cardHolderName: String = "",
                @SerializedName("CardNumber")
                var cardNumber: String = "",
                @SerializedName("CardNumberMasked")
                var cardNumberMasked: String = "",
                @SerializedName("CardType")
                var cardType: String = "",
                @SerializedName("Channel")
                var channel: String = "",
                @SerializedName("CreditLimit")
                var creditLimit: String = "",
                @SerializedName("Currency")
                var currency: String = "",
                @SerializedName("CurrencyBalance")
                var currencyBalance: Double = 0.0,
                @SerializedName("CurrencyISOCode")
                var currencyISOCode: String = "",
                @SerializedName("DateFrom")
                var dateFrom: String = "",
                @SerializedName("DateTo")
                var dateTo: String = "",
                @SerializedName("DateTrans")
                var dateTrans: String = "",
                @SerializedName("ECardType")
                var eCardType: String = "",
                @SerializedName("ECurrency")
                var eCurrency: String = "",
                @SerializedName("EStatus")
                var eStatus: String = "",
                @SerializedName("EndDate")
                var endDate: String = "",
                @SerializedName("ErrorCode")
                var errorCode: Int = 0,
                @SerializedName("ErrorEDesc")
                var errorEDesc: String = "",
                @SerializedName("ExpiryDate")
                var expiryDate: String = "",
                @SerializedName("HolderName")
                var holderName: String = "",
                @SerializedName("LogID")
                var logID: Int = 0,
                @SerializedName("NextPaymentDate")
                var nextPaymentDate: String = "",
                @SerializedName("Order")
                var order: Int = 0,
                @SerializedName("PaidBal")
                var paidBal: Double = 0.0,
                @SerializedName("PortalID")
                var portalID: String = "",
                @SerializedName("Sign")
                var sign: String = "",
                @SerializedName("Status")
                var status: String = "",
                @SerializedName("TotalCr")
                var totalCr: Double = 0.0,
                @SerializedName("TotalDr")
                var totalDr: Double = 0.0,
                @SerializedName("Type")
                var type: String = "",
                @SerializedName("UnPaidBal")
                var unPaidBal: Double = 0.0,
                @SerializedName("UsedBal")
                var usedBal: Double = 0.0
            )

            data class Loan(
                @SerializedName("ADesc")
                var aDesc: String = "",
                @SerializedName("Amount")
                var amount: Double = 0.0,
                @SerializedName("Amt")
                var amt: Double = 0.0,
                @SerializedName("AmtFC")
                var amtFC: Double = 0.0,
                @SerializedName("Bal")
                var bal: Double = 0.0,
                @SerializedName("BalAccrued")
                var balAccrued: Double = 0.0,
                @SerializedName("Balance")
                var balance: Double = 0.0,
                @SerializedName("ClosingDate")
                var closingDate: String = "",
                @SerializedName("Currency")
                var currency: String = "",
                @SerializedName("DateLastPayment")
                var dateLastPayment: String = "",
                @SerializedName("DateLoan")
                var dateLoan: String = "",
                @SerializedName("DateNextPayment")
                var dateNextPayment: String = "",
                @SerializedName("EDesc")
                var eDesc: String = "",
                @SerializedName("ELoanAim")
                var eLoanAim: String = "",
                @SerializedName("Facility")
                var facility: String = "",
                @SerializedName("FacilityDesc")
                var facilityDesc: String = "",
                @SerializedName("Fees")
                var fees: Double = 0.0,
                @SerializedName("Installment")
                var installment: Double = 0.0,
                @SerializedName("InterestRate")
                var interestRate: Double = 0.0,
                @SerializedName("LoanAcc")
                var loanAcc: String = "",
                @SerializedName("LoanInstallments")
                var loanInstallments: Double = 0.0,
                @SerializedName("LoanNumber")
                var loanNumber: String = "",
                @SerializedName("LoanType")
                var loanType: String = "",
                @SerializedName("Payment")
                var payment: Double = 0.0,
                @SerializedName("PaymentNo")
                var paymentNo: Int = 0,
                @SerializedName("Status")
                var status: String = "",
                @SerializedName("Tenor")
                var tenor: Int = 0
            )

            data class ServiceConfiguration(
                @SerializedName("PWDFlag")
                var pWDFlag: Int = 0
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
            var sessionID: String = "",
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