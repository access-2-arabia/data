package com.a2a.data.repository.otp

import android.os.CountDownTimer
import com.a2a.data.datasource.RemoteDataSource
import com.a2a.data.model.common.A2ARequest
import com.a2a.data.model.common.BaseRequestModel
import com.a2a.data.model.otp.OTPTokenPostData
import com.a2a.data.repository.BaseRepository
import com.a2a.network.Resource
import com.google.gson.Gson
import com.google.gson.JsonObject
import javax.inject.Inject

class OTPRepository @Inject constructor(private val remoteDataSource: RemoteDataSource) :

    BaseRepository() {

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
        val postData = OTPTokenPostData()
        postData.body.custProfile = MemoryCacheImpl.getCustProfile()!!

        val request =
            BaseRequestModel(
                A2ARequest(
                    postData,
                    srvID = "OTPToken",
                    serviceIDValue = 0
                )
            )
        return safeApiCall(request) {
            remoteDataSource.baseRequest(request)
        }
    }


}