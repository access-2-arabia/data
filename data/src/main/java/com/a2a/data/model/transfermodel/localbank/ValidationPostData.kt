package com.a2a.data.model.transfermodel.localbank


import com.google.gson.annotations.SerializedName

data class ValidationPostData(
    @SerializedName("AFName")
    var aFName: String = "",
    @SerializedName("ALName")
    var aLName: String = "",
    @SerializedName("ASName")
    var aSName: String = "",
    @SerializedName("ATName")
    var aTName: String = "",
    @SerializedName("AccountNumberFrom")
    var accountNumberFrom: String = "",
    @SerializedName("AccountNumberTo")
    var accountNumberTo: String = "",
    @SerializedName("Amount")
    var amount: String = "",
    @SerializedName("BFDType")
    var bFDType: String = "",
    @SerializedName("BenAccIBAN")
    var benAccIBAN: String = "",
    @SerializedName("BenBank")
    var benBank: String = "",
    @SerializedName("BenName")
    var benName: String = "",
    @SerializedName("BranchCode")
    var branchCode: String = "",
    @SerializedName("CCurrency")
    var cCurrency: String = "",
    @SerializedName("ChargesFor")
    var chargesFor: String = "",
    @SerializedName("CurrencyCodeFrom")
    var currencyCodeFrom: String = "",
    @SerializedName("StepNumber")
    var stepNumber: String = "",
    @SerializedName("TransRsn")
    var transRsn: String = ""
)