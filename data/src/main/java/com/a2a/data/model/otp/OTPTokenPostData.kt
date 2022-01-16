package com.a2a.data.model.otp

import com.a2a.network.model.CustProfile
import com.google.gson.annotations.SerializedName
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


@Parcelize
data class OTPTokenPostData(
    @SerializedName("Body")
    var body: Body = Body()
) : Parcelable {
    @Parcelize
    data class Body(
        @SerializedName("CustProfile")
        var custProfile: CustProfile = CustProfile(),
        @SerializedName("Amount")
        var amount: String? = null,
        @SerializedName("SrvID")
        var srvID: String? = null,
        @SerializedName("CurrencyCode")
        var currencyCode: String? = null,
    ) : Parcelable
}