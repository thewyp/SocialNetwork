package com.thewyp.socialnetwork.feature_auth.domain.models

import com.thewyp.socialnetwork.core.util.SimpleResource
import com.thewyp.socialnetwork.feature_auth.presentation.util.AuthError

data class RegisterResult(
    val emailError: AuthError? = null,
    val usernameError: AuthError? = null,
    val passwordError: AuthError? = null,
    val result: SimpleResource? = null
)