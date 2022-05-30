package com.a2a.data.model.termesandconditions

import android.os.Parcelable
import com.a2a.network.model.CustProfile


import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize


data class TermsAndConditionsPostData(
    @SerializedName("Body")
    var body: Body = Body()
) {
    data class Body(
        @SerializedName("CustProfile")
        var custProfile: CustProfile = CustProfile(),
        @SerializedName("PageName")
        var pageName: String = "",
        @SerializedName("StepNumber")
        var stepNumber: Int = 0
    )
}