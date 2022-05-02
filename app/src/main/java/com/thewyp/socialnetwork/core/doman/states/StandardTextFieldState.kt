package com.thewyp.socialnetwork.core.doman.states

import com.thewyp.socialnetwork.core.util.Error

data class StandardTextFieldState(
    val text: String = "",
    val error: Error? = null
)