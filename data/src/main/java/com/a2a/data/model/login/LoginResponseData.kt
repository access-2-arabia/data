package com.a2a.data.model.login


import com.a2a.data.model.CustProfile
import com.google.gson.annotations.SerializedName

data class LoginResponseData(
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
            var connectorID: String = "",
            @SerializedName("Device")
            var device: String = "",
            @SerializedName("DeviceID")
            var deviceID: String = "",
            @SerializedName("DeviceToken")
            var deviceToken: String = "",
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
            @SerializedName("AAddress1")
            var aAddress1: String = "",
            @SerializedName("ACity")
            var aCity: String = "",
            @SerializedName("ACountry")
            var aCountry: String = "",
            @SerializedName("AFName")
            var aFName: String = "",
            @SerializedName("ALName")
            var aLName: String = "",
            @SerializedName("AMName")
            var aMName: String = "",
            @SerializedName("AName")
            var aName: String = "",
            @SerializedName("APostBox")
            var aPostBox: String = "",
            @SerializedName("ActivityLog")
            var activityLog: ActivityLog = ActivityLog(),
            @SerializedName("AllAmt")
            var allAmt: Double = 0.0,
            @SerializedName("AmtTo")
            var amtTo: Double = 0.0,
            @SerializedName("BankRef")
            var bankRef: String = "",
            @SerializedName("BillGrp")
            var billGrp: String = "",
            @SerializedName("BillStatus")
            var billStatus: Int = 0,
            @SerializedName("Branch")
            var branch: String = "",
            @SerializedName("CanDate")
            var canDate: String = "",
            @SerializedName("CarOwnership")
            var carOwnership: Boolean = false,
            @SerializedName("Channel")
            var channel: String = "",
            @SerializedName("ChannelID")
            var channelID: Int = 0,
            @SerializedName("ChildrenNo")
            var childrenNo: Int = 0,
            @SerializedName("CountryCit")
            var countryCit: String = "",
            @SerializedName("CustID")
            var custID: String = "",
            @SerializedName("CustPreferences")
            var custPreferences: List<CustPreference> = listOf(),
            @SerializedName("CustProfile")
            var custProfile: CustProfile = CustProfile(),
            @SerializedName("CustRequest")
            var custRequest: List<Any> = listOf(),
            @SerializedName("DateBirth")
            var dateBirth: String = "",
            @SerializedName("DateFrom")
            var dateFrom: String = "",
            @SerializedName("DateTo")
            var dateTo: String = "",
            @SerializedName("DateTrans")
            var dateTrans: String = "",
            @SerializedName("DefaultPage")
            var defaultPage: String = "",
            @SerializedName("DefaultPageMenu")
            var defaultPageMenu: List<Any> = listOf(),
            @SerializedName("DocDesc1")
            var docDesc1: String = "",
            @SerializedName("DocNo")
            var docNo: String = "",
            @SerializedName("EAddress1")
            var eAddress1: String = "",
            @SerializedName("ECity")
            var eCity: String = "",
            @SerializedName("ECountry")
            var eCountry: String = "",
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
            @SerializedName("EPostBox")
            var ePostBox: String = "",
            @SerializedName("EndDate")
            var endDate: String = "",
            @SerializedName("Error")
            var error: String = "",
            @SerializedName("ErrorCode")
            var errorCode: Int = 0,
            @SerializedName("ErrorEDesc")
            var errorEDesc: String = "",
            @SerializedName("FaxArea")
            var faxArea: String = "",
            @SerializedName("FaxCnty")
            var faxCnty: String = "",
            @SerializedName("FaxNo")
            var faxNo: String = "",
            @SerializedName("Gender")
            var gender: String = "",
            @SerializedName("JobPosition")
            var jobPosition: String = "",
            @SerializedName("LAmt")
            var lAmt: Double = 0.0,
            @SerializedName("Lang")
            var lang: String = "",
            @SerializedName("LastUpdatedDate")
            var lastUpdatedDate: String = "",
            @SerializedName("LogID")
            var logID: Int = 0,
            @SerializedName("LoginDetails")
            var loginDetails: LoginDetails = LoginDetails(),
            @SerializedName("MainMenu")
            var mainMenu: List<Any> = listOf(),
            @SerializedName("MaritalStatus")
            var maritalStatus: String = "",
            @SerializedName("Menu")
            var menu: List<Any> = listOf(),
            @SerializedName("MobArea")
            var mobArea: String = "",
            @SerializedName("MobCnty")
            var mobCnty: String = "",
            @SerializedName("MobNo")
            var mobNo: String = "",
            @SerializedName("Nationality")
            var nationality: String = "",
            @SerializedName("NationalityID")
            var nationalityID: String = "",
            @SerializedName("NationalityName")
            var nationalityName: String = "",
            @SerializedName("NextPaymentDate")
            var nextPaymentDate: String = "",
            @SerializedName("PhoneArea")
            var phoneArea: String = "",
            @SerializedName("PhoneCnty")
            var phoneCnty: String = "",
            @SerializedName("PhoneNo")
            var phoneNo: String = "",
            @SerializedName("PortalID")
            var portalID: String = "",
            @SerializedName("PostZip")
            var postZip: String = "",
            @SerializedName("QuickMenu")
            var quickMenu: List<Any> = listOf(),
            @SerializedName("RegionCode")
            var regionCode: String = "",
            @SerializedName("RemainBal")
            var remainBal: Double = 0.0,
            @SerializedName("ReqChannelCore")
            var reqChannelCore: String = "",
            @SerializedName("ResCode")
            var resCode: Int = 0,
            @SerializedName("SMSGrp")
            var sMSGrp: String = "",
            @SerializedName("Salary")
            var salary: Double = 0.0,
            @SerializedName("SalaryAdditional")
            var salaryAdditional: Double = 0.0,
            @SerializedName("StreetAr")
            var streetAr: String = "",
            @SerializedName("StreetEn")
            var streetEn: String = "",
            @SerializedName("TermsCondition")
            var termsCondition: TermsCondition = TermsCondition(),
            @SerializedName("TotalCr")
            var totalCr: Double = 0.0,
            @SerializedName("TotalDr")
            var totalDr: Double = 0.0,
            @SerializedName("TownCountryAr")
            var townCountryAr: String = "",
            @SerializedName("TownCountryEn")
            var townCountryEn: String = ""
        ) {
            data class ActivityLog(
                @SerializedName("LastFailedTransfer")
                var lastFailedTransfer: String = "",
                @SerializedName("LastSuccessTransfer")
                var lastSuccessTransfer: String = "",
                @SerializedName("NoOfFailExternalTrx")
                var noOfFailExternalTrx: Int = 0,
                @SerializedName("NoOfFailInternalTrx")
                var noOfFailInternalTrx: Int = 0,
                @SerializedName("NoOfFailInternationalTrx")
                var noOfFailInternationalTrx: Int = 0,
                @SerializedName("NoOfSuccExternalTrx")
                var noOfSuccExternalTrx: Int = 0,
                @SerializedName("NoOfSuccInternalTrx")
                var noOfSuccInternalTrx: Int = 0,
                @SerializedName("NoOfSuccInternationalTrx")
                var noOfSuccInternationalTrx: Int = 0
            )

            data class CustPreference(
                @SerializedName("ADesc")
                var aDesc: String = "",
                @SerializedName("AValue")
                var aValue: String = "",
                @SerializedName("EDesc")
                var eDesc: String = "",
                @SerializedName("EValue")
                var eValue: String = "",
                @SerializedName("Enabled")
                var enabled: Boolean = false,
                @SerializedName("ID")
                var iD: String = ""
            )


            data class LoginDetails(
                @SerializedName("LastFailedLogin")
                var lastFailedLogin: String = "",
                @SerializedName("LastSuccessLogin")
                var lastSuccessLogin: String = "",
                @SerializedName("NoSuccLogin")
                var noSuccLogin: Int = 0,
                @SerializedName("PasswordExpiryDate")
                var passwordExpiryDate: String = "",
                @SerializedName("PasswordExpiryDays")
                var passwordExpiryDays: Int = 0
            )

            data class TermsCondition(
                @SerializedName("ADesc")
                var aDesc: String = "",
                @SerializedName("AText")
                var aText: String = "",
                @SerializedName("AValue")
                var aValue: String = "",
                @SerializedName("Channel")
                var channel: String = "",
                @SerializedName("EDesc")
                var eDesc: String = "",
                @SerializedName("EText")
                var eText: String = "",
                @SerializedName("EValue")
                var eValue: String = ""
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
            var sessionID: String = "",
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