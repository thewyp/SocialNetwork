package com.thewyp.socialnetwork.feature_post.presentation.util

import com.thewyp.socialnetwork.core.util.Error

sealed class PostDescriptionError : Error() {
    object FieldEmpty: PostDescriptionError()
}