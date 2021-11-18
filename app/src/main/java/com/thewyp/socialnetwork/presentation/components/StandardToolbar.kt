package com.thewyp.socialnetwork.presentation.components

import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.thewyp.socialnetwork.R

@Composable
fun StandardToolbar(
    modifier: Modifier = Modifier,
    navController: NavController,
    showNavigatorArraw: Boolean = false,
    title: @Composable () -> Unit = {},
    actions: @Composable RowScope.() -> Unit = {}
) {
    TopAppBar(
        title = title,
        navigationIcon = if (showNavigatorArraw) {
            {
                IconButton(onClick = {
                    navController.navigateUp()
                }) {
                    Icon(
                        imageVector = Icons.Default.ArrowBack,
                        contentDescription = stringResource(R.string.back),
                        tint = MaterialTheme.colors.onBackground
                    )
                }

            }
        } else null,
        actions = actions,
        backgroundColor = MaterialTheme.colors.surface,
        elevation = 0.dp,
        modifier = modifier.fillMaxWidth()
    )

}