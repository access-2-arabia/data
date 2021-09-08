package com.a2a.data.model.card.creditcard.pendingauthorization
import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize


@Parcelize
data class PendingAuthorizationPostData(
    @SerializedName("Body")
    var body: Body = Body()
) : Parcelable {
    @Parcelize
    data class Body(
        @SerializedName("CardNumber")
        var cardNumber: String = "",
        @SerializedName("MaskPan")
        var maskPan: String = "",
        @SerializedName("RegionCode")
        var regionCode: String = ""
    ) : Parcelable
}