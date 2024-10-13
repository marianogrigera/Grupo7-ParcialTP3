package com.example.grupo7_parcialtp3.navigation

import androidx.compose.material3.SnackbarHostState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavHostController
import com.example.grupo7_parcialtp3.ui.theme.capas.signup.SignUpScreen

@Composable
fun SignUpRoute(
    navController: NavHostController,
    snackbarHostState: SnackbarHostState = remember { SnackbarHostState() }
) {
    // Aquí podrías usar un ViewModel si necesitas manejar estado
    SignUpScreen(navController)
}