package com.a2a.data.model.validations

import com.a2a.network.model.CustProfile
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class IbanValidationPostData(
    @SerializedName("Body")
    var body: Body = Body()
) {
    data class Body(
        @SerializedName("CustProfile")
        var custProfile: CustProfile = CustProfile(),
        @SerializedName("iban")
        var iban: String = "",
        @SerializedName("StepNumber")
        var stepNumber: Int = 0
    )
}