package com.a2a.data.model.accountlist


import com.a2a.network.model.CustProfile
import com.google.gson.annotations.SerializedName

data class ShowHidePostData(
    @SerializedName("Accounts")
    var accounts: List<AccountListResponse.A2AResponse.Body.Account> = listOf(),
    @SerializedName("CustProfile")
    var custProfile: CustProfile = CustProfile(),
    @SerializedName("StepNumber")
    var stepNumber: Int = 0
)
