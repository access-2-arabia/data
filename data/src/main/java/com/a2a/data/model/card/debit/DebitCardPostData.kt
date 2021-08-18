package com.a2a.data.model.card.debit

import com.google.gson.annotations.SerializedName
import android.os.Parcelable
import com.a2a.network.model.CustProfile
import kotlinx.android.parcel.Parcelize


@Parcelize
data class DebitCardPostData(
    @SerializedName("Body")
    var body: Body = Body()
) : Parcelable {
    @Parcelize
    data class Body(
        @SerializedName("CustProfile")
        var custProfile: CustProfile = CustProfile()
    )
}