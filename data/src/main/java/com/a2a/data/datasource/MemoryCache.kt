package com.a2a.data.datasource


import com.a2a.data.model.BaseResponse
import com.a2a.data.model.lookup.LookUpResponse
import com.a2a.network.model.CustProfile

interface MemoryCache {

    fun setCustProfile(custProfile: CustProfile?)
    fun getCustProfile(): CustProfile?

    fun setOtpRequest(request: Any)
    fun getOtpRequest(): Any

    fun setOtpResponse(response: BaseResponse)
    fun getOtpResponse(): BaseResponse

    fun setLookUps(response: LookUpResponse)
    fun getLookUps(): LookUpResponse

    fun setDeviceId(deviceId: String)
    fun getDeviceId(): String

    fun setIpAddress(ipAddress: String)
    fun getIpAddress(): String
}