package com.a2a.data.model.login

import com.google.gson.annotations.SerializedName


data class LoginPostData(
    @SerializedName("Body")
    var body: Body = Body()
) {
    data class Body(
        @SerializedName("CustProfile")
        var custProfile: CustProfile = CustProfile()
    ) {
        data class CustProfile(
            @SerializedName("CustMnemonic")
            var custMnemonic: String = "",
            @SerializedName("PWD")
            var pWD: String = ""
        )
    }
}