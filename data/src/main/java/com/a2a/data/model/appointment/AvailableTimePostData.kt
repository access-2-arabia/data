package com.a2a.data.model.appointment


import com.google.gson.annotations.SerializedName

data class AvailableTimePostData(
    @SerializedName("BranchID")
    var branchID: String = "",
    @SerializedName("CurrentDay")
    var currentDay: String = "",
    @SerializedName("ServiceID")
    var serviceID: String = ""
)