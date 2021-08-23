package com.a2a.data.model.lookup


import android.os.Parcelable
import com.a2a.data.utility.isArabicLanguage
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class BranchBody(
    @SerializedName("Branch")
    var branch: List<Branch> = listOf()
) : Parcelable {
    @Parcelize
    data class Branch(
        @SerializedName("ADesc")
        var aDesc: String = "",
        @SerializedName("ALocation")
        var aLocation: String = "",
        @SerializedName("ATitle")
        var aTitle: String = "",
        @SerializedName("BranchCode")
        var branchCode: String = "",
        @SerializedName("Distance")
        var distance: Double = 0.0,
        @SerializedName("EDesc")
        var eDesc: String = "",
        @SerializedName("ELocation")
        var eLocation: String = "",
        @SerializedName("ETitle")
        var eTitle: String = "",
        @SerializedName("ID")
        var iD: Int = 0,
        @SerializedName("Latitude")
        var latitude: String = "",
        @SerializedName("Longitude")
        var longitude: String = "",
        @SerializedName("OpeningHours")
        var openingHours: String = "",
        @SerializedName("PhoneNo")
        var phoneNo: String = "",
        @SerializedName("PlaceID")
        var placeID: String = ""
    ) : Parcelable {
        fun getTitle(language: String) = if (language.isArabicLanguage()) aTitle else eTitle

        fun getLocation(language: String) =
            if (language.isArabicLanguage()) aLocation else eLocation

        fun getDesc(language: String) = if (language.isArabicLanguage()) aDesc else eDesc
    }
}