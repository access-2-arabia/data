package com.a2a.data.model.cards


import com.a2a.network.model.CustProfile
import com.google.gson.annotations.SerializedName

data class AtmManagementPostData(
    @SerializedName("CardNo")
    var cardNo: String = "",
    @SerializedName("CustProfile")
    var custProfile: CustProfile = CustProfile(),
    @SerializedName("Status")
    var status: String = "3",
    @SerializedName("StepNumber")
    var stepNumber: Int? = 0
)
