package com.thewyp.socialnetwork.presentation.register

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import javax.inject.Inject

class RegisterViewModel @Inject constructor() : ViewModel() {

    private val _userNameText = mutableStateOf("")
    val userNameText = _userNameText

    private val _emailText = mutableStateOf("")
    val emailText = _emailText

    private val _userPasswordText = mutableStateOf("")
    val userPasswordText = _userPasswordText

    private val _showPassword = mutableStateOf(false)
    val showPassword = _showPassword

    private val _usernameError = mutableStateOf("")
    val usernameError: State<String> = _usernameError

    private val _emailError = mutableStateOf("")
    val emailError: State<String> = _emailError

    private val _passwordError = mutableStateOf("")
    val passwordError: State<String> = _passwordError

    fun setUserNameText(userName: String) {
        _userNameText.value = userName
    }

    fun setEmailText(email: String) {
        _emailText.value = email
    }

    fun setUserPasswordText(password: String) {
        _userPasswordText.value = password
    }

    fun setIsUsernameError(error: String) {
        _usernameError.value = error
    }

    fun setIsEmailError(error: String) {
        _usernameError.value = error
    }

    fun setIsPasswordError(error: String) {
        _passwordError.value = error
    }

    fun setShowPassword(showPassword: Boolean) {
        _showPassword.value = showPassword
    }
}