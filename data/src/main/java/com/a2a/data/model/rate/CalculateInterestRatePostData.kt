package com.a2a.data.model.rate


import com.google.gson.annotations.SerializedName

data class CalculateInterestRatePostData(
    @SerializedName("Amount")
    var amount: String = "",
    @SerializedName("Curr")
    var curr: String = "",
    @SerializedName("Period")
    var period: String = "",
    @SerializedName("StepNumber")
    var stepNumber: String = ""
)
