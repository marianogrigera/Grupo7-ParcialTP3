package com.example.grupo7_parcialtp3.navigation

import androidx.compose.material3.SnackbarHostState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavHostController
import com.example.grupo7_parcialtp3.ui.theme.views.shop.checkout.CheckoutScreen
import com.example.grupo7_parcialtp3.ui.theme.views.shop.error.ErrorScreen

@Composable
fun ErrorRoute(
    navController: NavHostController,
    snackbarHostState: SnackbarHostState = remember { SnackbarHostState() }
) {
    // Aquí podrías usar un ViewModel si necesitas manejar estado
    ErrorScreen(navController)
}