package com.thewyp.socialnetwork.presentation.util

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.thewyp.socialnetwork.doman.models.Post
import com.thewyp.socialnetwork.presentation.post_detail.PostDetailScreen
import com.thewyp.socialnetwork.presentation.activity.ActivityScreen
import com.thewyp.socialnetwork.presentation.chat.ChatScreen
import com.thewyp.socialnetwork.presentation.create_post.CreatePostScreen
import com.thewyp.socialnetwork.presentation.login.LoginScreen
import com.thewyp.socialnetwork.presentation.main_feed.MainFeedScreen
import com.thewyp.socialnetwork.presentation.profile.ProfileScreen
import com.thewyp.socialnetwork.presentation.register.RegisterScreen
import com.thewyp.socialnetwork.presentation.search.SearchScreen
import com.thewyp.socialnetwork.presentation.splash.SplashScreen

@ExperimentalMaterialApi
@Composable
fun Navigation(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = Screen.SplashScreen.route,
        modifier = Modifier.fillMaxSize()
    ) {
        composable(route = Screen.SplashScreen.route) {
            SplashScreen(navController = navController)
        }
        composable(route = Screen.LoginScreen.route) {
            LoginScreen(navController = navController)
        }
        composable(route = Screen.MainFeedScreen.route) {
            MainFeedScreen(navController = navController)
        }
        composable(route = Screen.RegisterScreen.route) {
            RegisterScreen(navController = navController)
        }
        composable(route = Screen.ActivityScreen.route) {
            ActivityScreen(navController = navController)
        }
        composable(route = Screen.ProfileScreen.route) {
            ProfileScreen(navController = navController)
        }
        composable(route = Screen.ChatScreen.route) {
            ChatScreen(navController = navController)
        }
        composable(route = Screen.CreatePostScreen.route) {
            CreatePostScreen(navController = navController)
        }
        composable(route = Screen.SearchScreen.route) {
            SearchScreen(navController = navController)
        }
        composable(route = Screen.PostDetailScreen.route) {
            PostDetailScreen(
                navController = navController,
                post = Post(
                    username = "Philipp Lackner",
                    imageUrl = "",
                    profilePictureUrl = "",
                    description = "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed\n" +
                            "diam nonumy eirmod tempor invidunt ut labore et dolore \n" +
                            "magna aliquyam erat, sed diam voluptua Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed\\n\" +\n" +
                            "                    \"diam nonumy eirmod tempor invidunt ut labore et dolore \\n\" +\n" +
                            "                    \"magna aliquyam erat, sed diam voluptua",
                    likeCount = 17,
                    commentCount = 7
                )
            )
        }
    }
}