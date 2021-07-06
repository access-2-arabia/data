package com.a2a.data.model.common

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class BaseRequestModel<T>(
    @SerializedName("A2ARequest")
    var a2ARequest: A2ARequest<T>
) : Serializable {
}


