package com.a2a.data.datasource

import com.a2a.data.model.BaseLookup
import com.a2a.data.model.BaseResponse
import com.a2a.data.model.login.LoginPostData


interface MemoryCache {

    fun setCustProfile(custProfile: LoginPostData.A2ARequest.Body.CustProfile??)
    fun getCustProfile(): LoginPostData.A2ARequest.Body.CustProfile??


    fun setOtpRequest(request: Any)
    fun getOtpRequest(): Any

    fun setOtpResponse(response: BaseResponse)
    fun getOtpResponse(): BaseResponse

    fun setLookUps(response: BaseLookup)
    fun getLookUps(): BaseLookup

    fun setDeviceId(deviceId: String)
    fun getDeviceId(): String


}