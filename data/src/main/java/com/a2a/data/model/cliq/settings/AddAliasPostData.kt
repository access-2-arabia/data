package com.a2a.data.model.cliq.settings

import com.a2a.data.datasource.AppCash
import com.a2a.network.model.CustProfile
import com.google.gson.annotations.SerializedName

data class AddAliasPostData(

    @SerializedName("Account")
    var Account: CliQAccount = CliQAccount(),
    @SerializedName("Alias")
    var Alias: Alias = Alias(),
    @SerializedName("CustID")
    var custID: String = "",
    @SerializedName("Cust")
    var cust: Cust = Cust(),
    @SerializedName("UpdateAccount")
    var UpdateAccount: Boolean = false,
    @SerializedName("UpdateAlias")
    var updateAlias: Boolean = false,
    @SerializedName("AddAlias")
    var addAlias: Boolean = false,
    @SerializedName("AddAccount")
    var addAccount: Boolean = false,
    @SerializedName("CustProfile")
    var custProfile: CustProfile = CustProfile(),
    @SerializedName("RecordId")
    var recordId: String = "",
    @SerializedName("BranchCode")
    var branchCode: String = ""
) {
    data class Cust(
        @SerializedName("RecordId")
        var recordId: String = AppCash.cliQRecordId.toString()
    )
}

