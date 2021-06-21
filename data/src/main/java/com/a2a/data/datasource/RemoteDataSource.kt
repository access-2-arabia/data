package com.a2a.data.datasource

import com.a2a.data.constants.Constants.Companion.BASE_ENDPOINT
import retrofit2.http.Body
import retrofit2.http.POST


interface RemoteDataSource {
    @POST(BASE_ENDPOINT)
    suspend fun <T> baseRequest(@Body baseRequest: Any): T
}