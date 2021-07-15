package com.a2a.data.model.accounts


import com.a2a.data.model.common.*
import com.google.gson.annotations.SerializedName

data class GetAccountsResponse(
    @SerializedName("A2AResponse")
    var a2AResponse: A2AResponse = A2AResponse(),
    @SerializedName("ErrorMsg")
    var errorMsg: ErrorMsg = ErrorMsg()
) {
    data class A2AResponse(
        @SerializedName("Body")
        var body: Body = Body(),
        @SerializedName("Footer")
        var footer: Footer = Footer(),
        @SerializedName("Header")
        var header: HeaderResponse = HeaderResponse()
    ) {
        data class Body(
            @SerializedName("AccGroups")
            var accGroups: List<AccGroup> = listOf(),
            @SerializedName("Accounts")
            var accounts: List<Account> = listOf(),
            @SerializedName("ServiceConfiguration")
            var serviceConfiguration: ServiceConfiguration = ServiceConfiguration(),
            @SerializedName("AccountTransactionsTotalDR")
            var accountTransactionsTotalDR: String = "",
            @SerializedName("AccountTransactionsTotalCR")
            var accountTransactionsTotalCR: String = ""
        ) {
            data class AccGroup(
                @SerializedName("ABalanceTip")
                var aBalanceTip: String = "",
                @SerializedName("ADesc")
                var aDesc: String = "",
                @SerializedName("EBalanceTip")
                var eBalanceTip: String = "",
                @SerializedName("EDesc")
                var eDesc: String = "",
                @SerializedName("GroupID")
                var groupID: Int = 0,
                @SerializedName("ID")
                var iD: Int = 0,
                @SerializedName("RegionCode")
                var regionCode: String = ""
            )
        }
    }

}