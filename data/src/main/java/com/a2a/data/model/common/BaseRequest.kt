package com.a2a.data.model.common

import android.os.Parcelable
import com.google.gson.annotations.SerializedName

data class BaseRequest<T : Parcelable>(
    @SerializedName("A2ARequest")
    var a2ARequest: A2ARequest<T> = A2ARequest()
)