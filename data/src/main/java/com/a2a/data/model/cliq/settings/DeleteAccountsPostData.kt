package com.a2a.data.model.cliq.settings

import com.a2a.network.model.CustProfile
import com.google.gson.annotations.SerializedName

data class DeleteAccountsPostData(

    @SerializedName("RequestType")
    var requestType: String = "",
    @SerializedName("Account")
    var Account: CliQAccount = CliQAccount(),
    @SerializedName("Alias")
    var Alias: Alia? = Alia(),
    @SerializedName("CustID")
    var custID: String = "",
    @SerializedName("Cust")
    var cust: Cust = Cust(),
    @SerializedName("UpdateAccount")
    var UpdateAccount: Boolean = false,
    @SerializedName("CustProfile")
    var custProfile: CustProfile = CustProfile(),
    @SerializedName("RecordId")
    var recordId: String = ""
) {
    data class Cust(
        @SerializedName("RecordId")
        var recordId: String = ""
    )

    data class Alia(
        @SerializedName("RecordId")
        var recordId: String = "",
        @SerializedName("type")
        var type: String = "",
        @SerializedName("value")
        var value: String = ""
    )
}

