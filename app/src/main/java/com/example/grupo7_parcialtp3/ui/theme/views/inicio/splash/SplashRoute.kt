package com.example.grupo7_parcialtp3.ui.theme.views.inicio.splash

import androidx.compose.material3.SnackbarHostState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavHostController

@Composable
fun SplashRoute(
    splashViewModel: SplashViewModel,
    navController: NavHostController,
    snackbarHostState: SnackbarHostState = remember { SnackbarHostState() }
) {
    // Inicia la navegación al onboarding
    splashViewModel.navigateToOnboarding(navController)

    // Renderiza el contenido de la pantalla de splash
    SplashScreen(navController)
}