package com.a2a.data.model.common

import com.google.gson.annotations.SerializedName

data class BaseResponse<T>(
    @SerializedName("A2AResponse")
    var a2ARequest: A2AResponse<T>,
    @SerializedName("ErrorMsg")
    var errorMsg: ErrorMsg = ErrorMsg()
)