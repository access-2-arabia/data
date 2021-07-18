package com.a2a.data.model.accountlist

import com.a2a.data.model.CustProfileModel
import com.google.gson.annotations.SerializedName


data class AccountListPostData(
    @SerializedName("Body")
    var body: Body = Body(),
) {
    data class Body(
        @SerializedName("BankRef")
        var bankRef: String = "",
        @SerializedName("BranchCode")
        var branchCode: String = "",
        @SerializedName("CustProfile")
        var custProfile: CustProfileModel = CustProfileModel()
    )

}