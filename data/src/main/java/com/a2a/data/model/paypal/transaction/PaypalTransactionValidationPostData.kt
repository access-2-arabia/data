package com.a2a.data.model.paypal.transaction

import android.os.Parcelable
import com.a2a.network.model.CustProfile
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class PaypalTransactionValidationPostData(
    @SerializedName("Body")
    var body: Body = Body()
) : Parcelable {
    @Parcelize
    data class Body(
        @SerializedName("AccFrom")
        var accFrom: String = "",
        @SerializedName("AccTo")
        var accTo: String = "",
        @SerializedName("Amt")
        var amt: Int = 0,
        @SerializedName("CurrFrom")
        var currFrom: String = "",
        @SerializedName("CurrTo")
        var currTo: String = "",
        @SerializedName("CustProfile")
        var custProfile: CustProfile = CustProfile(),
        @SerializedName("Fees")
        var fees: String = "",
        @SerializedName("SameAcc")
        var sameAcc:  String? = null ,
        @SerializedName("StepNumber")
        var stepNumber: Int = 0
    ) : Parcelable
}