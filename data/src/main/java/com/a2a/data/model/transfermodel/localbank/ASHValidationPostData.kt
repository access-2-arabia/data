package com.a2a.data.model.transfermodel.localbank
import com.google.gson.annotations.SerializedName


data class ASHValidationPostData(
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
            @SerializedName("AFName")
            var aFName: String = "",
            @SerializedName("ALName")
            var aLName: String = "",
            @SerializedName("ASName")
            var aSName: String = "",
            @SerializedName("ATName")
            var aTName: String = "",
            @SerializedName("AccountNumberFrom")
            var accountNumberFrom: String = "",
            @SerializedName("AccountNumberTo")
            var accountNumberTo: String = "",
            @SerializedName("Amount")
            var amount: String = "",
            @SerializedName("BFDType")
            var bFDType: String = "",
            @SerializedName("BankRef")
            var bankRef: String = "",
            @SerializedName("BenAccIBAN")
            var benAccIBAN: String = "",
            @SerializedName("BenBank")
            var benBank: String = "",
            @SerializedName("BenName")
            var benName: String = "",
            @SerializedName("BranchCode")
            var branchCode: String = "",
            @SerializedName("CCurrency")
            var cCurrency: String = "",
            @SerializedName("CurrencyCodeFrom")
            var currencyCodeFrom: String = "",
            @SerializedName("TransRsn")
            var transRsn: String = ""
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