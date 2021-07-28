package com.a2a.data.model.otp


import com.google.gson.annotations.SerializedName

data class OTPPostData(
    @SerializedName("Body")
    var body: Body = Body()
) {
    data class Body(
        @SerializedName("Authenticate")
        var authenticate: Authenticate = Authenticate()
    ) {
        data class Authenticate(
            @SerializedName("PIN")
            var pIN: String = "",
            @SerializedName("UTR")
            var uTR: String = ""
        )
    }
}