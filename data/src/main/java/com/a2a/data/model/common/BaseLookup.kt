package com.a2a.data.model.common


import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize
import java.util.*
import kotlin.collections.ArrayList

data class BaseLookup(
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
            @SerializedName("ATMs")
            var aTMs: List<ATM> = listOf(),
            @SerializedName("AliasType")
            var aliasType: List<BaseLookUpsModel> = listOf(),
            @SerializedName("Banks")
            var banks: List<BaseLookUpsModel> = listOf(),
            @SerializedName("Branch")
            var branch: List<Branch> = listOf(),
            @SerializedName("ChequeBookNo")
            var chequeBookNo: List<BaseLookUpsModel> = listOf(),
            @SerializedName("ChequeBookPages")
            var chequeBookPages: List<BaseLookUpsModel> = listOf(),
            @SerializedName("ChequeBookStopReason")
            var chequeBookStopReason: List<BaseLookUpsModel> = listOf(),
            @SerializedName("ContactUs")
            var contactUs: ContactUs = ContactUs(),
            @SerializedName("Country")
            var country: List<BaseLookUpsModel> = listOf(),
            @SerializedName("Currency")
            var currency: List<Currency> = listOf(),
            @SerializedName("CurrencyIntrest")
            var currencyIntrest: ArrayList<CurrencyIntrest> = ArrayList(),
            @SerializedName("DebitCardStopReason")
            var debitCardStopReason: List<BaseLookUpsModel> = listOf(),
            @SerializedName("DocumentType")
            var documentType: List<BaseLookUpsModel> = listOf(),
            @SerializedName("eMailCategory")
            var eMailCategory: List<BaseLookUpsModel> = listOf(),
            @SerializedName("Help")
            var help: List<Any> = listOf(),
            @SerializedName("IntRatePeriod")
            var intRatePeriod: List<BaseLookUpsModel> = listOf(),
            @SerializedName("MailServices")
            var mailServices: List<MailService> = listOf(),
            @SerializedName("MaritalStatus")
            var maritalStatus: List<BaseLookUpsModel> = listOf(),
            @SerializedName("passwordComplexity")
            var passwordComplexity: PasswordComplexity = PasswordComplexity(),
            @SerializedName("RecurringType")
            var recurringType: List<BaseLookUpsModel> = listOf(),
            @SerializedName("RtpRejectReason")
            var rtpRejectReason: List<BaseLookUpsModel> = listOf(),
            @SerializedName("SecInstraction")
            var secInstraction: SecInstraction = SecInstraction(),
            @SerializedName("TermsCondition")
            var termsCondition: TermsCondition = TermsCondition(),
            @SerializedName("ThemeColor")
            var themeColor: List<BaseLookUpsModel> = listOf(),
            @SerializedName("TransfarePurpose")
            var transfarePurpose: List<BaseLookUpsModel> = listOf(),
            @SerializedName("TransferPurpose")
            var transferPurpose: List<BaseLookUpsModel> = listOf(),
            @SerializedName("TrxDir")
            var trxDir: List<BaseLookUpsModel> = listOf(),
            @SerializedName("TrxStatus")
            var trxStatus: List<BaseLookUpsModel> = listOf(),
            @SerializedName("SecurityTips")
            var securityTips: List<BaseLookUpsModel> = listOf(),
            @SerializedName("CardType")
            var cardType: List<BaseLookUpsModel> = listOf(),
            @SerializedName("Period")
            var period: List<BaseLookUpsModel> = listOf(),
            @SerializedName("ContactTime")
            var contactTime: List<BaseLookUpsModel> = listOf(),
            @SerializedName("LoanType")
            var loanType: List<LoanType> = listOf(),
            @SerializedName("CustRequest")
            var custRequest: List<CustRequest> = listOf(),
            @SerializedName("PendingCustRequest")
            var pendingCustRequest: List<CustRequest> = listOf(),
            @SerializedName("BankProducts")
            var bankProducts: List<BankProduct> = listOf()

        ) {
            data class BankProduct(
                @SerializedName("ADesc")
                var aDesc: String = "",
                @SerializedName("AName")
                var aName: String = "",
                @SerializedName("Category")
                var category: Int = 0,
                @SerializedName("Date")
                var date: String = "",
                @SerializedName("EDesc")
                var eDesc: String = "",
                @SerializedName("EName")
                var eName: String = "",
                @SerializedName("Enabled")
                var enabled: Boolean = false,
                @SerializedName("ID")
                var iD: Int = 0,
                @SerializedName("Img")
                var img: String = "",
                @SerializedName("InterestedOption")
                var interestedOption: Boolean = false,
                @SerializedName("LoanSimulation")
                var loanSimulation: Boolean = false,
                @SerializedName("ProductID")
                var productID: String = "",
                @SerializedName("RegionCode")
                var regionCode: String = "",
                @SerializedName("Segmentation")
                var segmentation: String = "",
            ) {
                fun getName(): String {
                    return if (Locale.getDefault().language == "en") eDesc else aDesc
                }
            }

            data class CustRequest(
                @SerializedName("ADesc")
                var aDesc: String = "",
                @SerializedName("EDesc")
                var eDesc: String = "",
                @SerializedName("ID")
                var iD: Int = 0,
                @SerializedName("ProcessFlag")
                var processFlag: Boolean = false,
                @SerializedName("Request")
                var request: String = "",
                @SerializedName("RequestDate")
                var requestDate: String = "",
                @SerializedName("SrvCode")
                var srvCode: String = "",
                @SerializedName("SrvID")
                var srvID: Int = 0
            )

            data class LoanType(
                @SerializedName("ADesc")
                var aDesc: String = "",
                @SerializedName("AValue")
                var aValue: String = "",
                @SerializedName("EDesc")
                var eDesc: String = "",
                @SerializedName("EValue")
                var eValue: String = "",
                @SerializedName("ID")
                var iD: String = "",
                @SerializedName("InterestRate")
                var interestRate: Double = 0.0,
                @SerializedName("MaxAmt")
                var maxAmt: Double = 0.0,
                @SerializedName("MaxTenor")
                var maxTenor: Int = 0,
                @SerializedName("MinAmt")
                var minAmt: Double = 0.0,
                @SerializedName("MinTenor")
                var minTenor: Int = 0
            )

            data class ATM(
                @SerializedName("AName")
                var aName: String = "",
                @SerializedName("AValue")
                var aValue: String = "",
                @SerializedName("EName")
                var eName: String = "",
                @SerializedName("EValue")
                var eValue: String = "",
                @SerializedName("ID")
                var iD: Int = 0,
                @SerializedName("Latitude")
                var latitude: String = "",
                @SerializedName("Longitude")
                var longitude: String = ""
            )


            data class Branch(
                @SerializedName("ADesc")
                var aDesc: String = "",
                @SerializedName("ALocation")
                var aLocation: String = "",
                @SerializedName("ATitle")
                var aTitle: String = "",
                @SerializedName("BranchCode")
                var branchCode: String = "",
                @SerializedName("Distance")
                var distance: String = "",
                @SerializedName("EDesc")
                var eDesc: String = "",
                @SerializedName("ELocation")
                var eLocation: String = "",
                @SerializedName("ETitle")
                var eTitle: String = "",
                @SerializedName("ID")
                var iD: Int = 0,
                @SerializedName("Latitude")
                var latitude: String = "",
                @SerializedName("Longitude")
                var longitude: String = "",
                @SerializedName("PhoneNo")
                var phoneNo: String = ""
            )

            @Parcelize
            data class BaseLookUpsModel(
                @SerializedName("ADesc")
                var aDesc: String = "",
                @SerializedName("AValue")
                var aValue: String = "",
                @SerializedName("EDesc")
                var eDesc: String = "",
                @SerializedName("EValue")
                var eValue: String = "",
                @SerializedName("ID")
                var iD: Int = 0
            ) : Parcelable {
                override fun toString(): String {
                    return if (Locale.getDefault().language == "en") eDesc else aDesc
                }
            }

            data class ContactUs(
                @SerializedName("BranchEmail")
                var branchEmail: String = "",
                @SerializedName("CallCenter")
                var callCenter: String = "",
                @SerializedName("LocationA")
                var locationA: String = "",
                @SerializedName("LocationE")
                var locationE: String = "",
                @SerializedName("Location_X")
                var locationX: String = "",
                @SerializedName("Location_Y")
                var locationY: String = "",
                @SerializedName("PhoneBank")
                var phoneBank: String = "",
                @SerializedName("URL")
                var uRL: String = ""
            )


            data class Currency(
                @SerializedName("ADesc")
                var aDesc: String = "",
                @SerializedName("CED")
                var cED: Int = 0,
                @SerializedName("Code")
                var code: String = "",
                @SerializedName("CurrImage")
                var currImage: String = "",
                @SerializedName("EDesc")
                var eDesc: String = "",
                @SerializedName("ID")
                var iD: Int = 0,
                @SerializedName("ISOCode")
                var iSOCode: String = ""
            ) {
                override fun toString(): String {
                    return iSOCode
                }
            }

            data class CurrencyIntrest(
                @SerializedName("ADesc")
                var aDesc: String = "",
                @SerializedName("CED")
                var cED: Int = 0,
                @SerializedName("Code")
                var code: String = "",
                @SerializedName("CurrImage")
                var currImage: String = "",
                @SerializedName("EDesc")
                var eDesc: String = "",
                @SerializedName("ID")
                var iD: Int = 0,
                @SerializedName("ISOCode")
                var iSOCode: String = ""
            ) {
                override fun toString(): String {
                    return if (Locale.getDefault().language == "en") eDesc else aDesc
                }
            }


            data class MailService(
                @SerializedName("ADesc")
                var aDesc: String = "",
                @SerializedName("AValue")
                var aValue: String = "",
                @SerializedName("Channel")
                var channel: String = "",
                @SerializedName("EDesc")
                var eDesc: String = "",
                @SerializedName("EValue")
                var eValue: String = "",
                @SerializedName("ID")
                var iD: Int = 0,
                @SerializedName("RegionCode")
                var regionCode: String = ""
            )


            data class PasswordComplexity(
                @SerializedName("DigitsPWD")
                var digitsPWD: DigitsPWD = DigitsPWD(),
                @SerializedName("LowerCasePWD")
                var lowerCasePWD: LowerCasePWD = LowerCasePWD(),
                @SerializedName("PWDMaxLength")
                var pWDMaxLength: PWDMaxLength = PWDMaxLength(),
                @SerializedName("PWDMinLength")
                var pWDMinLength: PWDMinLength = PWDMinLength(),
                @SerializedName("SpecialCharPWD")
                var specialCharPWD: SpecialCharPWD = SpecialCharPWD(),
                @SerializedName("UpperCasePWD")
                var upperCasePWD: UpperCasePWD = UpperCasePWD()
            ) {
                data class DigitsPWD(
                    @SerializedName("Enabled")
                    var enabled: String = "",
                    @SerializedName("Evalue")
                    var evalue: String = ""
                )

                data class LowerCasePWD(
                    @SerializedName("Enabled")
                    var enabled: String = "",
                    @SerializedName("Evalue")
                    var evalue: String = ""
                )

                data class PWDMaxLength(
                    @SerializedName("Enabled")
                    var enabled: String = "",
                    @SerializedName("Evalue")
                    var evalue: Int = 0
                )

                data class PWDMinLength(
                    @SerializedName("Enabled")
                    var enabled: String = "",
                    @SerializedName("Evalue")
                    var evalue: Int = 0
                )

                data class SpecialCharPWD(
                    @SerializedName("Enabled")
                    var enabled: String = "",
                    @SerializedName("Evalue")
                    var evalue: String = ""
                )

                data class UpperCasePWD(
                    @SerializedName("Enabled")
                    var enabled: String = "",
                    @SerializedName("Evalue")
                    var evalue: String = ""
                )
            }


            data class SecInstraction(
                @SerializedName("AValue")
                var aValue: String = "",
                @SerializedName("EValue")
                var eValue: String = ""
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
