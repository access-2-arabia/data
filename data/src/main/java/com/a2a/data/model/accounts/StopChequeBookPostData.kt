package com.a2a.data.model.accounts


import com.a2a.network.model.CustProfile
import com.google.gson.annotations.SerializedName

data class StopChequeBookPostData(
    @SerializedName("CustProfile")
    var custProfile: CustProfile = CustProfile(),
    @SerializedName("Request")
    var request: Request = Request()
) {
    data class Request(
        @SerializedName("AccountNumber")
        var accountNumber: String = "",
        @SerializedName("Notes")
        var notes: String = "",
        @SerializedName("reason")
        var reason: String = ""
    )
}
