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
        @SerializedName("BankRef")
        var bankRef: String = "",
        @SerializedName("BranchCode")
        var branchCode: String = "",
        @SerializedName("CID")
        var cID: String = "",
        @SerializedName("CurrencyFrom")
        var currencyFrom: String = "",
        @SerializedName("CurrencyTo")
        var currencyTo: String = "",
        @SerializedName("CustID")
        var custID: String = "",
        @SerializedName("CustType")
        var custType: String = "",
        @SerializedName("RepID")
        var repID: String = "",
        @SerializedName("StepNumber")
        var stepNumber: String = ""
    )
}