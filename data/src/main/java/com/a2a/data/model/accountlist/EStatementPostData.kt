package com.a2a.data.model.accountlist


import com.google.gson.annotations.SerializedName

data class EStatementPostData(

    @SerializedName("Accounts")
    var accounts: Accounts = Accounts()
) {
    data class Accounts(
        @SerializedName("AccountNumber")
        var accountNumber: String = "",
        @SerializedName("CustID")
        var custID: String = ""
    )
}

