package com.a2a.data.model.accountlist

import com.a2a.network.model.CustProfile
import com.google.gson.annotations.SerializedName

data class ChangeNicknamePostData(

    @SerializedName("Accounts")
    var accounts: List<Account> = listOf(),
    @SerializedName("CID")
    var cID: Int = 0,
    @SerializedName("CustProfile")
    var custProfile: CustProfile = CustProfile(),
    @SerializedName("StepNumber")
    var stepNumber: Int = 0
) {
    data class Account(
        @SerializedName("AccountNumber")
        var accountNumber: String = "",
        @SerializedName("Description")
        var description: String = "",
        @SerializedName("Enabled")
        var enabled: String = ""
    )
}


