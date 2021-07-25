package com.a2a.data.model.accounts


import com.a2a.network.model.CustProfile
import com.google.gson.annotations.SerializedName

data class RequestChequeBookPostData(
    @SerializedName("CustProfile")
    var custProfile: CustProfile = CustProfile(),
    @SerializedName("Request")
    var request: Request = Request()
) {
    data class Request(
        @SerializedName("AccountNumber")
        var accountNumber: String = "",
        @SerializedName("Branch")
        var branch: String = "",
        @SerializedName("BranchName")
        var branchName: String = "",
        @SerializedName("NoBooks")
        var noBooks: String = "",
        @SerializedName("NoPages")
        var noPages: String = "",
        @SerializedName("Language")
        var language: String = ""
    )
}


