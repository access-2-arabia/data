package com.a2a.data.model.appointment


import com.google.gson.annotations.SerializedName

data class ServicesPostData(
    @SerializedName("BranchID")
    var branchID: String = "",
    @SerializedName("MobileNumber")
    var mobileNumber: String = ""
)