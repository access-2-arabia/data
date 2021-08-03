package com.a2a.data.model

import com.google.gson.annotations.SerializedName


data class BiometricPostData(
    @SerializedName("Body")
    var body: Body = Body(),
) {
    data class Body(
        @SerializedName("BranchCode")
        var branchCode: String = "JO0092000",
        @SerializedName("CustProfile")
        var custProfile: CustProfile = CustProfile()
    )

}