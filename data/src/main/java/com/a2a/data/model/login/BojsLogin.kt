package com.a2a.data.model.login


import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class BojsLogin(
    @SerializedName("A2ARequest")
    var a2ARequest: A2ARequest? = A2ARequest(),
    @SerializedName("A2AResponse")
    var a2AResponse: A2AResponse? = A2AResponse(),
    @SerializedName("ErrorMsg")
    var errorMsg: ErrorMsg? = ErrorMsg()
) : Parcelable {

}