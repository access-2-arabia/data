package com.a2a.data.model.accountlist

import com.a2a.data.model.login.LoginPostData
import com.a2a.data.model.login.LoginPostData.A2ARequest.Body.CustProfile
import com.google.gson.annotations.SerializedName


data class AccountListPostData(
    @SerializedName("a2ARequest")
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
            @SerializedName("BankRef")
            var bankRef: String = "",
            @SerializedName("BranchCode")
            var branchCode: String = "",
            @SerializedName("CustProfile")
            var custProfile: CustProfile = CustProfile()
        ) {

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
            var userID: String = "",
            @SerializedName("DeviceToken")
            var deviceToken: String = "",
            @SerializedName("Device")
            var device: String = "",


            )
    }
}