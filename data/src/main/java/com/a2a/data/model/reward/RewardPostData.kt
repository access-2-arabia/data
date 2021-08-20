package com.a2a.data.model.reward

import com.a2a.network.model.CustProfile
import com.google.gson.annotations.SerializedName

data class RewardPostData(
    @SerializedName("Body")
    var body: Body = Body()
) {
    data class Body(
        @SerializedName("CustProfile")
        var custProfile: CustProfile = CustProfile()
    )
}


