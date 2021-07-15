package com.a2a.data.model.accounts

import com.a2a.network.model.CustProfile
import com.google.gson.annotations.SerializedName

data class AccountTransactionPostData(
    @SerializedName("Accounts")
    var account: Account = Account(),
    @SerializedName("CustProfile")
    var custProfile: CustProfile = CustProfile()
) {
    data class Account(
        @SerializedName("AccountNumber")
        var accountNumber: String = "",
        @SerializedName("AmountType")
        var amountType: String = "",
        @SerializedName("DateFrom")
        var dateFrom: String = "",
        @SerializedName("DateTo")
        var dateTo: String = "",
        @SerializedName("FilterBy")
        var filterBy: String = "",
        @SerializedName("FromAmount")
        var fromAmount: String = "",
        @SerializedName("ToAmount")
        var toAmount: String = "",
        @SerializedName("TransactionCount")
        var transactionCount: String = "",
        @SerializedName("TransactionType")
        var transactionType: String = ""
    )
}