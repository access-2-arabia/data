package com.a2a.data.model.accountlist

import com.a2a.network.model.CustProfile
import com.google.gson.annotations.SerializedName


data class AccountListPostData(
    @SerializedName("BranchCode")
    var branchCode: String = "",
    @SerializedName("CustProfile")
    var custProfile: CustProfile = CustProfile(),
    @SerializedName("StepNumber")
    var stepNumber: Int = 1,
    @SerializedName("SrvID")
    var srvID: String? = null
)


