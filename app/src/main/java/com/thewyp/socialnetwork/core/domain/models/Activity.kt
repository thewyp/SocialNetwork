package com.thewyp.socialnetwork.core.domain.models

import com.thewyp.socialnetwork.feature_activity.doman.ActivityAction


data class Activity(
    val username: String,
    val actionType: ActivityAction,
    val formattedTime: String,
)
