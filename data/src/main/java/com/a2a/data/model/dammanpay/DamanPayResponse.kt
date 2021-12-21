package com.a2a.data.model.dammanpay

import android.os.Parcelable
import com.a2a.network.model.CustProfile
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class DamanPayResponse(
        @SerializedName("Body")
        var body: Body = Body()
    ) : Parcelable {
        @Parcelize
        data class Body(
            @SerializedName("StepNumber")
            var stepNumber: Int = 0,
            @SerializedName("CustProfile")
            var custProfile: CustProfile = CustProfile(),
            @SerializedName("REQ_TYPE")
            var reqType: Int = 0
        ) : Parcelable
    }
