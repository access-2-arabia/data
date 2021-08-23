package com.a2a.data.datasource

import com.a2a.data.model.authentication.CustProfile
import com.a2a.data.model.authentication.login.LoginBody
import com.a2a.network.model.BaseResponse

object MemoryCacheImpl : MemoryCache {
    private val memoryDataSource: MemoryDataSource = MemoryDataSource()

    override fun setCustProfile(custProfile: CustProfile?) = memoryDataSource.cacheInMemory(custProfile)

    override fun setLoginBody(logs: LoginBody?) = memoryDataSource.cacheLoginBody(logs)

    override fun setOtpResponse(response: BaseResponse) = memoryDataSource.cacheResponse(response)

    override fun setOtpRequest(request: Any) = memoryDataSource.cacheRequest(request)


    override fun getCustProfile(): CustProfile? = memoryDataSource.getCustProfile()

    override fun getLoginBody(): LoginBody? = memoryDataSource.getLoginBody()

    override fun getOtpRequest(): Any = memoryDataSource.getOtpRequest()

    override fun getOtpResponse(): BaseResponse = memoryDataSource.getOtpResponse()
}