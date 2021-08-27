package com.a2a.data.model.cliq.sendMoney


import com.google.gson.annotations.SerializedName

data class RequestMoneyResponse(
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
        data class Body(
            @SerializedName("AccountNumberFrom")
            var accountNumberFrom: String = "",
            @SerializedName("AccountNumberTo")
            var accountNumberTo: String = "",
            @SerializedName("Amount")
            var amount: String = "",
            @SerializedName("Amt")
            var amt: String = "",
            @SerializedName("Authenticate")
            var authenticate: Authenticate = Authenticate(),
            @SerializedName("CdtrAcct")
            var cdtrAcct: String = "",
            @SerializedName("CdtrAlias")
            var cdtrAlias: String = "",
            @SerializedName("CdtrBic")
            var cdtrBic: String = "",
            @SerializedName("CdtrIsIndvl")
            var cdtrIsIndvl: String = "",
            @SerializedName("CdtrMCC")
            var cdtrMCC: String = "",
            @SerializedName("CdtrName")
            var cdtrName: String = "",
            @SerializedName("CdtrPstlAdr")
            var cdtrPstlAdr: String = "",
            @SerializedName("CdtrRecordID")
            var cdtrRecordID: String = "",
            @SerializedName("CdtrValue")
            var cdtrValue: String = "",
            @SerializedName("CtgyPurp")
            var ctgyPurp: String = "",
            @SerializedName("Curr")
            var curr: String = "",
            @SerializedName("CurrCodeTo")
            var currCodeTo: String = "",
            @SerializedName("CurrFrom")
            var currFrom: String = "",
            @SerializedName("CustID")
            var custID: String = "",
            @SerializedName("CustIDTO")
            var custIDTO: String = "",
            @SerializedName("CustProfile")
            var custProfile: CustProfile = CustProfile(),
            @SerializedName("DbtValue")
            var dbtValue: String = "",
            @SerializedName("DbtrAcct")
            var dbtrAcct: String = "",
            @SerializedName("DbtrAlias")
            var dbtrAlias: String = "",
            @SerializedName("DbtrBic")
            var dbtrBic: String = "",
            @SerializedName("DbtrIsIndvl")
            var dbtrIsIndvl: String = "",
            @SerializedName("DbtrMCC")
            var dbtrMCC: String = "",
            @SerializedName("DbtrName")
            var dbtrName: String = "",
            @SerializedName("DbtrPstlAdr")
            var dbtrPstlAdr: String = "",
            @SerializedName("DbtrRecordID")
            var dbtrRecordID: String = "",
            @SerializedName("Fees")
            var fees: Int = 0,
            @SerializedName("OTP")
            var oTP: OTP = OTP(),
            @SerializedName("SenderName")
            var senderName: String = "",
            @SerializedName("SenderPstlAdr")
            var senderPstlAdr: String = "",
            @SerializedName("ServiceConfiguration")
            var serviceConfiguration: ServiceConfiguration = ServiceConfiguration(),
            @SerializedName("StepNumber")
            var stepNumber: Int = 0
        ) {
            data class Authenticate(
                @SerializedName("UTR")
                var uTR: String = ""
            )

            data class CustProfile(
                @SerializedName("AFName")
                var aFName: String = "",
                @SerializedName("ALName")
                var aLName: String = "",
                @SerializedName("AMName")
                var aMName: String = "",
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
                @SerializedName("CustStatus")
                var custStatus: String = "",
                @SerializedName("CustType")
                var custType: Int = 0,
                @SerializedName("detPrivateNationality")
                var detPrivateNationality: String = "",
                @SerializedName("DocDesc")
                var docDesc: String = "",
                @SerializedName("DocNo")
                var docNo: String = "",
                @SerializedName("DocNo1")
                var docNo1: String = "",
                @SerializedName("DocValidDate")
                var docValidDate: String = "",
                @SerializedName("EFName")
                var eFName: String = "",
                @SerializedName("ELName")
                var eLName: String = "",
                @SerializedName("EMName")
                var eMName: String = "",
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
                @SerializedName("MaritalStatus")
                var maritalStatus: String = "",
                @SerializedName("MobileNumber")
                var mobileNumber: String = "",
                @SerializedName("MobileNumberMasked")
                var mobileNumberMasked: String = "",
                @SerializedName("Nationality")
                var nationality: String = "",
                @SerializedName("NationalityID")
                var nationalityID: String = "",
                @SerializedName("Occupation")
                var occupation: String = "",
                @SerializedName("placeOfBirth")
                var placeOfBirth: String = "",
                @SerializedName("PostZip")
                var postZip: String = "",
                @SerializedName("RID")
                var rID: Int = 0,
                @SerializedName("RepID")
                var repID: String = "",
                @SerializedName("StreetAddress")
                var streetAddress: String = "",
                @SerializedName("TermsAndCondition")
                var termsAndCondition: Int = 0
            )

            data class OTP(
                @SerializedName("OTPLength")
                var oTPLength: Int = 0,
                @SerializedName("OTPTimer")
                var oTPTimer: Int = 0
            )

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
            @SerializedName("BankCode")
            var bankCode: String = "",
            @SerializedName("Channel")
            var channel: String = "",
            @SerializedName("ConnectorID")
            var connectorID: String = "",
            @SerializedName("Device")
            var device: String = "",
            @SerializedName("DeviceID")
            var deviceID: String = "",
            @SerializedName("DeviceToken")
            var deviceToken: String = "",
            @SerializedName("GuidID")
            var guidID: String = "",
            @SerializedName("IPAddress")
            var iPAddress: String = "",
            @SerializedName("MethodName")
            var methodName: String = "",
            @SerializedName("Password")
            var password: String = "",
            @SerializedName("RegionCode")
            var regionCode: String = "",
            @SerializedName("ServiceID")
            var serviceID: Int = 0,
            @SerializedName("SessionID")
            var sessionID: String = "",
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
            @SerializedName("ServiceConfiguration")
            var serviceConfiguration: ServiceConfiguration = ServiceConfiguration()
        ) {
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