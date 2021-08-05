package com.a2a.data.model.preferneces


import com.a2a.network.model.CustProfile
import com.google.gson.annotations.SerializedName

data class GetAuthorisedCountryPostData(
    @SerializedName("CustProfile")
    var custProfile: CustProfile = CustProfile()
)
