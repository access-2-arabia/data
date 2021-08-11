package com.a2a.data.model.authentication

import android.os.Parcelable
import com.a2a.data.model.common.ErrorMsg
import com.a2a.data.model.common.Footer
import com.a2a.data.model.common.HeaderResponse
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class LoginResponse(
    @SerializedName("A2AResponse")
    var a2AResponse: A2AResponse = A2AResponse(),
    @SerializedName("ErrorMsg")
    var errorMsg: ErrorMsg = ErrorMsg()
) : Parcelable {
    @Parcelize
    data class A2AResponse(
        @SerializedName("Body")
        var body: Body = Body(),
        @SerializedName("Footer")
        var footer: Footer = Footer(),
        @SerializedName("Header")
        var header: HeaderResponse = HeaderResponse()
    ) : Parcelable {
        @Parcelize
        data class Body(
            @SerializedName("ActivityLog")
            var activityLog: ActivityLog = ActivityLog(),
            @SerializedName("CustPreferences")
            var custPreferences: List<CustPreference> = listOf(),
            @SerializedName("CustProfile")
            var custProfile: CustProfile = CustProfile(),
            @SerializedName("DefaultPageMenu")
            var defaultPageMenu: List<DefaultPageMenu> = listOf(),
            @SerializedName("LoginDetails")
            var loginDetails: LoginDetails = LoginDetails(),
            @SerializedName("MainMenu")
            var mainMenu: List<MainMenu> = listOf(),
            @SerializedName("Menu")
            var menu: List<Menu> = listOf(),
            @SerializedName("ServiceConfiguration")
            var serviceConfiguration: ServiceConfiguration = ServiceConfiguration(),
            @SerializedName("TermsCondition")
            var termsCondition: TermsCondition = TermsCondition()
        ) : Parcelable {
            @Parcelize
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
            ) : Parcelable

            @Parcelize
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
            ) : Parcelable

            @Parcelize
            data class DefaultPageMenu(
                @SerializedName("ATitle")
                var aTitle: String = "",
                @SerializedName("ETitle")
                var eTitle: String = "",
                @SerializedName("ID")
                var iD: Int = 0,
                @SerializedName("MenuFlag")
                var menuFlag: Boolean = false
            ) : Parcelable

            @Parcelize
            data class LoginDetails(
                @SerializedName("LastFailedLogin")
                var lastFailedLogin: String = "",
                @SerializedName("LastFailedTransfer")
                var lastFailedTransfer: String = "",
                @SerializedName("LastSuccessLogin")
                var lastSuccessLogin: String = "",
                @SerializedName("LastSuccessTransfer")
                var lastSuccessTransfer: String = "",
                @SerializedName("PasswordExpiryDate")
                var passwordExpiryDate: String = "",
                @SerializedName("PasswordExpiryDays")
                var passwordExpiryDays: Int = 0
            ) : Parcelable

            @Parcelize
            data class MainMenu(
                @SerializedName("AGroupDesc")
                var aGroupDesc: String = "",
                @SerializedName("ATitle")
                var aTitle: String = "",
                @SerializedName("EGroupDesc")
                var eGroupDesc: String = "",
                @SerializedName("ETitle")
                var eTitle: String = "",
                @SerializedName("GroupADesc")
                var groupADesc: String = "",
                @SerializedName("GroupEDesc")
                var groupEDesc: String = "",
                @SerializedName("GroupID")
                var groupID: Int = 0,
                @SerializedName("ID")
                var iD: Int = 0,
                @SerializedName("Icon")
                var icon: String = "",
                @SerializedName("MenuFlag")
                var menuFlag: Boolean = false,
                @SerializedName("SubMenu")
                var subMenu: List<SubMenu> = listOf()
            ) : Parcelable {
                @Parcelize
                data class SubMenu(
                    @SerializedName("AGroupDesc")
                    var aGroupDesc: String = "",
                    @SerializedName("ATitle")
                    var aTitle: String = "",
                    @SerializedName("EGroupDesc")
                    var eGroupDesc: String = "",
                    @SerializedName("ETitle")
                    var eTitle: String = "",
                    @SerializedName("Enabled")
                    var enabled: Boolean = false,
                    @SerializedName("GroupADesc")
                    var groupADesc: String = "",
                    @SerializedName("GroupEDesc")
                    var groupEDesc: String = "",
                    @SerializedName("GroupID")
                    var groupID: Int = 0,
                    @SerializedName("ID")
                    var iD: Int = 0,
                    @SerializedName("Icon")
                    var icon: String = "",
                    @SerializedName("MenuFlag")
                    var menuFlag: Boolean = false,
                    @SerializedName("SortIndex")
                    var sortIndex: Int = 0,
                    @SerializedName("URL")
                    var uRL: String = ""
                ) : Parcelable
            }

            @Parcelize
            data class Menu(
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
            ) : Parcelable

            @Parcelize
            data class ServiceConfiguration(
                @SerializedName("AccountType")
                var accountType: String = "",
                @SerializedName("Advertisement")
                var advertisement: String = "",
                @SerializedName("BankName")
                var bankName: String = "",
                @SerializedName("CardType")
                var cardType: String = "",
                @SerializedName("EStatementDate")
                var eStatementDate: String = "",
                @SerializedName("EStatementType")
                var eStatementType: String = "",
                @SerializedName("Fees")
                var fees: String = "",
                @SerializedName("ForgotType")
                var forgotType: String = "",
                @SerializedName("Layout")
                var layout: String = "",
                @SerializedName("LoginType")
                var loginType: String = "",
                @SerializedName("PWDFlag")
                var pWDFlag: Int = 0,
                @SerializedName("RegistrationType")
                var registrationType: String = ""
            ) : Parcelable

            @Parcelize
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
            ) : Parcelable
        }
    }
}