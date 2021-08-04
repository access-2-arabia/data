package com.a2a.data.model.mail


import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class MailPostData(
    @SerializedName("CustProfile")
    var custProfile: CustProfile = CustProfile()
) : Parcelable