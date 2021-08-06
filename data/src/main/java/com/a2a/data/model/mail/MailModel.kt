package com.a2a.data.model.mail

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class MailModel(
    @SerializedName("ID")
    var iD: Int? = 0,
    @SerializedName("MailDate")
    var mailDate: String? = "",
    @SerializedName("ReadFlag")
    var readFlag: Boolean? = false,
    @SerializedName("Subject")
    var subject: String? = "",
    @SerializedName("Text")
    var text: String? = ""
) : Parcelable