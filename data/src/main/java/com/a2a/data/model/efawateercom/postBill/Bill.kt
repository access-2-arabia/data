package com.a2a.data.model.efawateercom.postBill

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Bill(
    @SerializedName("A2AChannel")
    var a2AChannel: String = "",
    @SerializedName("A2APWD")
    var a2APWD: String = "",
    @SerializedName("A2AUserID")
    var a2AUserID: String = "",
    @SerializedName("Address")
    var address: String = "",
    @SerializedName("BillNo")
    var billNo: String = "",
    @SerializedName("BillerCode")
    var billerCode: Int = 0,
    @SerializedName("BillingNo")
    var billingNo: String = "",
    @SerializedName("Bills")
    var bills: List<Bill_> = listOf(),
    @SerializedName("CustID")
    var custID: String = "",
    @SerializedName("CustInfoFlag")
    var custInfoFlag: Boolean = false,
    @SerializedName("DateFlag")
    var dateFlag: Boolean = false,
    @SerializedName("eMail")
    var eMail: String = "",
    @SerializedName("EndDt")
    var endDt: String = "",
    @SerializedName("ErrorCode")
    var errorCode: Int = 0,
    @SerializedName("ErrorEDesc")
    var errorEDesc: String = "",
    @SerializedName("ID")
    var iD: String = "",
    @SerializedName("IdType")
    var idType: String = "",
    @SerializedName("IncPayments")
    var incPayments: Boolean = false,
    @SerializedName("InqRefNo")
    var inqRefNo: String = "",
    @SerializedName("JOEBPPSNo")
    var jOEBPPSNo: Int = 0,
    @SerializedName("Name")
    var name: String = "",
    @SerializedName("Nation")
    var nation: String = "",
    @SerializedName("Phone")
    var phone: String = "",
    @SerializedName("ServiceType")
    var serviceType: String = "",
    @SerializedName("StartDt")
    var startDt: String = ""
) : Parcelable
