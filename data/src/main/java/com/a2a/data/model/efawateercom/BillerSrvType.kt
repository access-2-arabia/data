package com.a2a.data.model.efawateercom

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

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
    var category: String = "",
    @SerializedName("Regex")
    var regex: String = "",
    @SerializedName("BillType")
    var billType: String = ""

) : Parcelable