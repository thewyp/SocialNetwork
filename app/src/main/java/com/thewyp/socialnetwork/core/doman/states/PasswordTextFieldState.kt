package com.thewyp.socialnetwork.core.doman.states

import com.thewyp.socialnetwork.core.util.Error

data class PasswordTextFieldState(
    val text: String = "",
    val error: Error? = null,
    val isPasswordVisible: Boolean = false
)