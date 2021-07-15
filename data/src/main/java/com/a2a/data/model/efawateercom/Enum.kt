package com.a2a.data.model.efawateercom

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Enum(
    @SerializedName("ADesc")
    var aDesc: String = "",
    @SerializedName("ArImg")
    var arImg: String = "",
    @SerializedName("ArLogo")
    var arLogo: String = "",
    @SerializedName("ArMsg")
    var arMsg: String = "",
    @SerializedName("ArShortName")
    var arShortName: String = "",
    @SerializedName("BillerSrvType")
    var billerSrvType: List<BillerSrvType> = listOf(),
    @SerializedName("Code")
    var code: String = "",
    @SerializedName("EDesc")
    var eDesc: String = "",
    @SerializedName("Email")
    var email: String = "",
    @SerializedName("EnImg")
    var enImg: String = "",
    @SerializedName("EnLogo")
    var enLogo: String = "",
    @SerializedName("EnMsg")
    var enMsg: String = "",
    @SerializedName("EnShortName")
    var enShortName: String = "",
    @SerializedName("IntType")
    var intType: String = "",
    @SerializedName("Phone")
    var phone: String = "",
    @SerializedName("StmtBankCode")
    var stmtBankCode: String = "",
    @SerializedName("Website")
    var website: String = ""
) : Parcelable {


    @Parcelize
    data class BillerSrvType(
        @SerializedName("ADesc")
        var aDesc: String = "",
        @SerializedName("ALabel")
        var aLabel: String = "",
        @SerializedName("ArImg")
        var arImg: String = "",
        @SerializedName("ArLblShortDesc")
        var arLblShortDesc: String = "",
        @SerializedName("ArShortDesc")
        var arShortDesc: String = "",
        @SerializedName("BillingNoFlag")
        var billingNoFlag: Boolean = false,
        @SerializedName("Code")
        var code: String = "",
        @SerializedName("DenoFlag")
        var denoFlag: Boolean = false,
        @SerializedName("Denominations")
        var denominations: List<Denomination> = listOf(),
        @SerializedName("EDesc")
        var eDesc: String = "",
        @SerializedName("ELabel")
        var eLabel: String = "",
        @SerializedName("EnImg")
        var enImg: String = "",
        @SerializedName("EnLblShortDesc")
        var enLblShortDesc: String = "",
        @SerializedName("EnShortDesc")
        var enShortDesc: String = "",
        @SerializedName("MArImg")
        var mArImg: String = "",
        @SerializedName("MArMsg")
        var mArMsg: String = "",
        @SerializedName("MEnImg")
        var mEnImg: String = "",
        @SerializedName("MEnMsg")
        var mEnMsg: String = "",
        @SerializedName("Postpaid")
        var postpaid: Boolean = false,
        var category: String = ""

    ) : Parcelable {
        @Parcelize
        data class Denomination(
            @SerializedName("ADesc")
            var aDesc: String = "",
            @SerializedName("ArShortDesc")
            var arShortDesc: String = "",
            @SerializedName("Code")
            var code: String = "",
            @SerializedName("EDesc")
            var eDesc: String = "",
            @SerializedName("EnShortDesc")
            var enShortDesc: String = "",
            @SerializedName("Type")
            var type: String = ""
        ) : Parcelable
    }
}