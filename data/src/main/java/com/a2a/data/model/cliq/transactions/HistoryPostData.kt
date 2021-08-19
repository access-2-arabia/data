package com.a2a.data.model.cliq.transactions

import com.a2a.network.model.CustProfile
import com.google.gson.annotations.SerializedName


data class HistoryPostData(
    @SerializedName("CustID")
    var custID: String = "",
    @SerializedName("CustProfile")
    var custProfile: CustProfile = CustProfile(),
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
    var trxStatus: String = ""
)


