package com.a2a.data.model.appointment


import com.google.gson.annotations.SerializedName

data class CountryPostData(
    @SerializedName("CountryID")
    var countryID: String = ""
)