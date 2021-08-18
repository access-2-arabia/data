package com.a2a.data.model.appointment


import com.google.gson.annotations.SerializedName

data class BranchPostData(
    @SerializedName("CityID")
    var cityID: String = "",
    @SerializedName("CountryID")
    var countryID: String = "",
    @SerializedName("RegionID")
    var regionID: String = ""
)