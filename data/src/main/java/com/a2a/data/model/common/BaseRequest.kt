package com.a2a.data.model.common

import com.google.gson.annotations.SerializedName

data class BaseRequest<T>(
    @SerializedName("A2ARequest")
    var a2ARequest: A2ARequest<T>
)