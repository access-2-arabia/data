package com.a2a.data.datasource


import com.a2a.data.model.BaseResponse
import com.a2a.data.model.CustProfileModel
import com.a2a.data.model.lookup.LookUpResponse

interface MemoryCache {

    fun setCustProfile(custProfile: CustProfileModel?)
    fun getCustProfile(): CustProfileModel?

    fun setOtpRequest(request: Any)
    fun getOtpRequest(): Any

    fun setOtpResponse(response: BaseResponse)
    fun getOtpResponse(): BaseResponse

    fun setLookUps(response: LookUpResponse)
    fun getLookUps(): LookUpResponse

    fun setDeviceId(deviceId: String)
    fun getDeviceId(): String


}