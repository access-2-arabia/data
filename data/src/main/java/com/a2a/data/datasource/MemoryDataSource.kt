package com.a2a.data.datasource

import com.a2a.data.model.authentication.CustProfile
import com.a2a.data.model.authentication.login.LoginBody
import com.a2a.data.model.lookup.ActivityLog
import com.a2a.network.model.BaseResponse

class MemoryDataSource {
    private var custProfile: CustProfile? = null
    private var loginBody: LoginBody? = null
    private var request: Any = Any()
    private var response: BaseResponse = BaseResponse()

    fun getCustProfile() = custProfile
    fun getLoginBody() = loginBody
    fun getOtpRequest() = request
    fun getOtpResponse() = response

    fun cacheInMemory(custProfile: CustProfile?) {
        this.custProfile = custProfile
    }

    fun cacheLoginBody(loginBody: LoginBody?) {
        this.loginBody = loginBody
    }

    fun cacheRequest(request: Any) {
        this.request = request
    }

    fun cacheResponse(response: BaseResponse) {
        this.response = response
    }
}