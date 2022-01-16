package com.a2a.data.model.lookup


import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class
Product(
    @SerializedName("ADesc")
    var aDesc: String = "",
    @SerializedName("AName")
    var aName: String = "",
    @SerializedName("Category")
    var category: Int = 0,
    @SerializedName("Date")
    var date: String = "",
    @SerializedName("EDesc")
    var eDesc: String = "",
    @SerializedName("EName")
    var eName: String = "",
    @SerializedName("Enabled")
    var enabled: Boolean = false,
    @SerializedName("ID")
    var iD: Int = 0,
    @SerializedName("Img")
    var img: String = "",
    @SerializedName("InterestedOption")
    var interestedOption: Boolean = false,
    @SerializedName("LoanSimulation")
    var loanSimulation: Boolean = false,
    @SerializedName("ProductID")
    var productID: String = "",
    @SerializedName("RegionCode")
    var regionCode: String = "",
    @SerializedName("Segmentation")
    var segmentation: String = "",
    @SerializedName("TblLUProductsCategory")
    var tblLUProductsCategory: String = ""
) : Parcelable