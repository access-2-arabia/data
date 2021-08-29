package com.a2a.data.model.card.debit.retrivecardpin
import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize


@Parcelize
data class RetrieveCardPinPostData(
    @SerializedName("Body")
    var body: Body = Body()
) : Parcelable {
    @Parcelize
    data class Body(
        @SerializedName("CardNumber")
        var cardNumber: String = ""
    ) : Parcelable
}