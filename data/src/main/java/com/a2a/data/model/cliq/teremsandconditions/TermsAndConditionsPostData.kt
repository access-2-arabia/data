package com.a2a.data.model.cliq.teremsandconditions

import com.a2a.network.model.CustProfile
import com.google.gson.annotations.SerializedName

data class TermsAndConditionsPostData(
    @SerializedName("approve")
    var approve: Boolean? = null,
    @SerializedName("CustProfile")
    var custProfile: CustProfile = CustProfile(),
    @SerializedName("StepNumber")
    var stepNumber: Int = 0

)
