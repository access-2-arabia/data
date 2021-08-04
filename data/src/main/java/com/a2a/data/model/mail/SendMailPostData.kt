package com.a2a.data.model.mail


import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class SendMailPostData(
    @SerializedName("CustProfile")
    var custProfile: CustProfile = CustProfile(),
    @SerializedName("Email")
    var email: Email = Email(),
    @SerializedName("StepNumber")
    var stepNumber: Int? = 0
) : Parcelable {
    @Parcelize
    data class Email(
        @SerializedName("Subject")
        var subject: String = "",
        @SerializedName("Text")
        var text: String = ""
    ) : Parcelable
}