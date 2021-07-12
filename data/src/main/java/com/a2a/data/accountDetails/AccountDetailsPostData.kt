package com.a2a.data.accountDetails

import com.google.gson.annotations.SerializedName


data class AccountDetailsPostData(
    @SerializedName("Body")
    var body: Body = Body()
) {
    data class Body(
        @SerializedName("AccountNumber")
        var accountNumber: String = "",
        @SerializedName("BranchCode")
        var branchCode: String = "",
        @SerializedName("CustMnemonic")
        var custMnemonic: String = "",
        @SerializedName("StepNumber")
        var stepNumber: Int = 0
    )
}