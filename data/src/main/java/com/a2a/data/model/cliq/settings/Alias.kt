package com.a2a.data.model.cliq.settings

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Alias(
    @SerializedName("accounts")
    var accounts: List<CliQAccount> = listOf(),
    @SerializedName("EValue")
    var eValue: String = "",
    @SerializedName("RecordId")
    var recordId: String = "",
    @SerializedName("startDate")
    var startDate: String = "",
    @SerializedName("status")
    var status: String = "",
    @SerializedName("type")
    var type: String = "",
    @SerializedName("value")
    var value: String = ""
): Parcelable
{
    override fun toString(): String {
        return value
    }
}