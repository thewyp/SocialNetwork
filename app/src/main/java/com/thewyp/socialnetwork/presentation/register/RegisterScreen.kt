package com.thewyp.socialnetwork.presentation.register

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.thewyp.socialnetwork.R
import com.thewyp.socialnetwork.presentation.components.StandardTextField
import com.thewyp.socialnetwork.presentation.ui.theme.SpaceLarge
import com.thewyp.socialnetwork.presentation.ui.theme.SpaceMedium
import com.thewyp.socialnetwork.presentation.util.Screen

@Composable
fun RegisterScreen(
    navController: NavController,
    viewModel: RegisterViewModel = viewModel()
) {
    Box(
        modifier = Modifier.fillMaxSize()
            .padding(
                start = SpaceLarge,
                end = SpaceLarge,
                top = SpaceLarge,
                bottom = 50.dp
            )
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxSize()
                .align(Alignment.Center)
        ) {
            Text(
                text = stringResource(R.string.register),
                style = MaterialTheme.typography.h1
            )
            Spacer(modifier = Modifier.height(SpaceMedium))
            StandardTextField(
                text = viewModel.emailText.value,
                hint = stringResource(R.string.email),
                keyboardType = KeyboardType.Email,
                onValueChange = {
                    viewModel.setEmailText(it)
                },
                error = viewModel.emailError.value
            )
            Spacer(modifier = Modifier.height(SpaceMedium))
            StandardTextField(
                text = viewModel.userNameText.value,
                hint = stringResource(R.string.username),
                keyboardType = KeyboardType.Text,
                onValueChange = {
                    viewModel.setUserNameText(it)
                },
                error = viewModel.userNameText.value
            )
            Spacer(modifier = Modifier.height(SpaceMedium))
            StandardTextField(
                text = viewModel.userPasswordText.value,
                hint = stringResource(R.string.password_hint),
                keyboardType = KeyboardType.Password,
                isPasswordVisible = viewModel.showPassword.value,
                onPasswordToggleClick = {
                    viewModel.setShowPassword(it)
                },
                onValueChange = {
                    viewModel.setUserPasswordText(it)
                },
                error = viewModel.passwordError.value
            )
            Spacer(modifier = Modifier.height(SpaceMedium))
            Button(
                onClick = {
                    navController.navigate(Screen.MainFeedScreen.route)
                },
                modifier = Modifier.align(Alignment.End)
            ) {
                Text(
                    text = stringResource(R.string.register),
                    color = MaterialTheme.colors.onPrimary
                )
            }
        }
        Text(
            text = buildAnnotatedString {
                append(stringResource(R.string.already_have_an_account))
                append(" ")
                val signUpText = stringResource(R.string.sign_in)
                withStyle(
                    style = SpanStyle(
                        color = MaterialTheme.colors.primary
                    )
                ) {
                    append(signUpText)
                }
            },
            style = MaterialTheme.typography.body1,
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .clickable {
                    navController.popBackStack()
                }
        )
    }
}