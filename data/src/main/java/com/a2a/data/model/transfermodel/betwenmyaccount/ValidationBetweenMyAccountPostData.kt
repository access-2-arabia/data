package com.a2a.data.model.transfermodel.betwenmyaccount


import com.google.gson.annotations.SerializedName

data class ValidationBetweenMyAccountPostData(
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
            @SerializedName("AccountNumberFrom")
            var accountNumberFrom: String = "",
            @SerializedName("AccountNumberTo")
            var accountNumberTo: String = "",
            @SerializedName("Amount")
            var amount: String = "",
            @SerializedName("BankRef")
            var bankRef: String = "",
            @SerializedName("BranchCode")
            var branchCode: String = "",
            @SerializedName("CID")
            var cID: String = "",
            @SerializedName("CurrencyFrom")
            var currencyFrom: String = "",
            @SerializedName("CurrencyTo")
            var currencyTo: String = "",
            @SerializedName("CustID")
            var custID: String = "",
            @SerializedName("CustType")
            var custType: String = "",
            @SerializedName("RepID")
            var repID: String = "",
            @SerializedName("StepNumber")
            var stepNumber: String = ""
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