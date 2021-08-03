package com.a2a.data.model.transfermodel.localbank

import com.a2a.network.model.CustProfile
import com.google.gson.annotations.SerializedName


data class LocalBankValidationPostData(
    @SerializedName("Body")
    var body: Body = Body()
)
data class Body(
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
    @SerializedName("BankRef")
    var bankRef: String = "",
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
    @SerializedName("CID")
    var cID: String = "",
    @SerializedName("CurrencyCodeFrom")
    var currencyCodeFrom: String = "",
    @SerializedName("CustID")
    var custID: String = "",
    @SerializedName("CustType")
    var custType: String = "",
    @SerializedName("Narrative1")
    var narrative1: String = "",
    @SerializedName("Narrative2")
    var narrative2: String = "",
    @SerializedName("Narrative3")
    var narrative3: String = "",
    @SerializedName("StepNumber")
    var stepNumber: String = "",
    @SerializedName("TransRsn")
    var transRsn: String = "",
    @SerializedName("CustProfile")
    var custProfile: CustProfile = CustProfile()
)



