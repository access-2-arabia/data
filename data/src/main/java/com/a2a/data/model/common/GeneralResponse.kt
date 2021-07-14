package com.a2a.data.model.common

import android.os.Parcelable
import com.a2a.network.model.CustProfile
import com.a2a.network.model.OTPResponse
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

open class GeneralResponse(
    @SerializedName("A2AResponse")
    var a2AResponse: A2AResponse? = A2AResponse()
) {
    data class A2AResponse(
        @SerializedName("Header")
        var header: Header? = Header(),
        @SerializedName("Body")
        var body: Body? = null
    ) {

        data class Header(
            @SerializedName("Result")
            var result: Result? = Result(),
            @SerializedName("SessionID")
            var sessionID: String? = ""
        )

        @Parcelize
        data class Body(
            @SerializedName("Authenticate")
            var authenticate: Authenticate? = null,
            @SerializedName("OTP")
            var oTP: OTPResponse.A2AResponse.Body.OTP = OTPResponse.A2AResponse.Body.OTP(),
            @SerializedName("CustProfile")
            var custProfile: CustProfile = CustProfile(),
            @SerializedName("LoginDetails")
            var loginDetails: LoginDetails = LoginDetails(),
            @SerializedName("ActivityLog")
            var activityLog: ActivityLog = ActivityLog()
        ) : Parcelable {
            @Parcelize
            data class ActivityLog(
                @SerializedName("LastFailedTransfer")
                var lastFailedTransfer: String = "",
                @SerializedName("LastSuccessTransfer")
                var lastSuccessTransfer: String = "",
                @SerializedName("NoOfFailExternalTrx")
                var noOfFailExternalTrx: Int = 0,
                @SerializedName("NoOfFailInternalTrx")
                var noOfFailInternalTrx: Int = 0,
                @SerializedName("NoOfFailInternationalTrx")
                var noOfFailInternationalTrx: Int = 0,
                @SerializedName("NoOfSuccExternalTrx")
                var noOfSuccExternalTrx: Int = 0,
                @SerializedName("NoOfSuccInternalTrx")
                var noOfSuccInternalTrx: Int = 0,
                @SerializedName("NoOfSuccInternationalTrx")
                var noOfSuccInternationalTrx: Int = 0
            ) : Parcelable

            @Parcelize
            data class LoginDetails(
                @SerializedName("LastFailedLogin")
                var lastFailedLogin: String = "",
                @SerializedName("LastSuccessLogin")
                var lastSuccessLogin: String = "",
                @SerializedName("NoSuccLogin")
                var noSuccLogin: Int = 0,
                @SerializedName("PasswordExpiryDate")
                var passwordExpiryDate: String = "",
                @SerializedName("PasswordExpiryDays")
                var passwordExpiryDays: Int = 0
            ) : Parcelable

            @Parcelize
            data class Authenticate(
                @SerializedName("UTR")
                var uTR: String? = null
            ) : Parcelable


        }
    }

}