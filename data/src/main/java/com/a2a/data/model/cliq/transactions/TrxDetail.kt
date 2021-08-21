package com.a2a.data.model.cliq.transactions

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class TrxDetail(
    @SerializedName("AddInfo1")
    var addInfo1: String = "",
    @SerializedName("AddInfo2")
    var addInfo2: String = "",
    @SerializedName("AddInfo3")
    var addInfo3: String = "",
    @SerializedName("AddInfo4")
    var addInfo4: String = "",
    @SerializedName("AllowReturn")
    var allowReturn: Boolean = false,
    @SerializedName("Amount")
    var amount: Double = 0.0,
    @SerializedName("CdtrAcct")
    var cdtrAcct: String = "",
    @SerializedName("CdtrAddr")
    var cdtrAddr: String = "",
    @SerializedName("CdtrAgt")
    var cdtrAgt: String = "",
    @SerializedName("CdtrAlias")
    var cdtrAlias: String = "",
    @SerializedName("CdtrMCC")
    var cdtrMCC: String = "",
    @SerializedName("CdtrName")
    var cdtrName: String = "",
    @SerializedName("CdtrRecordID")
    var cdtrRecordID: String = "",
    @SerializedName("CreDtTm")
    var creDtTm: String = "",
    @SerializedName("CtgyPurp")
    var ctgyPurp: String = "",
    @SerializedName("Curr")
    var curr: String = "",
    @SerializedName("DbtrAcct")
    var dbtrAcct: String = "",
    @SerializedName("DbtrAddr")
    var dbtrAddr: String = "",
    @SerializedName("DbtrAgt")
    var dbtrAgt: String = "",
    @SerializedName("DbtrAlias")
    var dbtrAlias: String = "",
    @SerializedName("DbtrMCC")
    var dbtrMCC: String = "",
    @SerializedName("DbtrName")
    var dbtrName: String = "",
    @SerializedName("DbtrRecordID")
    var dbtrRecordID: String = "",
    @SerializedName("ErrorCode")
    var errorCode: Int = 0,
    @SerializedName("IntrBkSttlmDt")
    var intrBkSttlmDt: String = "",
    @SerializedName("MsgID")
    var msgID: String = "",
    @SerializedName("PayRefNo")
    var payRefNo: String = "",
    @SerializedName("PaymentDate")
    var paymentDate: String = "",
    @SerializedName("RgltryRptg")
    var rgltryRptg: String = "",
    @SerializedName("RmtInf")
    var rmtInf: String = "",
    @SerializedName("TrxDir")
    var trxDir: String = "",
    @SerializedName("TrxReason")
    var trxReason: String = "",
    @SerializedName("TrxStatus")
    var trxStatus: String = "",
    @SerializedName("TrxType")
    var trxType: String = ""
): Parcelable