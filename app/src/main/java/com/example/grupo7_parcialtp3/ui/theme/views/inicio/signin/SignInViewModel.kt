package com.example.grupo7_parcialtp3.ui.theme.views.signin

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.grupo7_parcialtp3.ui.theme.data.RetrofitService
import com.example.grupo7_parcialtp3.ui.theme.data.model.LoginRequest
import com.example.grupo7_parcialtp3.ui.theme.data.model.LoginResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class SignInViewModel : ViewModel() {

    private val service = RetrofitService.RetrofitServiceFactory.makeRetrofitService()

    private val _loginResponse = MutableLiveData<LoginResponse>()
    val loginResponse: LiveData<LoginResponse> get() = _loginResponse

    private val _loginError = MutableLiveData<String>()
    val loginError: LiveData<String> get() = _loginError

    fun login(username: String, password: String) {
        viewModelScope.launch(Dispatchers.IO) {
            try {
                val loginRequest = LoginRequest(username, password)
                println(username + "  /  " + password);
                val response = service.login(loginRequest)
                _loginResponse.postValue(response)

            } catch (e: Exception) {
                _loginError.postValue("Error al autenticar: ${e.message}")
            }
        }
    }
}