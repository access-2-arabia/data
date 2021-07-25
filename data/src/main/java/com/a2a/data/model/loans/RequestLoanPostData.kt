package com.a2a.data.model.loans


import android.os.Parcelable
import com.a2a.network.model.CustProfile
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

data class RequestLoanPostData(
    @SerializedName("CustProfile")
    var custProfile: CustProfile = CustProfile(),
    @SerializedName("Request")
    var request: Request = Request()
) {
    @Parcelize
    data class Request(
        @SerializedName("amount")
        var amount: String = "",
        @SerializedName("Besttime")
        var besttime: String = "",
        var bestTimeDesc: String = "",
        @SerializedName("ContactNumber")
        var contactNumber: String = "",
        @SerializedName("Loantype")
        var loantype: String = "",
        var loanTypeDesc: String = "",
        @SerializedName("period")
        var period: String = "",
        var periodDesc: String = ""
    ) : Parcelable
}
