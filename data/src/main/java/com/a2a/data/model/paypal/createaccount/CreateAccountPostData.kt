package com.a2a.data.model.paypal.createaccount


import com.google.gson.annotations.SerializedName
import android.os.Parcelable
import com.a2a.network.model.CustProfile
import kotlinx.android.parcel.Parcelize


@Parcelize
data class CreateAccountPostData(
    @SerializedName("Body")
    var body: Body = Body()
) : Parcelable {
    @Parcelize
    data class Body(
        @SerializedName("AddPaymentCard")
        var addPaymentCard: AddPaymentCard = AddPaymentCard(),
        @SerializedName("createAccountWebOptions")
        var createAccountWebOptions: CreateAccountWebOptions = CreateAccountWebOptions(),
        @SerializedName("CustProfile")
        var custProfile: CustProfile = CustProfile(),
        @SerializedName("StepNumber")
        var stepNumber: Int = 0
    ) : Parcelable {
        @Parcelize
        data class AddPaymentCard(
            @SerializedName("cardNumber")
            var cardNumber: String = "",
            @SerializedName("cardType")
            var cardType: String = "",
            @SerializedName("cardVerificationNumber")
            var cardVerificationNumber: Int = 0,
            @SerializedName("expirationDate")
            var expirationDate: ExpirationDate = ExpirationDate()
        ) : Parcelable {
            @Parcelize
            data class ExpirationDate(
                @SerializedName("month")
                var month: String = "",
                @SerializedName("year")
                var year: String = ""
            ) : Parcelable
        }

        @Parcelize
        data class CreateAccountWebOptions(
            @SerializedName("returnUrl")
            var returnUrl: String = ""
        ) : Parcelable


    }
}