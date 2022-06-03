package com.a2a.data.model.lasttransaction

import com.google.gson.annotations.SerializedName


data class LastTransactionPostData(
    var body: Body = Body(),
) {
    data class Body(
        @SerializedName("Account")
        var account: Account = Account(),
        @SerializedName("BranchCode")
        var branchCode: String = "",
        @SerializedName("StepNumber")
        var stepNumber: String? = null,
        @SerializedName("CustID")
        var custID: String = "",
        @SerializedName("DateFrom")
        var dateFrom: String = "",
        @SerializedName("DateTo")
        var dateTo: String = "",
        @SerializedName("IndexTo")
        var indexTo: String = "",
        @SerializedName("TransType")
        var transType: String = "",
    ) {
        data class Account(
            @SerializedName("AccountNumber")
            var accountNumber: String = "",
        )

    }
}
