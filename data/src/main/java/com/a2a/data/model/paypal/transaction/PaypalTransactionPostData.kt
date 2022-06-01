package com.a2a.data.model.paypal.transaction

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize


@Parcelize
data class PaypalTransactionPostData(
    @SerializedName("Body")
    var body: Body = Body(),

    ) : Parcelable {
    @Parcelize
    data class Body(
        @SerializedName("AccFrom")
        var accFrom: String = "",
        @SerializedName("AccTo")
        var accTo: String = "",
        @SerializedName("cancelUrl")
        var cancelUrl: String = "",
        @SerializedName("CurrFrom")
        var currFrom: String = "",
        @SerializedName("CurrTo")
        var currTo: String = "",
        @SerializedName("CustProfile")
        var custProfile: CustProfile = CustProfile(),
        @SerializedName("receiverList")
        var receiverList: ReceiverList = ReceiverList(),
        @SerializedName("returnUrl")
        var returnUrl: String = "",
        @SerializedName("SameAcc")
        var sameAcc: String? = null,
        @SerializedName("StepNumber")
        var stepNumber: Int = 0,
        @SerializedName("Fees")
        var fees: String = "0"
    ) : Parcelable {
        @Parcelize
        data class CustProfile(
            @SerializedName("BirthDate")
            var birthDate: String = "",
            @SerializedName("Branch")
            var branch: String = "",
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
            var mobNo: String = ""
        ) : Parcelable

        @Parcelize
        data class ReceiverList(
            @SerializedName("receiver")
            var receiver: Receiver = Receiver()
        ) : Parcelable {
            @Parcelize
            data class Receiver(
                @SerializedName("amount")
                var amount: String = "",
                @SerializedName("email")
                var email: String? = null
            ) : Parcelable
        }
    }
}
