package com.thewyp.socialnetwork.feature_auth.doman.repository

import com.thewyp.socialnetwork.core.util.SimpleResource

interface AuthRepository {

    suspend fun register(
        email: String,
        username: String,
        password: String
    ): SimpleResource
}