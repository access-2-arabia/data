package com.a2a.data.model.common

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class BaseResponse<T : Parcelable>(
    @SerializedName("A2AResponse")
    var a2AResponse: A2AResponse<T>,
    @SerializedName("ErrorMsg")
    var errorMsg: ErrorMsg = ErrorMsg()
) : Parcelable