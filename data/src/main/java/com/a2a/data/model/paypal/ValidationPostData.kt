package com.a2a.data.model.paypal

import com.a2a.network.model.CustProfile
import com.google.gson.annotations.SerializedName

data class ValidationPostData(
    @SerializedName("Body")
    var body: Body = Body()
) {
    data class Body(
        @SerializedName("Accounts")
        var accounts: Accounts = Accounts(),
        @SerializedName("CustProfile")
        var custProfile: CustProfile = CustProfile(),
        @SerializedName("StepNumber")
        var stepNumber: Int = 0
    ) {

        data class Accounts(
            @SerializedName("AccountNumberFrom")
            var accountNumberFrom: String = "",
            @SerializedName("Amount")
            var amount: Int = 0,
            @SerializedName("BranchCode")
            var branchCode: String = "",
            @SerializedName("CurrencyCodeFrom")
            var currencyCodeFrom: String = "",
            @SerializedName("SameAcc")
            var sameAcc: String = ""
        )
    }
}