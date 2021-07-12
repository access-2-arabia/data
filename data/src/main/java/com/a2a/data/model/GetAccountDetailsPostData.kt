package com.a2a.data.model


import com.a2a.network.model.CustProfile
import com.google.gson.annotations.SerializedName

data class GetAccountDetailsPostData(
    @SerializedName("Accounts")
    var accounts: Accounts = Accounts(),
    @SerializedName("CustProfile")
    var custProfile: CustProfile = CustProfile(),
    @SerializedName("Lang")
    var lang: Int = 0
) {
    data class Accounts(
        @SerializedName("AccountNumber")
        var accountNumber: String = "",
        @SerializedName("Description")
        var description: String = "",
        @SerializedName("Enabled")
        var enabled: Boolean = false
    )


}