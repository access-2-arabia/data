package com.a2a.data.model.lookup


import android.os.Parcelable
import com.a2a.data.utility.isArabicLanguage
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class ATMsBody(
    @SerializedName("ATMs")
    var aTMs: List<ATM> = listOf()
) : Parcelable {
    @Parcelize
    data class ATM(
        @SerializedName("AName")
        var aName: String = "",
        @SerializedName("AValue")
        var aValue: String = "",
        @SerializedName("EName")
        var eName: String = "",
        @SerializedName("EValue")
        var eValue: String = "",
        @SerializedName("ID")
        var iD: Int = 0,
        @SerializedName("Latitude")
        var latitude: String = "",
        @SerializedName("Longitude")
        var longitude: String = ""
    ) : Parcelable {
        fun getName(language: String) = if (language.isArabicLanguage()) aName else eName

        fun getValue(language: String) = if (language.isArabicLanguage()) aValue else eValue
    }
}