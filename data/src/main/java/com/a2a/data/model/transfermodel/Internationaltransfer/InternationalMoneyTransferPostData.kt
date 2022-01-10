package com.a2a.data.model.transfermodel.Internationaltransfer
import android.os.Parcelable
import com.a2a.network.model.CustProfile


import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize


@Parcelize
data class InternationalMoneyTransferPostData(
    @SerializedName("Body")
    var body: Body = Body()
) : Parcelable {
    @Parcelize
    data class Body(
        @SerializedName("ACCOUNTWITHBANK")
        var aCCOUNTWITHBANK: String = "",
        @SerializedName("ADesc")
        var aDesc: String = "",
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
        @SerializedName("BenName")
        var benName: String = "",
        @SerializedName("BenName2")
        var benName2: String = "",
        @SerializedName("BenName3")
        var benName3: String = "",
        @SerializedName("BenName4")
        var benName4: String = "",
        @SerializedName("BranchCode")
        var branchCode: String = "",
        @SerializedName("ChargesFor")
        var chargesFor: String = "",
        @SerializedName("Count")
        var count: String = "",
        @SerializedName("CurrencyCodeFrom")
        var currencyCodeFrom: String = "",
        @SerializedName("CurrencyCodeTo")
        var currencyCodeTo: String = "",
        @SerializedName("EDesc")
        var eDesc: String = "",
        @SerializedName("INTERMEDBANK")
        var iNTERMEDBANK: String = "",
        @SerializedName("LocalAmtCredit")
        var localAmtCredit: String = "",
        @SerializedName("PaymentDetail")
        var paymentDetail: String = "",
        @SerializedName("PaymentDetail2")
        var paymentDetail2: String = "",
        @SerializedName("Period")
        var period: String = "",
        @SerializedName("RefNo")
        var refNo: Any? = null,
        @SerializedName("StartDate")
        var startDate: String = "",
        @SerializedName("StepNumber")
        var stepNumber: Int = 0,
        @SerializedName("SwiftRouting")
        var swiftRouting: String = "",
        @SerializedName("TransRsn")
        var transRsn: String = "",
        @SerializedName("CustProfile")
        var custProfile: CustProfile = CustProfile()
    ) : Parcelable
}