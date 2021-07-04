package com.a2a.data.model.accountlist

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
            data class CustProfile(
                @SerializedName("AName")
                var aName: String = "",
                @SerializedName("ANameShort")
                var aNameShort: String = "",
                @SerializedName("Address1")
                var address1: String = "",
                @SerializedName("Address2")
                var address2: String = "",
                @SerializedName("AddressCity")
                var addressCity: String = "",
                @SerializedName("AddressCountry")
                var addressCountry: String = "",
                @SerializedName("BirthDate")
                var birthDate: String = "",
                @SerializedName("Branch")
                var branch: String = "",
                @SerializedName("BuildingNo")
                var buildingNo: String = "",
                @SerializedName("CID")
                var cID: Int = 0,
                @SerializedName("CustID")
                var custID: String = "",
                @SerializedName("CustImage")
                var custImage: String = "",
                @SerializedName("CustMnemonic")
                var custMnemonic: String = "",
                @SerializedName("CustType")
                var custType: Int = 0,
                @SerializedName("detPrivateNationality")
                var detPrivateNationality: String = "",
                @SerializedName("DocNo")
                var docNo: String = "",
                @SerializedName("DocNo1")
                var docNo1: String = "",
                @SerializedName("DocValidDate")
                var docValidDate: String = "",
                @SerializedName("EMail")
                var eMail: String = "",
                @SerializedName("EName")
                var eName: String = "",
                @SerializedName("ENameShort")
                var eNameShort: String = "",
                @SerializedName("Gender")
                var gender: String = "",
                @SerializedName("ISOCode")
                var iSOCode: String = "",
                @SerializedName("ISOCode2")
                var iSOCode2: String = "",
                @SerializedName("LWPT")
                var lWPT: Boolean = false,
                @SerializedName("LWTD")
                var lWTD: Boolean = false,
                @SerializedName("Lang")
                var lang: String = "",
                @SerializedName("MobileNumber")
                var mobileNumber: String = "",
                @SerializedName("MobileNumberMasked")
                var mobileNumberMasked: String = "",
                @SerializedName("Nationality")
                var nationality: String = "",
                @SerializedName("NationalityID")
                var nationalityID: String = "",
                @SerializedName("placeOfBirth")
                var placeOfBirth: String = "",
                @SerializedName("RID")
                var rID: Int = 0,
                @SerializedName("RepID")
                var repID: Int = 0,
                @SerializedName("TermsAndCondition")
                var termsAndCondition: Int = 0


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