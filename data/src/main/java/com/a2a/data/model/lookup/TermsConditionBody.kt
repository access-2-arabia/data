package com.a2a.data.model.lookup

import com.a2a.data.utility.isArabicLanguage
import com.google.gson.annotations.SerializedName

data class TermsConditionBody(
    @SerializedName("TermsCondition")
    var termsCondition: List<TermsCondition> = listOf()
) {
    data class TermsCondition(
        @SerializedName("ADesc")
        var aDesc: String = "",
        @SerializedName("AText")
        var aText: String = "",
        @SerializedName("AValue")
        var aValue: String = "",
        @SerializedName("Channel")
        var channel: String = "",
        @SerializedName("EDesc")
        var eDesc: String = "",
        @SerializedName("EText")
        var eText: String = "",
        @SerializedName("EValue")
        var eValue: String = ""
    ) {

        fun getText(language: String) = if (language.isArabicLanguage()) aText else eText

        fun getValue(language: String) = if (language.isArabicLanguage()) aValue else eValue

        fun getDesc(language: String) = if (language.isArabicLanguage()) aDesc else eDesc
    }
}
