package com.a2a.data.model.paypal.transaction
import android.os.Parcelable
import com.a2a.network.model.CustProfile
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize


@Parcelize
data class PaypalTransactionPostData(
    @SerializedName("Body")
    var body: Body = Body()
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
        @SerializedName("receiverList")
        var receiverList: ReceiverList = ReceiverList(),
        @SerializedName("CustProfile")
        var custProfile: CustProfile = CustProfile(),
        @SerializedName("returnUrl")
        var returnUrl: String = "",
        @SerializedName("SameAcc")
        var sameAcc: String = "",
        @SerializedName("StepNumber")
        var stepNumber: Int = 0
    ) : Parcelable {
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
                var email: String = ""
            ) : Parcelable
        }
    }
}