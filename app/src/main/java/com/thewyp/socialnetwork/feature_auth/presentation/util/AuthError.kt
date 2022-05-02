package com.thewyp.socialnetwork.feature_auth.presentation.util

import com.thewyp.socialnetwork.core.util.Error

sealed class AuthError : Error() {
    object FieldEmpty : AuthError()
    object InputTooShort : AuthError()
    object InvalidEmail: AuthError()
    object InvalidPassword : AuthError()
}