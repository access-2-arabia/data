package com.a2a.data.model.common

import com.google.gson.annotations.SerializedName

data class Footer(
    @SerializedName("Signature")
    var signature: String = ""
)