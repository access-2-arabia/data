package com.a2a.data.model.transfermodel.betwenmyaccount


import com.google.gson.annotations.SerializedName

data class ValidationBetweenMyAccountPostData(
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
        var stepNumber: String = ""
    )
}