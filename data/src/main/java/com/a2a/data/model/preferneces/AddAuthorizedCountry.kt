package com.a2a.data.model.preferneces

import com.a2a.network.model.CustProfile
import com.google.gson.annotations.SerializedName

data class AddAuthorizedCountry(
    @SerializedName("Country")
    var country: String = "",
    @SerializedName("CustProfile")
    var custProfile: CustProfile = CustProfile(),
    @SerializedName("StepNumber")
    var stepNumber: String = ""
)