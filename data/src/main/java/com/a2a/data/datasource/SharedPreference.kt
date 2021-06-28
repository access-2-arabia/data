package com.a2a.data.datasource

import android.content.Context
import android.content.SharedPreferences
import com.a2a.network.securityHelper.EncryptionDecryptionHelper
import javax.inject.Inject


class SharedPreference (application: Context) {
    private val PREFS_NAME = "BEA"
    private val BIOMATRIC_LOGIN = "BIOMATRIC_LOGIN"
    private val CUSTOMER_ID = "CUSTOMER_ID"
    private val PASSWORD = "PU"
    private val sharedPref: SharedPreferences =
        application.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
    val encryptDataHelper = EncryptionDecryptionHelper()
    var isBiometricLoginEnabled: Boolean
        get() = sharedPref.getBoolean(BIOMATRIC_LOGIN, false)
        set(isBiometricLoginEnabled) = sharedPref.edit()
            .putBoolean(BIOMATRIC_LOGIN, isBiometricLoginEnabled).apply()

    var customerId: String
        get() = encryptDataHelper.decryptData(
            sharedPref.getString(CUSTOMER_ID, "").toString(), AppCache.token
        )
        set(customerId) = sharedPref.edit().putString(
            CUSTOMER_ID, encryptDataHelper.encryptData(customerId, AppCache.token)
        ).apply()

    var password: String
        get() = encryptDataHelper.decryptData(
            sharedPref.getString(PASSWORD, "").toString(), AppCache.token
        )
        set(password) = sharedPref.edit().putString(
            PASSWORD, encryptDataHelper.encryptData(password, AppCache.token)
        ).apply()
    var isRememberMeEnabled: Boolean
        get() = sharedPref.getBoolean(PASSWORD, false)
        set(isRememberMeEnabled) = sharedPref.edit().putBoolean(PASSWORD, isRememberMeEnabled)
            .apply()


}