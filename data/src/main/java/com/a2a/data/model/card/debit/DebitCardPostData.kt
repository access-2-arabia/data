package com.a2a.data.model.card.debit

import com.google.gson.annotations.SerializedName
import com.a2a.network.model.CustProfile



data class DebitCardPostData(
    @SerializedName("Body")
    var body: Body = Body()
) {
    data class Body(
        @SerializedName("CustProfile")
        var custProfile: CustProfile = CustProfile()
    )
}