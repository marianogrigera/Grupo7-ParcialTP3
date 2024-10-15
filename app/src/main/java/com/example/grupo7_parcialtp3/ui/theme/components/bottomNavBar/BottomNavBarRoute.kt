package com.example.grupo7_parcialtp3.ui.theme.components.bottomNavBar

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.grupo7_parcialtp3.AppDestinations


@Composable
fun NavbarRoute(navController: NavHostController) {
    val viewModel: NavbarViewModel = viewModel()
    Scaffold(
        bottomBar = {
            BottomNavbar(
                selectedRoute = viewModel.selectedTab,
                onItemSelected = { route ->
                    viewModel.onTabSelected(route)
                    navController.navigate(route) {
                        // Evita duplicados de la misma ruta en la pila de navegación
                        popUpTo(AppDestinations.HOME_ROUTE) { saveState = true }
                        launchSingleTop = true
                        restoreState = true
                    }
                }
            )
        }
    ) { paddingValues ->
        Box(modifier = Modifier.padding(paddingValues)) {
            // Aquí no necesitas otro NavHost. La navegación ya está gestionada en MainRouteNavGraph
            // Si necesitas mostrar el contenido específico basado en la ruta actual,
            // asegúrate de hacerlo en MainRouteNavGraph en lugar de aquí.
        }
    }
}

