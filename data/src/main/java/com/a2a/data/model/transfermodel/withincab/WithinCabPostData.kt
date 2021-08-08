package com.a2a.data.model.transfermodel.withincab
import com.a2a.network.model.CustProfile
import com.a2a.data.repository.transfer.Accounts
import com.google.gson.annotations.SerializedName

data class WithinCabPostData(
    @SerializedName("Body")
    var body: Body = Body()
)
data class Body(
    @SerializedName("ADesc")
    var aDesc: String = "",
    @SerializedName("Accounts")
    var accounts: Accounts = Accounts(),
    @SerializedName("BankRef")
    var bankRef: String = "",
    @SerializedName("BranchCode")
    var branchCode: String = "",
    @SerializedName("Count")
    var count: String = "",
    @SerializedName("CustProfile")
    var custProfile: CustProfile = CustProfile(),
    @SerializedName("EDesc")
    var eDesc: String = "",
    @SerializedName("Period")
    var period: Int = 0,
    @SerializedName("StartDate")
    var startDate: String = "",
    @SerializedName("StepNumber")
    var stepNumber: Int = 0
)
