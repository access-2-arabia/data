package com.a2a.data.model.card.debit.vertualprepaid
import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class VirtualPrepaidPostData(
    @SerializedName("Body")
    var body: Body = Body()
) : Parcelable {
    @Parcelize
    data class Body(
        @SerializedName("CustID")
        var custID: String = ""
    ) : Parcelable
}