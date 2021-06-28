package com.a2a.data.model.lasttransaction
import com.google.gson.annotations.SerializedName


data class LastTransactionPostData(
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
            @SerializedName("Account")
            var account: Account = Account(),
            @SerializedName("BranchCode")
            var branchCode: String = "",
            @SerializedName("CustID")
            var custID: String = "",
            @SerializedName("DateFrom")
            var dateFrom: String = "",
            @SerializedName("DateTo")
            var dateTo: String = "",
            @SerializedName("IndexTo")
            var indexTo: String = "",
            @SerializedName("TransType")
            var transType: String = ""
        ) {
            data class Account(
                @SerializedName("AccountNumber")
                var accountNumber: String = ""
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
            @SerializedName("ConnectorID")
            var connectorID: String = "",
            @SerializedName("DeviceID")
            var deviceID: String = "",
            @SerializedName("MethodName")
            var methodName: String = "",
            @SerializedName("Password")
            var password: String = "",
            @SerializedName("RegionCode")
            var regionCode: String = "",
            @SerializedName("ServiceID")
            var serviceID: Int = 0,
            @SerializedName("SrvID")
            var srvID: String = "",
            @SerializedName("TimeStamp")
            var timeStamp: String = "",
            @SerializedName("UserID")
            var userID: String = ""
        )
    }
}