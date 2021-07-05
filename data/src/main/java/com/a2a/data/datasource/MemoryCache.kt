package com.a2a.data.datasource

import com.a2a.data.model.common.BaseLookup
import com.a2a.network.model.BaseResponse
import com.a2a.network.model.CustProfile

interface MemoryCache {

    fun setCustProfile(custProfile: CustProfile?)
    fun getCustProfile(): CustProfile?


    fun setOtpRequest(request: Any)
    fun getOtpRequest(): Any

    fun setOtpResponse(response: BaseResponse)
    fun getOtpResponse(): BaseResponse

    fun setLookUps(response: BaseLookup)
    fun getLookUps(): BaseLookup

}