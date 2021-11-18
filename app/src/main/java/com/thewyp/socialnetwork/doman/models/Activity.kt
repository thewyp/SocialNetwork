package com.thewyp.socialnetwork.doman.models

import com.thewyp.socialnetwork.doman.util.ActivityAction


data class Activity(
    val username: String,
    val actionType: ActivityAction,
    val formattedTime: String,
)
