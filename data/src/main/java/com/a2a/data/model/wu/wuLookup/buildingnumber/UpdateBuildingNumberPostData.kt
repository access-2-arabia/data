package com.a2a.data.model.wu.wuLookup.buildingnumber

import com.a2a.data.model.CustProfileModel
import com.google.gson.annotations.SerializedName


data class UpdateBuildingNumberPostData(
    @SerializedName("Body")
    var body: Body = Body()
) {
    data class Body(
        @SerializedName("CustProfile")
        var custProfile: CustProfileModel = CustProfileModel(),
        @SerializedName("StepNumber")
        var stepNumber: Int = 0
    )
}