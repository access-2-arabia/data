package com.a2a.data.model.lookup


import android.os.Parcelable
import com.a2a.data.utility.isArabicLanguage
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class GeneralLookupBody(
    @SerializedName("Parameter")
    var parameter: List<Parameter> = listOf()
) : Parcelable {
    @Parcelize
    data class Parameter(
        @SerializedName("ADesc")
        var aDesc: String = "",
        @SerializedName("AValue")
        var aValue: String = "",
        @SerializedName("EDesc")
        var eDesc: String = "",
        @SerializedName("EValue")
        var eValue: String = "",
        @SerializedName("ID")
        var iD: Int = 0,
        @SerializedName("RegionCode")
        var regionCode: String = ""
    ) : Parcelable {
        fun getValue(language: String) = if (language.isArabicLanguage()) aValue else eValue

        fun getDesc(language: String) = if (language.isArabicLanguage()) aDesc else eDesc
    }
}