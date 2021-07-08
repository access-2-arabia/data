package com.a2a.data.model.common

import com.google.gson.annotations.SerializedName

data class Authenticate(
    @SerializedName("PIN")
    var pIN: String = "",
    @SerializedName("UTR")
    var uTR: String = ""
)