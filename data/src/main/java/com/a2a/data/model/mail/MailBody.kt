package com.a2a.data.model.mail

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class MailBody(
    @SerializedName("Inbox")
    var inbox: List<MailModel?> = listOf(),
    @SerializedName("Outbox")
    var outbox: List<MailModel?> = listOf(),
    @SerializedName("Trash")
    var trash: List<MailModel?> = listOf()
) : Parcelable