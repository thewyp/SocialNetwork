package com.thewyp.socialnetwork.feature_auth.presentation.login

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import javax.inject.Inject

class LoginViewModel @Inject constructor() : ViewModel() {

    private val _userNameText = mutableStateOf("")
    val userNameText = _userNameText

    private val _userPasswordText = mutableStateOf("")
    val userPasswordText = _userPasswordText

    private val _showPassword = mutableStateOf(false)
    val showPassword = _showPassword

    private val _usernameError = mutableStateOf("")
    val usernameError: State<String> = _usernameError

    private val _passwordError = mutableStateOf("")
    val passwordError: State<String> = _passwordError

    fun setUserNameText(userName: String) {
        _userNameText.value = userName
    }

    fun setUserPasswordText(password: String) {
        _userPasswordText.value = password
    }

    fun setIsUsernameError(error: String) {
        _usernameError.value = error
    }

    fun setIsPasswordError(error: String) {
        _passwordError.value = error
    }

    fun setShowPassword(showPassword: Boolean) {
        _showPassword.value = showPassword
    }
}