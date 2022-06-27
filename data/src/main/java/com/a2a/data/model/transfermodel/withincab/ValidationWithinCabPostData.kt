package com.a2a.data.model.transfermodel.withincab

import com.a2a.network.model.CustProfile
import com.google.gson.annotations.SerializedName

data class ValidationWithinCabPostData(
    @SerializedName("Body")
    var body: Body = Body()
) {
    data class Body(
        @SerializedName("AccountNumberFrom")
        var accountNumberFrom: String = "",
        @SerializedName("AccountNumberTo")
        var accountNumberTo: String = "",
        @SerializedName("Amount")
        var amount: String = "",
        @SerializedName("BranchCode")
        var branchCode: String = "",
        @SerializedName("CurrencyFrom")
        var currencyFrom: String = "",
        @SerializedName("CurrencyTo")
        var currencyTo: String = "",
        @SerializedName("StepNumber")
        var stepNumber: String = "",
        @SerializedName("CustProfile")
        var custProfile: CustProfile = CustProfile(),
        @SerializedName("BankRef")
        var bankRef: String? = null

    )
}
