package com.a2a.data.model.transfermodel.Internationaltransfer

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize


@Parcelize
data class IMTValidationPostData(
    @SerializedName("Body")
    var body: Body = Body()
) : Parcelable {
    @Parcelize
    data class Body(
        @SerializedName("ACCOUNTWITHBANK")
        var aCCOUNTWITHBANK: String = "",
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
        @SerializedName("Amount")
        var amount: String = "",
        @SerializedName("BENCOUNTRY")
        var bENCOUNTRY: String = "",
        @SerializedName("BFDType")
        var bFDType: String = "",
        @SerializedName("BankRef")
        var bankRef: String = "",
        @SerializedName("BenAccIBAN")
        var benAccIBAN: String = "",
        @SerializedName("BranchCode")
        var branchCode: String = "",
        @SerializedName("CurrencyCodeFrom")
        var currencyCodeFrom: String = "",
        @SerializedName("CurrencyCodeTo")
        var currencyCodeTo: String = "",
        @SerializedName("ExecutedBranch")
        var executedBranch: String = "",
        @SerializedName("INTERMEDBANK")
        var iNTERMEDBANK: String = "",
        @SerializedName("StepNumber")
        var stepNumber: String = "",
        @SerializedName("TransRsn")
        var transRsn: String = "",
        @SerializedName("BenName")
        var benName: String = "",
        @SerializedName("BenName2")
        var benName2: String = "",
        @SerializedName("BenName3")
        var benName3: String = "",
        @SerializedName("BenName4")
        var benName4: String = ""
    ) : Parcelable
}