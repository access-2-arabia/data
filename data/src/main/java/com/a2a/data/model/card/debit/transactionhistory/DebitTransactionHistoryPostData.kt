package com.a2a.data.model.card.debit.transactionhistory
import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize


@Parcelize
data class DebitTransactionHistoryPostData(
    @SerializedName("Body")
    var body: Body = Body()
) : Parcelable {
    @Parcelize
    data class Body(
        @SerializedName("CardNumber")
        var cardNumber: String = "",
        @SerializedName("DateFrom")
        var dateFrom: String = "",
        @SerializedName("DateTo")
        var dateTo: String = "",
        @SerializedName("RegionCode")
        var regionCode: String = ""
    ) : Parcelable
}