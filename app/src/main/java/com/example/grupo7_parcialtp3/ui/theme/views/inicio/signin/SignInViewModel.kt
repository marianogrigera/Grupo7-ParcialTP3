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
    // Manejar logica de la view si es necesario
    private val service = RetrofitService.RetrofitServiceFactory.makeRetrofitService()

    private val _loginResponse = MutableLiveData<LoginResponse>()
    val loginResponse: LiveData<LoginResponse> get() = _loginResponse

    private val _loginError = MutableLiveData<String>()
    val loginError: LiveData<String> get() = _loginError


    fun login(email: String, password: String) {
        viewModelScope.launch(Dispatchers.IO) {
            try {
                val users = service.getAllUsers()
                val userFound = users.find{ it.email == email && it.password == password }


                if(userFound != null) {
                    val loginRequest = LoginRequest(userFound.username, userFound.password)
                    val response = service.login(loginRequest)
                    _loginResponse.postValue(response)
                }else {
                    _loginError.postValue("Credenciales incorrectas")
                }

            } catch (e: Exception) {
                _loginError.postValue("Error al autenticar: ${e.message}")
            }
        }
    }
}

