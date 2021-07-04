package com.a2a.data.model.transfermodel.withincab
import com.google.gson.annotations.SerializedName


data class WithinCabPostData(
    @SerializedName("A2ARequest")
    var a2ARequest: A2ARequest = A2ARequest()
) {
    data class A2ARequest(
        @SerializedName("Body")
        var body: Body = Body(),
        @SerializedName("Footer")
        var footer: Footer = Footer(),
        @SerializedName("Header")
        var header: Header = Header()
    ) {
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
        ) {
            data class Accounts(
                @SerializedName("AccountNumberFrom")
                var accountNumberFrom: String = "",
                @SerializedName("AccountNumberTo")
                var accountNumberTo: String = "",
                @SerializedName("Amount")
                var amount: String = "",
                @SerializedName("CurrencyFrom")
                var currencyFrom: String = "",
                @SerializedName("CurrencyTo")
                var currencyTo: String = ""
            )

            data class CustProfile(
                @SerializedName("CID")
                var cID: Int = 0,
                @SerializedName("CustID")
                var custID: String = ""
            )
        }

        data class Footer(
            @SerializedName("Signature")
            var signature: String = ""
        )

        data class Header(
            @SerializedName("BankCode")
            var bankCode: String = "",
            @SerializedName("Channel")
            var channel: String = "",
            @SerializedName("DeviceID")
            var deviceID: String = "",
            @SerializedName("GuidID")
            var guidID: String = "",
            @SerializedName("Password")
            var password: String = "",
            @SerializedName("RegionCode")
            var regionCode: String = "",
            @SerializedName("SrvID")
            var srvID: String = "",
            @SerializedName("TimeStamp")
            var timeStamp: String = "",
            @SerializedName("UserID")
            var userID: String = ""
        )
    }
}