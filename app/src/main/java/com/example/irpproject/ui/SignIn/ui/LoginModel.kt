package com.example.irpproject.ui.SignIn.ui

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class LoginModel : ViewModel() {

    var loginResult = mutableStateOf<LoginResult>(LoginResult.Idle)

    // Simulate a network request for login
    fun login(email: String, password: String) {
        loginResult.value = LoginResult.Loading

        // Simulate network delay
        viewModelScope.launch {
            // Simulate network delay
            delay(2000)
            // For simplicity, we'll assume a successful login if email and password are not empty
            if (email.isNotEmpty() && password.isNotEmpty()) {
                loginResult.value = LoginResult.Success("fake-token-123")
            } else {
                loginResult.value = LoginResult.Error("Invalid email or password")
            }
        }
    }

}

sealed class LoginResult {
    object Idle : LoginResult()
    object Loading : LoginResult()
    data class Success(val token: String) : LoginResult()
    data class Error(val message: String) : LoginResult()
}