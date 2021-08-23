package com.a2a.data.model.authentication.login

import android.os.Parcelable
import com.a2a.data.model.authentication.CustProfile
import com.a2a.data.model.lookup.ActivityLog
import com.a2a.data.model.lookup.TermsCondition
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class LoginBody(
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
) : Parcelable