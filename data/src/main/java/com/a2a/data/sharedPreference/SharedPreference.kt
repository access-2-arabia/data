package com.a2a.mbanking.application.data.sharedPreference

import android.content.Context
import android.content.SharedPreferences

class SharedPreference(context: Context) {
    private val PREFS_NAME = "CAB_APP"
    private val BIOMATRIC_LOGIN = "BIOMATRIC_LOGIN"
    private val LAST_SUCCESSFUL_LOGIN = "LAST_SUCCESSFUL_LOGIN"
    private val LAST_UNSUCCESSFUL_LOGIN = "LAST_UNSUCCESSFUL_LOGIN"
    private val PASSWORD_EXPIRED = "PASSWORD_EXPIRED"
    private val LAST_FINANCIAL_TRANSACTIONS = "LAST_FINANCIAL_TRANSACTIONS"


    private val sharedPref: SharedPreferences =
        context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)


    var isBiomatricLoginEnabled: Boolean
        get() = sharedPref.getBoolean(BIOMATRIC_LOGIN, false)
        set(isBiomatricLoginEnabled) = sharedPref.edit()
            .putBoolean(BIOMATRIC_LOGIN, isBiomatricLoginEnabled).apply()


    var lastSuccessfulLogin: String
        get() = sharedPref.getString(LAST_SUCCESSFUL_LOGIN, "---").toString()
        set(lastSuccessfulLogin) = sharedPref.edit()
            .putString(LAST_SUCCESSFUL_LOGIN, lastSuccessfulLogin).apply()

    var lastUnsuccessfulLogin: String
        get() = sharedPref.getString(LAST_UNSUCCESSFUL_LOGIN, "---").toString()
        set(lastUnsuccessfulLogin) = sharedPref.edit()
            .putString(LAST_UNSUCCESSFUL_LOGIN, lastUnsuccessfulLogin).apply()

    var passwordExpired: String
        get() = sharedPref.getString(PASSWORD_EXPIRED, "---").toString()
        set(passwordExpired) = sharedPref.edit()
            .putString(PASSWORD_EXPIRED, passwordExpired).apply()
    var lastFinancialTransactions: String
        get() = sharedPref.getString(LAST_FINANCIAL_TRANSACTIONS, "---").toString()
        set(lastFinancialTransactions) = sharedPref.edit()
            .putString(LAST_FINANCIAL_TRANSACTIONS, lastFinancialTransactions).apply()


}