package com.a2a.data.model.common

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
class BaseResponse<T : Parcelable, R : Parcelable>(
    @SerializedName("A2ARequest")
    var a2ARequest: A2ARequest<T>? = A2ARequest(),
    @SerializedName("A2AResponse")
    var a2AResponse: A2AResponse<R>? = A2AResponse(),
    @SerializedName("ErrorMsg")
    var errorMsg: ErrorMsg? = ErrorMsg()
) : Parcelable

