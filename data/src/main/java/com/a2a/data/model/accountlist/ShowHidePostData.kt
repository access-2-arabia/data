package com.a2a.data.model.accountlist


import com.google.gson.annotations.SerializedName

data class ShowHidePostData(
    @SerializedName("Accounts")
    var accounts: List<AccountListResponse.A2AResponse.Body.Account> = listOf(),
    @SerializedName("CustProfile")
    var custProfile: CustProfile = CustProfile(),
    @SerializedName("StepNumber")
    var stepNumber: Int = 0
) {

    data class CustProfile(
        @SerializedName("CID")
        var cID: Int = 0,
        @SerializedName("CustID")
        var custID: String = "",
        @SerializedName("RID")
        var rID: Int = 0,
        @SerializedName("RepID")
        var repID: Any = Any()
    )
}
