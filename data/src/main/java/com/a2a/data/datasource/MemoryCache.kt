package com.a2a.data.datasource

import com.a2a.data.model.authentication.CustProfile
import com.a2a.network.model.BaseResponse

interface MemoryCache {

    fun setCustProfile(custProfile: CustProfile?)
    fun getCustProfile(): CustProfile?

    fun setOtpRequest(request: Any)
    fun getOtpRequest(): Any

    fun setOtpResponse(response: BaseResponse)
    fun getOtpResponse(): BaseResponse
}