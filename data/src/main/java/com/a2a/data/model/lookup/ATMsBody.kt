package com.a2a.data.model.lookup


import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize
import android.os.Parcelable

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
    ) : Parcelable
}