package com.a2a.data.model.changePassword


import com.google.gson.annotations.SerializedName

data class ChangePasswordPostData(
    @SerializedName("CustID")
    var custID: String = "",
    @SerializedName("Password")
    var password: String = "",
    @SerializedName("PasswordOld")
    var passwordOld: String = ""
)