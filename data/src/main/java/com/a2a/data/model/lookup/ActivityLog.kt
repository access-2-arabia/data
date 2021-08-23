package com.a2a.data.model.lookup

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class ActivityLog(
    @SerializedName("LastFailedTransfer")
    var lastFailedTransfer: String = "",
    @SerializedName("LastSuccessTransfer")
    var lastSuccessTransfer: String = "",
    @SerializedName("NoOfFailExternalTrx")
    var noOfFailExternalTrx: Int = 0,
    @SerializedName("NoOfFailInternalTrx")
    var noOfFailInternalTrx: Int = 0,
    @SerializedName("NoOfFailInternationalTrx")
    var noOfFailInternationalTrx: Int = 0,
    @SerializedName("NoOfSuccExternalTrx")
    var noOfSuccExternalTrx: Int = 0,
    @SerializedName("NoOfSuccInternalTrx")
    var noOfSuccInternalTrx: Int = 0,
    @SerializedName("NoOfSuccInternationalTrx")
    var noOfSuccInternationalTrx: Int = 0
) : Parcelable