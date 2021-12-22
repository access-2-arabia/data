package com.a2a.data.model.dammanpay
import android.os.Parcelable
import com.a2a.network.model.CustProfile

import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize


@Parcelize
data class DamanPayPostData(
    @SerializedName("Body")
    var body: Body = Body()
) : Parcelable {
    @Parcelize
    data class Body(
        @SerializedName("StepNumber")
        var stepNumber: Int = 0,
        @SerializedName("CustProfile")
        var custProfile: CustProfile = CustProfile(),
        @SerializedName("AccFrom")
        var accFrom: String = "",
        @SerializedName("AccTo")
        var accTo: String = "",
        @SerializedName("CurrFrom")
        var currFrom: String = "",
        @SerializedName("CurrTo")
        var currTo: String = "",
        @SerializedName("Fees")
        var fees: String = "",
        @SerializedName("Amt")
        var amt: String = "",
        @SerializedName("PAY_NO")
        var payno: String = "",
        @SerializedName("serviceType")
        var serviceType: String = "",
        @SerializedName("DueAmount")
        var dueAmount: String = "",
        @SerializedName("subCategory")
        var subCategory: String = ""
    ) : Parcelable
}