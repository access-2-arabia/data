package com.a2a.data.repository

import MemoryCacheImpl
import com.a2a.data.datasource.RemoteDataSource
import com.a2a.data.model.common.A2ARequest
import com.a2a.data.model.common.BaseRequest
import com.a2a.network.Resource
import com.a2a.network.model.OTPResponse
import com.google.gson.Gson
import com.google.gson.JsonObject
import javax.inject.Inject


class OTPRepository @Inject constructor(
    private val remoteDataSource: RemoteDataSource
) : BaseRepository() {


    suspend fun <REQUEST, OLD_REQUEST> checkOtp(
        request: OLD_REQUEST, utr: String?, pin: String?, isBiometric: Boolean, isManual: Boolean
    ): Resource<REQUEST> {
        val gson = Gson()
        val jsonRequest = gson.toJson(request)
        val jsonObject: JsonObject = gson.fromJson(jsonRequest, JsonObject::class.java)
        val authJsonObject = JsonObject()
        authJsonObject.addProperty("UTR", utr)
        authJsonObject.addProperty("PIN", pin)
        authJsonObject.addProperty("LWTD", isBiometric)
        jsonObject.getAsJsonObject("A2ARequest").getAsJsonObject("Body")
            .add("Authenticate", authJsonObject)
        if (isManual) {
            jsonObject.getAsJsonObject("A2ARequest").getAsJsonObject("Body")
                .addProperty("StepNumber", "2")

        }
        return safeApiCall(jsonObject) { remoteDataSource.baseRequest(jsonObject) }
    }

    suspend fun <T> requestOTP(
        mobileNumber: String
    ): OTPResponse {

        val postData = MemoryCacheImpl.getCustProfile()!!
        postData.mobileNumber = mobileNumber

        val request =  BaseRequest(A2ARequest(postData, srvId = "OTPToken"))
        return safeApiCall(request,OTPResponse::class.java) {
            remoteDataSource.baseRequest(request)
        }
    }

}

