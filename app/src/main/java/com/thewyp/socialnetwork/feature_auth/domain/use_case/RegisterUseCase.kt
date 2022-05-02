package com.thewyp.socialnetwork.feature_auth.domain.use_case

import com.thewyp.socialnetwork.core.util.SimpleResource
import com.thewyp.socialnetwork.feature_auth.domain.repository.AuthRepository

class RegisterUseCase(
    private val repository: AuthRepository
) {

    suspend operator fun invoke(
        email: String,
        username: String,
        password: String
    ): SimpleResource {
        return repository.register(email.trim(), username.trim(), password.trim())
    }
}