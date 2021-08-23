package com.a2a.data.model.authentication

import android.os.Parcelable
import com.a2a.data.model.authentication.login.LoginBody
import com.a2a.data.model.common.A2ARequest
import com.a2a.data.model.common.A2AResponse
import com.a2a.data.model.common.ErrorMsg
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class LoginResponse(
    @SerializedName("A2ARequest")
    var a2ARequest: A2ARequest<LoginPostData> = A2ARequest(),
    @SerializedName("A2AResponse")
    var a2AResponse: A2AResponse<LoginBody> = A2AResponse(),
    @SerializedName("ErrorMsg")
    var errorMsg: ErrorMsg = ErrorMsg()
) : Parcelable