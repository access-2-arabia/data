package com.a2a.data.model.efawateercom.postBill

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Bill_(
    @SerializedName("BillNo")
    var billNo: String = "",
    @SerializedName("BillStatus")
    var billStatus: String = "",
    @SerializedName("DueAmount")
    var dueAmount: Double = 0.0,
    @SerializedName("DueDate")
    var dueDate: String = "",
    @SerializedName("FeesAmt")
    var feesAmt: Double = 0.0,
    @SerializedName("FeesOnBiller")
    var feesOnBiller: Boolean = false,
    @SerializedName("AllowPart")
    var allowPart: Boolean = false,
    @SerializedName("HisBills")
    var hisBills: List<HisBill> = listOf(),
    @SerializedName("IssueDate")
    var issueDate: String = "",
    @SerializedName("Lower")
    var lower: Double = 0.0,
    @SerializedName("ServiceType")
    var serviceType: String = "",
    @SerializedName("Upper")
    var upper: Double = 0.0,
//
    @SerializedName("SenderEName")
    var SenderEName: String = "",
    @SerializedName("SenderAName")
    var SenderAName: String = "",
    @SerializedName("SenderNation")
    var SenderNation: String = "",
    @SerializedName("SenderIDType")
    var SenderIDType: String = "",
    @SerializedName("SenderID")
    var SenderID: String = "",
    @SerializedName("BenEName")
    var BenEName: String = "",
    @SerializedName("BenAName")
    var BenAName: String = "",
    @SerializedName("BenNation")
    var BenNation: String = "",
    @SerializedName("TransferReason")
    var TransferReason: String = "",
    @SerializedName("ReceivingCountry")
    var ReceivingCountry: String = "",
    @SerializedName("CustName")
    var CustName: String = ""
) : Parcelable