package com.a2a.data.model.cliq.teremsandconditions

import android.os.Parcelable
import com.a2a.network.model.CustProfile
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize



@Parcelize
data class TermsAndConditionsPostData(

        @SerializedName("approve")
        var approve: Boolean? = false,
        @SerializedName("CustProfile")
        var custProfile: CustProfile = CustProfile(),
        @SerializedName("StepNumber")
        var stepNumber: Int = 0
)
