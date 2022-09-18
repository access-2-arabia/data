package com.a2a.data.model.card.creditcard.periodstatment
import android.os.Parcelable


import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize


@Parcelize
data class PeriodStatementPostData(
    @SerializedName("Body")
    var body: Body = Body()
) : Parcelable {
    @Parcelize
    data class Body(
        @SerializedName("Cards")
        var cards: Cards = Cards()
    ) : Parcelable {
        @Parcelize
        data class Cards(
            @SerializedName("CardNo")
            var cardNo: String = "",
            @SerializedName("Date")
            var date: String = ""
        ) : Parcelable
    }
}