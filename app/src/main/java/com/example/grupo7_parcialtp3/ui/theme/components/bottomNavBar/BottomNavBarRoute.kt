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


@Composable
fun NavbarRoute(navController: NavHostController) {
    val viewModel: NavbarViewModel = viewModel()
    Scaffold(
        bottomBar = {
            BottomNavbar(
                selectedRoute = viewModel.selectedTab,
                onItemSelected = { route ->
                    viewModel.onTabSelected(route)
                    navController.navigate(route)
                }
            )
        }
    ) { paddingValues ->
        Box(modifier = Modifier.padding(paddingValues)) {
            NavHost(
                navController = navController,
                startDestination = "shop"
            ) {
                composable("shop") { navController.navigate("home") }
                composable("account") { navController.navigate("account") }
                /*composable("explore") { ExploreScreen() }
            composable("cart") { CartScreen() }
            composable("favourite") { FavouriteScreen() }
            composable("account") { AccountScreen() }*/
            }
        }
    }
}

