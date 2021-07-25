package com.a2a.data.model.lookup

import com.google.gson.annotations.SerializedName

data class ContactUsBody(
    @SerializedName("ContactUs")
    var contactUs: ContactUs = ContactUs(),
) {
    data class ContactUs(
        @SerializedName("BranchEmail")
        var branchEmail: String = "",
        @SerializedName("CallCenter")
        var callCenter: String = "",
        @SerializedName("LocationA")
        var locationA: String = "",
        @SerializedName("LocationE")
        var locationE: String = "",
        @SerializedName("Location_X")
        var locationX: String = "",
        @SerializedName("Location_Y")
        var locationY: String = "",
        @SerializedName("PhoneBank")
        var phoneBank: String = "",
        @SerializedName("URL")
        var uRL: String = ""
    )
}