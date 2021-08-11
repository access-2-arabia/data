package com.a2a.data.model.mail


import com.a2a.network.model.CustProfile
import com.google.gson.annotations.SerializedName

data class MailPostData(
    @SerializedName("CustProfile")
    var custProfile: CustProfile = CustProfile(),
    @SerializedName("StepNumber")
    var stepNumber: String = "",
    @SerializedName("Email")
    var email: Email = Email(),
) {
    data class Email(
        @SerializedName("Subject")
        var subject: String = "",
        @SerializedName("Text")
        var text: String = "",
        @SerializedName("ID")
        var iD: String = "",
        @SerializedName("Enabled")
        var enabled: String = ""
    )
}