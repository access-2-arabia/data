package com.a2a.data.model.card.debit.changemobilenumber
import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize


@Parcelize
data class ChangeMobileNumberPostData(
    @SerializedName("Body")
    var body: Body = Body()
) : Parcelable {
    @Parcelize
    data class Body(
        @SerializedName("CardNumber")
        var cardNumber: String = "",
        @SerializedName("CountryPhoneCode")
        var countryPhoneCode: String = "",
        @SerializedName("PhoneNumber")
        var phoneNumber: String = ""
    ) : Parcelable
}