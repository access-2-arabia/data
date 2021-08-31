package com.a2a.data.model.cliq.settings


import com.google.gson.annotations.SerializedName

data class AddAccountResponse(
    @SerializedName("Account")
    var account: Account = Account(),
    @SerializedName("AddAccount")
    var addAccount: Boolean = false,
    @SerializedName("AddAlias")
    var addAlias: Boolean = false,
    @SerializedName("Alias")
    var alias: Alias = Alias(),
    @SerializedName("BranchCode")
    var branchCode: String = "",
    @SerializedName("Cust")
    var cust: Cust = Cust(),
    @SerializedName("UpdateAccount")
    var updateAccount: Boolean = false,
    @SerializedName("UpdateAlias")
    var updateAlias: Boolean = false
) {
    data class Account(
        @SerializedName("bic")
        var bic: String = "",
        @SerializedName("closingDate")
        var closingDate: String = "",
        @SerializedName("CustID")
        var custID: String = "",
        @SerializedName("IsDefault")
        var isDefault: Boolean = false,
        @SerializedName("openingDate")
        var openingDate: String = "",
        @SerializedName("RecordId")
        var recordId: String = "",
        @SerializedName("type")
        var type: String = ""
    )

    data class Alias(
        @SerializedName("alias")
        var alias: Alias = Alias()
    ) {
        data class Alias(
            @SerializedName("RecordId")
            var recordId: String = "",
            @SerializedName("startDate")
            var startDate: String = "",
            @SerializedName("status")
            var status: String = "",
            @SerializedName("type")
            var type: String = "",
            @SerializedName("value")
            var value: String = "",

        )
    }

    data class Cust(
        @SerializedName("RecordId")
        var recordId: String = ""
    )
}
