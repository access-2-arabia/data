package com.a2a.data.repository

import MemoryCacheImpl
import com.a2a.data.datasource.RemoteDataSource
import com.a2a.data.model.common.CustomerProfilePostData
import com.a2a.network.Resource
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
    ): Resource<T> {

        val customerProfilePostData = CustomerProfilePostData()
        customerProfilePostData.a2ARequest.apply {
            body.custProfile = MemoryCacheImpl.getCustProfile()!!
            body.custProfile.mobileNumber = mobileNumber
            header.srvID = "OTPToken"
        }

        return safeApiCall(customerProfilePostData) {
            remoteDataSource.baseRequest(
                customerProfilePostData
            )
        }
    }

}

