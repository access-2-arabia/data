package com.a2a.data.model.appointment


import com.google.gson.annotations.SerializedName

data class AvailableDatesPostData(
    @SerializedName("BranchID")
    var branchID: String = ""
)