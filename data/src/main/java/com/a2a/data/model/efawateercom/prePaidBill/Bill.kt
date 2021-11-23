package com.a2a.data.model.efawateercom.prePaidBill

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
    @SerializedName("BillerCode")
    var billerCode: Int = 0,
    @SerializedName("BillingNo")
    var billingNo: String = "",
    @SerializedName("CustID")
    var custID: String = "",
    @SerializedName("CustInfoFlag")
    var custInfoFlag: Boolean = false,
    @SerializedName("Denomination")
    var denomination: String = "",
    @SerializedName("DueAmt")
    var dueAmt: Double = 0.0,
    @SerializedName("eMail")
    var eMail: String = "",
    @SerializedName("ErrorCode")
    var errorCode: Int = 0,
    @SerializedName("ErrorEDesc")
    var errorEDesc: String = "",
    @SerializedName("Fees")
    var fees: Double = 0.0,
    @SerializedName("ID")
    var iD: String = "",
    @SerializedName("IdType")
    var idType: String = "",
    @SerializedName("Name")
    var name: String = "",
    @SerializedName("Nation")
    var nation: String = "",
    @SerializedName("Phone")
    var phone: String = "",
    @SerializedName("ServiceType")
    var serviceType: String = "",
    @SerializedName("ValidationCode")
    var validationCode: String = "",
    @SerializedName("InqRefNo")
    var inqRefNo: String = "",
): Parcelable