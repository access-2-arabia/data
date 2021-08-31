package com.a2a.data.model.cliq.createProfile


import com.google.gson.annotations.SerializedName

data class FundsAccountResponse(
    @SerializedName("A2ARequest")
    var a2ARequest: A2ARequest = A2ARequest(),
    @SerializedName("A2AResponse")
    var a2AResponse: A2AResponse = A2AResponse(),
    @SerializedName("ErrorMsg")
    var errorMsg: ErrorMsg = ErrorMsg()
) {
    data class A2ARequest(
        @SerializedName("Body")
        var body: Body = Body(),
        @SerializedName("Footer")
        var footer: Footer = Footer(),
        @SerializedName("Header")
        var header: Header = Header()
    ) {
        class Body(
        )

        data class Footer(
            @SerializedName("Signature")
            var signature: String = ""
        )

        data class Header(
            @SerializedName("BankCode")
            var bankCode: String = "",
            @SerializedName("Channel")
            var channel: String = "",
            @SerializedName("ConnectorID")
            var connectorID: Any = Any(),
            @SerializedName("Device")
            var device: Any = Any(),
            @SerializedName("DeviceID")
            var deviceID: Any = Any(),
            @SerializedName("DeviceToken")
            var deviceToken: Any = Any(),
            @SerializedName("GuidID")
            var guidID: String = "",
            @SerializedName("MethodName")
            var methodName: String = "",
            @SerializedName("Password")
            var password: String = "",
            @SerializedName("RegionCode")
            var regionCode: String = "",
            @SerializedName("ServiceID")
            var serviceID: Int = 0,
            @SerializedName("SessionID")
            var sessionID: Any = Any(),
            @SerializedName("SrvID")
            var srvID: String = "",
            @SerializedName("TimeStamp")
            var timeStamp: String = "",
            @SerializedName("UserID")
            var userID: String = ""
        )
    }

    data class A2AResponse(
        @SerializedName("Body")
        var body: Body = Body(),
        @SerializedName("Footer")
        var footer: Footer = Footer(),
        @SerializedName("Header")
        var header: Header = Header()
    ) {
        data class Body(
            @SerializedName("AccGroups")
            var accGroups: List<AccGroup> = listOf(),
            @SerializedName("Accounts")
            var accounts: List<Account> = listOf(),
            @SerializedName("ServiceConfiguration")
            var serviceConfiguration: ServiceConfiguration = ServiceConfiguration()
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

            data class Account(
                @SerializedName("AAccountType")
                var aAccountType: String = "",
                @SerializedName("ACurrency")
                var aCurrency: String = "",
                @SerializedName("AccGroupID")
                var accGroupID: String = "",
                @SerializedName("AccountNumber")
                var accountNumber: String = "",
                @SerializedName("AccountType")
                var accountType: String = "",
                @SerializedName("AvailableBalance")
                var availableBalance: String = "",
                @SerializedName("AvailableBalanceFC")
                var availableBalanceFC: String = "",
                @SerializedName("Branch")
                var branch: String = "",
                @SerializedName("BranchCode")
                var branchCode: String = "",
                @SerializedName("CurrencyCode")
                var currencyCode: String = "",
                @SerializedName("CurrencyISOCode")
                var currencyISOCode: String = "",
                @SerializedName("CurrentBalance")
                var currentBalance: String = "",
                @SerializedName("CurrentBalanceFC")
                var currentBalanceFC: String = "",
                @SerializedName("EAccountType")
                var eAccountType: String = "",
                @SerializedName("ECurrency")
                var eCurrency: String = "",
                @SerializedName("Enabled")
                var enabled: Boolean = false,
                @SerializedName("IBAN")
                var iBAN: String = "",
                @SerializedName("NickName")
                var nickName: String = "",
                @SerializedName("Type")
                var type: String = ""
            ){
                override fun toString(): String {
                    return nickName.plus(" $currencyCode")
                }
            }

            data class ServiceConfiguration(
                @SerializedName("PWDFlag")
                var pWDFlag: Int = 0
            )
        }

        data class Footer(
            @SerializedName("Signature")
            var signature: String = ""
        )

        data class Header(
            @SerializedName("GuidID")
            var guidID: String = "",
            @SerializedName("RegionCode")
            var regionCode: String = "",
            @SerializedName("Result")
            var result: Result = Result(),
            @SerializedName("SessionID")
            var sessionID: Any = Any(),
            @SerializedName("SrvID")
            var srvID: Int = 0,
            @SerializedName("TimeStamp")
            var timeStamp: String = ""
        ) {
            data class Result(
                @SerializedName("ADesc")
                var aDesc: String = "",
                @SerializedName("EDesc")
                var eDesc: String = "",
                @SerializedName("ErrorCode")
                var errorCode: Int = 0
            )
        }
    }

    data class ErrorMsg(
        @SerializedName("ADesc")
        var aDesc: String = "",
        @SerializedName("EDesc")
        var eDesc: String = "",
        @SerializedName("ErrorCode")
        var errorCode: Int = 0
    )
}