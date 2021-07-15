package com.a2a.data.model.accounts


import android.os.Parcelable
import com.a2a.data.model.common.ErrorMsg
import com.a2a.data.model.common.Footer
import com.a2a.data.model.common.HeaderResponse
import com.a2a.data.model.common.ServiceConfiguration
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

data class AccountTransactionResponse(

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
        var header: HeaderResponse = HeaderResponse()
    ) {
        data class Body(
            @SerializedName("AccountTransactions")
            var accountTransactions: List<AccountTransaction> = listOf(),
            @SerializedName("AccountTransactionsTotalCR")
            var accountTransactionsTotalCR: String = "",
            @SerializedName("AccountTransactionsTotalDR")
            var accountTransactionsTotalDR: String = "",
            @SerializedName("ServiceConfiguration")
            var serviceConfiguration: ServiceConfiguration = ServiceConfiguration(),
            @SerializedName("Transactions")
            var transactions: List<Any> = listOf()
        ) {
            @Parcelize
            data class AccountTransaction(
                @SerializedName("ACurrency")
                var aCurrency: String = "",
                @SerializedName("ADesc")
                var aDesc: String = "",
                @SerializedName("Amount")
                var amount: String = "",
                @SerializedName("AmountFC")
                var amountFC: String = "",
                @SerializedName("AvailableBalance")
                var availableBalance: String = "",
                @SerializedName("AvailableBalanceFC")
                var availableBalanceFC: String = "",
                @SerializedName("Code")
                var code: String = "",
                @SerializedName("CreditAmount")
                var creditAmount: Double = 0.0,
                @SerializedName("Currency")
                var currency: String = "",
                @SerializedName("CurrentBalance")
                var currentBalance: Double = 0.0,
                @SerializedName("DatePost")
                var datePost: String = "",
                @SerializedName("DateValue")
                var dateValue: String = "",
                @SerializedName("DebitAmount")
                var debitAmount: Double = 0.0,
                @SerializedName("ECurrency")
                var eCurrency: String = "",
                @SerializedName("EDesc")
                var eDesc: String = "",
                @SerializedName("ISOCode")
                var iSOCode: String = "",
                @SerializedName("InstallmentDate")
                var installmentDate: String = "",
                @SerializedName("LDInterest")
                var lDInterest: Double = 0.0,
                @SerializedName("Limit")
                var limit: Double = 0.0,
                @SerializedName("nDateSched")
                var nDateSched: String = "",
                @SerializedName("PDInterest")
                var pDInterest: Double = 0.0,
                @SerializedName("Reference")
                var reference: String = "",
                @SerializedName("RepayDate")
                var repayDate: String = "",
                @SerializedName("RunBal")
                var runBal: Double = 0.0,
                @SerializedName("Sing")
                var sing: String = "",
                @SerializedName("TransIndex")
                var transIndex: Int = 0,
                @SerializedName("TrxDate")
                var trxDate: String = "",
                @SerializedName("Type")
                var type: String = ""
            ):Parcelable
        }
    }
}