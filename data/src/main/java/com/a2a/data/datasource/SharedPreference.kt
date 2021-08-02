package com.a2a.data.datasource

import android.content.Context
import android.content.SharedPreferences
import com.a2a.network.securityHelper.EncryptionDecryptionHelper


class SharedPreference(application: Context, prefName : String) {
    private val BIOMATRIC_LOGIN = "BIOMATRIC_LOGIN"
    private val CUSTOMER_ID = "CUSTOMER_ID"
    private val PASSWORD = "PU"
    private val IS_REMEMBER_ME_ENABLED = "IS_REMEMBER_ME_ENABLED"
    private val sharedPref = application.getSharedPreferences(prefName, Context.MODE_PRIVATE)

    var isBiometricLoginEnabled: Boolean
        get() = sharedPref.getBoolean(BIOMATRIC_LOGIN, false)
        set(isBiometricLoginEnabled) = sharedPref.edit()
            .putBoolean(BIOMATRIC_LOGIN, isBiometricLoginEnabled).apply()

    var customerId: String
        get() = sharedPref.getString(CUSTOMER_ID, "").toString()
        set(customerId) = sharedPref.edit().putString(CUSTOMER_ID, customerId).apply()

    var password: String
        get() = sharedPref.getString(PASSWORD, "").toString()
        set(password) = sharedPref.edit().putString(PASSWORD, password).apply()

    var isRememberMeEnabled: Boolean
        get() = sharedPref.getBoolean(IS_REMEMBER_ME_ENABLED, false)
        set(isRememberMeEnabled) = sharedPref.edit()
            .putBoolean(IS_REMEMBER_ME_ENABLED, isRememberMeEnabled)
            .apply()


}