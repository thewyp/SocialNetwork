package com.thewyp.socialnetwork.feature_auth.data.remote

import com.thewyp.socialnetwork.core.data.dto.response.BasicApiResponse
import com.thewyp.socialnetwork.feature_auth.data.dto.request.CreateAccountRequest
import retrofit2.http.Body
import retrofit2.http.POST

interface AuthApi {

    @POST("/api/user/create")
    suspend fun register(
        @Body request: CreateAccountRequest
    ): BasicApiResponse

    companion object {
        const val BASE_URL = "http://192.168.5.5:8081/"
    }
}