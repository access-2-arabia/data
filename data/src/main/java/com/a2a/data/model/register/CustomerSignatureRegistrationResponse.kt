package com.a2a.data.model.register

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize


@Parcelize
data class CustomerSignatureRegistrationResponse(
    @SerializedName("A2ARequest")
    var a2ARequest: A2ARequest = A2ARequest(),
    @SerializedName("A2AResponse")
    var a2AResponse: A2AResponse = A2AResponse(),
    @SerializedName("ErrorMsg")
    var errorMsg: ErrorMsg = ErrorMsg()
) : Parcelable {
    @Parcelize
    data class A2ARequest(
        @SerializedName("Body")
        var body: Body = Body(),
        @SerializedName("Footer")
        var footer: Footer = Footer(),
        @SerializedName("Header")
        var header: Header = Header()
    ) : Parcelable {
        @Parcelize
        class Body : Parcelable

        @Parcelize
        data class Footer(
            @SerializedName("Signature")
            var signature: String = ""
        ) : Parcelable

        @Parcelize
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
        ) : Parcelable
    }

    @Parcelize
    data class A2AResponse(
        @SerializedName("Body")
        var body: Body = Body(),
        @SerializedName("Footer")
        var footer: Footer = Footer(),
        @SerializedName("Header")
        var header: Header = Header()
    ) : Parcelable {
        @Parcelize
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
            @SerializedName("ATName")
            var aTName: String = "",
            @SerializedName("AccountNumber")
            var accountNumber: String = "",
            @SerializedName("Accounts")
            var accounts: List<Account> = listOf(),
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
            @SerializedName("CustProfile")
            var custProfile: CustProfile = CustProfile(),
            @SerializedName("DateBirth")
            var dateBirth: String = "",
            @SerializedName("DateFrom")
            var dateFrom: String = "",
            @SerializedName("DateTo")
            var dateTo: String = "",
            @SerializedName("DateTrans")
            var dateTrans: String = "",
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
            @SerializedName("ETName")
            var eTName: String = "",
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
            @SerializedName("MaritalStatus")
            var maritalStatus: String = "",
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
            @SerializedName("Target")
            var target: String = "",
            @SerializedName("TotalCr")
            var totalCr: Double = 0.0,
            @SerializedName("TotalDr")
            var totalDr: Double = 0.0,
            @SerializedName("TownCountryAr")
            var townCountryAr: String = "",
            @SerializedName("TownCountryEn")
            var townCountryEn: String = ""
        ) : Parcelable {
            @Parcelize
            data class Account(
                @SerializedName("ADesc")
                var aDesc: String = "",
                @SerializedName("AccCredit")
                var accCredit: Double = 0.0,
                @SerializedName("AccCurr")
                var accCurr: AccCurr = AccCurr(),
                @SerializedName("AccDebit")
                var accDebit: Double = 0.0,
                @SerializedName("AccLimit")
                var accLimit: Double = 0.0,
                @SerializedName("AccountNumber")
                var accountNumber: String = "",
                @SerializedName("AccountType")
                var accountType: String = "",
                @SerializedName("AllAmt")
                var allAmt: Double = 0.0,
                @SerializedName("AmountFloat")
                var amountFloat: Double = 0.0,
                @SerializedName("AmtCredit")
                var amtCredit: Double = 0.0,
                @SerializedName("AmtDebit")
                var amtDebit: Double = 0.0,
                @SerializedName("AmtFloat")
                var amtFloat: Double = 0.0,
                @SerializedName("AmtHold")
                var amtHold: Double = 0.0,
                @SerializedName("AmtTo")
                var amtTo: Double = 0.0,
                @SerializedName("AvailableBalance")
                var availableBalance: Double = 0.0,
                @SerializedName("AvailableBalanceFC")
                var availableBalanceFC: Double = 0.0,
                @SerializedName("AvlBal")
                var avlBal: Double = 0.0,
                @SerializedName("BillStatus")
                var billStatus: Int = 0,
                @SerializedName("Branch")
                var branch: String = "",
                @SerializedName("BranchCode")
                var branchCode: String = "",
                @SerializedName("BranchDetails")
                var branchDetails: BranchDetails = BranchDetails(),
                @SerializedName("CanDate")
                var canDate: String = "",
                @SerializedName("Channel")
                var channel: String = "",
                @SerializedName("ChannelID")
                var channelID: Int = 0,
                @SerializedName("ClearBal")
                var clearBal: Double = 0.0,
                @SerializedName("ClearBalance")
                var clearBalance: Double = 0.0,
                @SerializedName("Cur")
                var cur: Int = 0,
                @SerializedName("CurBal")
                var curBal: Double = 0.0,
                @SerializedName("CurrBal")
                var currBal: Double = 0.0,
                @SerializedName("CurrencyCode")
                var currencyCode: String = "",
                @SerializedName("CurrentBalance")
                var currentBalance: Double = 0.0,
                @SerializedName("CurrentBalanceFC")
                var currentBalanceFC: Double = 0.0,
                @SerializedName("DateFrom")
                var dateFrom: String = "",
                @SerializedName("DateMaturity")
                var dateMaturity: String = "",
                @SerializedName("DateOpen")
                var dateOpen: String = "",
                @SerializedName("DateTo")
                var dateTo: String = "",
                @SerializedName("DateTrans")
                var dateTrans: String = "",
                @SerializedName("EDesc")
                var eDesc: String = "",
                @SerializedName("EndDate")
                var endDate: String = "",
                @SerializedName("EqlBal")
                var eqlBal: Double = 0.0,
                @SerializedName("EquivBal")
                var equivBal: Double = 0.0,
                @SerializedName("EquivBalance")
                var equivBalance: Double = 0.0,
                @SerializedName("EqvBal")
                var eqvBal: Double = 0.0,
                @SerializedName("ErrorCode")
                var errorCode: Int = 0,
                @SerializedName("HasPassword")
                var hasPassword: Boolean = false,
                @SerializedName("IBAN")
                var iBAN: String = "",
                @SerializedName("ID")
                var iD: Int = 0,
                @SerializedName("InterestRate")
                var interestRate: Double = 0.0,
                @SerializedName("IsBlocking")
                var isBlocking: Boolean = false,
                @SerializedName("IsDormant")
                var isDormant: Boolean = false,
                @SerializedName("IsNavigate")
                var isNavigate: Boolean = false,
                @SerializedName("LedBal")
                var ledBal: Double = 0.0,
                @SerializedName("Limit")
                var limit: Double = 0.0,
                @SerializedName("LimitAmt")
                var limitAmt: Double = 0.0,
                @SerializedName("LogID")
                var logID: Int = 0,
                @SerializedName("MaturityDate")
                var maturityDate: String = "",
                @SerializedName("MaturityDays")
                var maturityDays: Int = 0,
                @SerializedName("NextPaymentDate")
                var nextPaymentDate: String = "",
                @SerializedName("NonClearBal")
                var nonClearBal: Double = 0.0,
                @SerializedName("NonClearBalance")
                var nonClearBalance: Double = 0.0,
                @SerializedName("OpeningDate")
                var openingDate: String = "",
                @SerializedName("PortalID")
                var portalID: String = "",
                @SerializedName("RegionCode")
                var regionCode: String = "",
                @SerializedName("ResCode")
                var resCode: Int = 0,
                @SerializedName("ReservedBal")
                var reservedBal: Double = 0.0,
                @SerializedName("ReservedBalance")
                var reservedBalance: Double = 0.0,
                @SerializedName("StartDate")
                var startDate: String = "",
                @SerializedName("Status")
                var status: String = "",
                @SerializedName("TotalCr")
                var totalCr: Double = 0.0,
                @SerializedName("TotalDr")
                var totalDr: Double = 0.0,
                @SerializedName("TransCount")
                var transCount: Int = 0,
                @SerializedName("WrkBal")
                var wrkBal: Double = 0.0
            ) : Parcelable {
                @Parcelize
                data class AccCurr(
                    @SerializedName("ADesc")
                    var aDesc: String = "",
                    @SerializedName("AShortDesc")
                    var aShortDesc: String = "",
                    @SerializedName("CED")
                    var cED: Int = 0,
                    @SerializedName("CurrencyCode")
                    var currencyCode: String = "",
                    @SerializedName("EDesc")
                    var eDesc: String = "",
                    @SerializedName("EShortDesc")
                    var eShortDesc: String = "",
                    @SerializedName("ISOCode")
                    var iSOCode: String = ""
                ) : Parcelable

                @Parcelize
                data class BranchDetails(
                    @SerializedName("BranchADesc")
                    var branchADesc: String = "",
                    @SerializedName("BranchEDesc")
                    var branchEDesc: String = ""
                ) : Parcelable
            }

            @Parcelize
            data class CustProfile(
                @SerializedName("AFName")
                var aFName: String = "",
                @SerializedName("ALName")
                var aLName: String = "",
                @SerializedName("AMName")
                var aMName: String = "",
                @SerializedName("AName")
                var aName: String = "",
                @SerializedName("ATName")
                var aTName: String = "",
                @SerializedName("Address1")
                var address1: String = "",
                @SerializedName("Address2")
                var address2: String = "",
                @SerializedName("BirthDate")
                var birthDate: String = "",
                @SerializedName("Branch")
                var branch: String = "",
                @SerializedName("CID")
                var cID: Int = 0,
                @SerializedName("CountryCode")
                var countryCode: String = "",
                @SerializedName("CustAttr")
                var custAttr: String = "",
                @SerializedName("CustID")
                var custID: String = "",
                @SerializedName("CustMnemonic")
                var custMnemonic: String = "",
                @SerializedName("CustType")
                var custType: Int = 0,
                @SerializedName("DateBirth")
                var dateBirth: String = "",
                @SerializedName("DocNo")
                var docNo: String = "",
                @SerializedName("DocNo1")
                var docNo1: String = "",
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
                @SerializedName("ETName")
                var eTName: String = "",
                @SerializedName("ErrorCode")
                var errorCode: Int = 0,
                @SerializedName("FillterDateFrom")
                var fillterDateFrom: String = "",
                @SerializedName("FillterDateTo")
                var fillterDateTo: String = "",
                @SerializedName("IntFlag")
                var intFlag: Boolean = false,
                @SerializedName("LWPT")
                var lWPT: Boolean = false,
                @SerializedName("LWTD")
                var lWTD: Boolean = false,
                @SerializedName("Lang")
                var lang: String = "",
                @SerializedName("LstFailLogin")
                var lstFailLogin: String = "",
                @SerializedName("LstSuccLogin")
                var lstSuccLogin: String = "",
                @SerializedName("LstTrxDate")
                var lstTrxDate: String = "",
                @SerializedName("MobArea")
                var mobArea: String = "",
                @SerializedName("MobCnty")
                var mobCnty: String = "",
                @SerializedName("MobFlag")
                var mobFlag: Boolean = false,
                @SerializedName("MobNo")
                var mobNo: String = "",
                @SerializedName("MobileNumber")
                var mobileNumber: String = "",
                @SerializedName("Nationality")
                var nationality: String = "",
                @SerializedName("NationalityID")
                var nationalityID: String = "",
                @SerializedName("OTP")
                var oTP: String = "",
                @SerializedName("PasswordDate")
                var passwordDate: String = "",
                @SerializedName("PostBox")
                var postBox: String = "",
                @SerializedName("RID")
                var rID: Int = 0,
                @SerializedName("RepID")
                var repID: String = "",
                @SerializedName("RepID_str")
                var repIDStr: String = "",
                @SerializedName("SSFlag")
                var sSFlag: Boolean = false,
                @SerializedName("SrvID")
                var srvID: Int = 0,
                @SerializedName("StreetEn")
                var streetEn: String = "",
                @SerializedName("Target")
                var target: String = "",
                @SerializedName("TownCountryEn")
                var townCountryEn: String = "",
                @SerializedName("UTR")
                var uTR: String = ""
            ) : Parcelable
        }

        @Parcelize
        data class Footer(
            @SerializedName("Signature")
            var signature: String = ""
        ) : Parcelable

        @Parcelize
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
        ) : Parcelable {
            @Parcelize
            data class Result(
                @SerializedName("ADesc")
                var aDesc: String = "",
                @SerializedName("EDesc")
                var eDesc: String = "",
                @SerializedName("ErrorCode")
                var errorCode: Int = 0
            ) : Parcelable
        }
    }

    @Parcelize
    data class ErrorMsg(
        @SerializedName("ADesc")
        var aDesc: String = "",
        @SerializedName("EDesc")
        var eDesc: String = "",
        @SerializedName("ErrorCode")
        var errorCode: Int = 0
    ) : Parcelable
}