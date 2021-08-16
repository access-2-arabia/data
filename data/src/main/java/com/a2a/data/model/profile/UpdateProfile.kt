package com.a2a.data.model.profile


import MemoryCacheImpl
import com.a2a.network.model.CustProfile
import com.google.gson.annotations.SerializedName

data class UpdateProfile(
    @SerializedName("CustProfile")
    var custProfile: CustProfile = MemoryCacheImpl.getCustProfile()!!,
    @SerializedName("SrvId")
    var srvId: String = "CustProf",
    @SerializedName("StepNumber")
    var stepNumber: Int = 2
)

