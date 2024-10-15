package com.example.grupo7_parcialtp3.ui.theme.views.inicio.location

import androidx.compose.material3.SnackbarHostState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavHostController
import com.example.grupo7_parcialtp3.ui.theme.capas.selectlocation.SelectLocationScreen

@Composable
fun SelectLocationRoute(
    navController: NavHostController,
    snackbarHostState: SnackbarHostState = remember { SnackbarHostState() }
) {
    // Manejar viewModel aca si es necesario
    SelectLocationScreen(navController)
}