package com.thewyp.socialnetwork.feature_post.presentation.main_feed

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.navigation.NavController
import com.thewyp.socialnetwork.R
import com.thewyp.socialnetwork.core.domain.models.Post
import com.thewyp.socialnetwork.core.presentation.components.Post
import com.thewyp.socialnetwork.core.presentation.components.StandardToolbar
import com.thewyp.socialnetwork.core.util.Screen


@Composable
fun MainFeedScreen(
    navController: NavController
) {

    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        StandardToolbar(
            navController = navController,
            title = {
                Text(
                    text = stringResource(id = R.string.your_feed),
                    fontWeight = FontWeight.Bold,
                    color = MaterialTheme.colors.onBackground
                )
            },
            actions = {
                IconButton(onClick = {
                    navController.navigate(Screen.SearchScreen.route)
                }) {
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = "",
                        tint = MaterialTheme.colors.onBackground
                    )
                }
            }
        )

        Post(
            post = Post(
                username = "Yupeng",
                imageUrl = "",
                profilePictureUrl = "",
                description = "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed" +
                        "diam nonumy eirmod tempor invidunt ut labore et dolore " +
                        "magna aliquyam erat, sed diam voluptua...",
                likeCount = 20,
                commentCount = 7
            ),
            onPostClick = {
                navController.navigate(Screen.PostDetailScreen.route)
            }
        )
    }

}