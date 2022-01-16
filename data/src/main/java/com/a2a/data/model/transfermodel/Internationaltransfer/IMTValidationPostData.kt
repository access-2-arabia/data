package com.a2a.data.model.transfermodel.Internationaltransfer

import android.os.Parcelable
import com.a2a.network.model.CustProfile
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
        var benName4: String = "",
        @SerializedName("SwiftRouting")
        var swiftRouting: String = "",
        @SerializedName("PaymentDetail")
        var paymentDetail: String = "",
        @SerializedName("PaymentDetail2")
        var paymentDetail2: String = "",
        @SerializedName("ChargesFor")
        var chargesFor: String = "",
        @SerializedName("CustProfile")
        var custProfile: CustProfile = CustProfile()
    ) : Parcelable
}