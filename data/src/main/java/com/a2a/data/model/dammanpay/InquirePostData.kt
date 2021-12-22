package com.a2a.data.model.dammanpay

import android.os.Parcelable
import com.a2a.network.model.CustProfile
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize


@Parcelize
data class InquirePostData(
    @SerializedName("Body")
    var body: Body = Body()
) : Parcelable {
    @Parcelize
    data class Body(
        @SerializedName("StepNumber")
        var stepNumber: Int = 0,
        @SerializedName("CustProfile")
        var custProfile: CustProfile = CustProfile(),
        @SerializedName("PAY_NO")
        var payNo: String = "",
        @SerializedName("serviceType")
        var serviceType: Int = 0,
        @SerializedName("subCategory")
        var subCategory: String = ""
    ) : Parcelable
}