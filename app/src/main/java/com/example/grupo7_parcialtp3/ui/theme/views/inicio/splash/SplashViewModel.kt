package com.example.grupo7_parcialtp3.ui.theme.views.inicio.splash

import androidx.lifecycle.ViewModel
import androidx.navigation.NavController
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashViewModel : ViewModel() {
    fun navigateToOnboarding(navController: NavController) {
        // Manejar logica de la view si es necesario
        viewModelScope.launch {
            delay(3000L)  // Espera 3 segundos
            navController.navigate("onboarding") {
                popUpTo("splash") { inclusive = true }
            }
        }
    }
}