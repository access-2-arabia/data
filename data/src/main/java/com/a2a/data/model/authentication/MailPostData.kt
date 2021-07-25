package com.a2a.data.model.authentication


import android.os.Parcelable
import com.a2a.network.model.CustProfile
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class MailPostData(
    @SerializedName("CustProfile")
    var custProfile: CustProfile = CustProfile()
) : Parcelable