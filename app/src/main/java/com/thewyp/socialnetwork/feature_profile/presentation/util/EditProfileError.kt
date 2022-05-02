package com.thewyp.socialnetwork.feature_profile.presentation.util

import com.thewyp.socialnetwork.core.util.Error

sealed class EditProfileError : Error() {
    object FieldEmpty: EditProfileError()
}