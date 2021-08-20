package com.a2a.data.model.cliq.settings

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class CliQAccount(
    @SerializedName("Acciban")
    var acciban: String = "",

    @SerializedName("bic")
    var bic: String = "",

    @SerializedName("closingDate")
    var closingDate: String = "",

    @SerializedName("currency")
    var currency: String = "",

    @SerializedName("isDefault")
    var isDefault: Boolean = false,

    @SerializedName("openingDate")
    var openingDate: String = "",

    @SerializedName("RecordId")
    var recordId: String = "",

    @SerializedName("CustID")
    var custId: String = "",

    @SerializedName("type")
    var type: String = "",
    var accountDec: String = ""
) : Parcelable {
    override fun toString(): String {
        return accountDec
    }
}
