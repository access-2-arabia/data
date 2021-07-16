package com.a2a.data.model.efawateercom.postBill

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class HisBill(
    @SerializedName("BankCode")
    var bankCode: Int = 0,
    @SerializedName("DueAmount")
    var dueAmount: Double = 0.0,
    @SerializedName("JOEBPPSTrx")
    var jOEBPPSTrx: String = "",
    @SerializedName("PaidAmt")
    var paidAmt: Double = 0.0,
    @SerializedName("PmtStatus")
    var pmtStatus: String = "",
    @SerializedName("ProcessDate")
    var processDate: String = ""
) : Parcelable