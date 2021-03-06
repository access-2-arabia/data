package com.a2a.data.model


import com.google.gson.annotations.SerializedName

data class LookUpPostData(
    @SerializedName("A2ARequest")
    var a2ARequest: A2ARequest = A2ARequest()
) {
    data class A2ARequest(
        @SerializedName("Body")
        var body: Body = Body(),
        @SerializedName("Footer")
        var footer: Footer = Footer(),
        @SerializedName("Header")
        var header: Header = Header()
    ) {
        data class Body(
            @SerializedName("LookUpName")
            var lookUpName: String? = ""
        )

        data class Footer(
            @SerializedName("Signature")
            var signature: String? = ""
        )


    }
}