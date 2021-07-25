package com.a2a.data.model


import android.os.Parcelable
import com.a2a.network.model.CustProfile
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class GetAccountDetailsPostData(
    @SerializedName("Accounts")
    var accounts: Accounts = Accounts(),
    @SerializedName("CustProfile")
    var custProfile: CustProfile = CustProfile(),
    @SerializedName("Lang")
    var lang: Int = 0
) : Parcelable {

    @Parcelize
    data class Accounts(
        @SerializedName("AccountNumber")
        var accountNumber: String = "",
        @SerializedName("Description")
        var description: String = "",
        @SerializedName("Enabled")
        var enabled: Boolean = false
    ) : Parcelable
}