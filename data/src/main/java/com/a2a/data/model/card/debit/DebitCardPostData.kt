package com.a2a.data.model.card.debit

import com.google.gson.annotations.SerializedName

class DebitCardPostData(
    @SerializedName("Body")
    var body: Body = Body()
) {
    data class Body(
        @SerializedName("CustID")
        var custID: String = ""
    )

}

