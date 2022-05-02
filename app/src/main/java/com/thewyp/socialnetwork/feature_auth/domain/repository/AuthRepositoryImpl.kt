package com.thewyp.socialnetwork.feature_auth.domain.repository

import com.thewyp.socialnetwork.R
import com.thewyp.socialnetwork.core.util.Resource
import com.thewyp.socialnetwork.core.util.SimpleResource
import com.thewyp.socialnetwork.core.util.UiText
import com.thewyp.socialnetwork.feature_auth.data.dto.request.CreateAccountRequest
import com.thewyp.socialnetwork.feature_auth.data.remote.AuthApi
import retrofit2.HttpException
import java.io.IOException

class AuthRepositoryImpl(
    private val api: AuthApi
) : AuthRepository {

    override suspend fun register(
        email: String,
        username: String,
        password: String
    ): SimpleResource {
        val request = CreateAccountRequest(email, username, password)
        return try {
            val response = api.register(request)
            if(response.successful) {
                Resource.Success(Unit)
            } else {
                response.message?.let { msg ->
                    Resource.Error(UiText.DynamicString(msg))
                } ?: Resource.Error(UiText.StringResource(R.string.error_unknown))
            }
        } catch(e: IOException) {
            Resource.Error(
                uiText = UiText.StringResource(R.string.error_couldnt_reach_server)
            )
        } catch(e: HttpException) {
            Resource.Error(
                uiText = UiText.StringResource(R.string.oops_something_went_wrong)
            )
        }
    }
}