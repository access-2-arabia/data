package com.a2a.data.model.cliq.pendingRequest


import com.a2a.network.model.CustProfile
import com.google.gson.annotations.SerializedName

data class PendingPaymentPostData(

    @SerializedName("CustID")
    var custID: String = "",
    @SerializedName("DateFrom")
    var dateFrom: String = "",
    @SerializedName("DateTo")
    var dateTo: String = "",
    @SerializedName("LastTrxNo")
    var lastTrxNo: String = "",
    @SerializedName("RequestType")
    var requestType: String = "",
    @SerializedName("TrxDir")
    var trxDir: String = "",
    @SerializedName("TrxStatus")
    var trxStatus: String = "",
    @SerializedName("CustProfile")
    var custProfile: CustProfile = CustProfile()
)
