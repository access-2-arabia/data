package com.a2a.data.model.dashboard

import com.a2a.network.model.CustProfile
import com.google.gson.annotations.SerializedName

data class DashboardPostData(
    @SerializedName("CustProfile")
    var custProfile: CustProfile = CustProfile(),
)