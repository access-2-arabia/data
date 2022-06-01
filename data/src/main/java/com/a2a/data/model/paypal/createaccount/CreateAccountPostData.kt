package com.a2a.data.model.paypal.createaccount


import com.google.gson.annotations.SerializedName
import android.os.Parcelable

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

        @Parcelize
        data class CustProfile(
            @SerializedName("BirthDate")
            var birthDate: String = "",
            @SerializedName("City")
            var city: String = "",
            @SerializedName("Country")
            var country: String = "",
            @SerializedName("CustID")
            var custID: String = "",
            @SerializedName("EAddress1")
            var eAddress1: String = "",
            @SerializedName("EAddress2")
            var eAddress2: String = "",
            @SerializedName("EFName")
            var eFName: String = "",
            @SerializedName("ELName")
            var eLName: String = "",
            @SerializedName("EMName")
            var eMName: String = "",
            @SerializedName("EMail")
            var eMail: String = "",
            @SerializedName("MobNo")
            var mobNo: String = "",
            @SerializedName("Branch")
            var branch: String = ""
        ) : Parcelable
    }

    @Parcelize
    data class Footer(
        @SerializedName("Signature")
        var signature: String = ""
    ) : Parcelable

    @Parcelize
    data class Header(
        @SerializedName("BankCode")
        var bankCode: String = "",
        @SerializedName("Channel")
        var channel: String = "",
        @SerializedName("DeviceID")
        var deviceID: String = "",
        @SerializedName("GuidID")
        var guidID: String = "",
        @SerializedName("MethodName")
        var methodName: String = "",
        @SerializedName("Password")
        var password: String = "",
        @SerializedName("RegionCode")
        var regionCode: String = "",
        @SerializedName("SrvID")
        var srvID: String = "",
        @SerializedName("TimeStamp")
        var timeStamp: String = "",
        @SerializedName("UserID")
        var userID: String = ""
    ) : Parcelable
}
