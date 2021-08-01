package com.a2a.data.model.login

import com.a2a.data.model.common.Authenticate
import com.google.gson.annotations.SerializedName


data class LoginPostData(
    @SerializedName("Body")
    var body: Body = Body()
) {
    data class Body(
        @SerializedName("CustProfile")
        var custProfile: CustProfile = CustProfile(),
        @SerializedName("Authenticate")
        var authenticate: Authenticate = Authenticate()
    ) {
        data class CustProfile(
            @SerializedName("CustMnemonic")
            var custMnemonic: String = "",
            @SerializedName("PWD")
            var pWD: String = "",
            @SerializedName("LWTD")
            var lWTD: Boolean = false,
        )
    }
}