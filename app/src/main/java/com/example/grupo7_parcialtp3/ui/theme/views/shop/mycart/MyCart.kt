package com.example.grupo7_parcialtp3.ui.theme.views.shop.mycart

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.grupo7_parcialtp3.ui.theme.components.bottomNavBar.BottomNavbar

@Composable
fun MyCartScreen(navController: NavController) {
    //COMPLETAR VISTA
    var selectedRoute by remember { mutableStateOf("mycart") }

    Scaffold(
        bottomBar = {
            BottomNavbar(
                selectedRoute = "mycart",
                onItemSelected = { route ->
                    selectedRoute = route
                    navController.navigate(route) {
                        launchSingleTop = true
                        restoreState = true
                    }
                }
            )
        }
    ) { paddingValues ->
        Box(modifier = Modifier.padding(paddingValues)) {
            // Completar aca la vista
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MyCartScreenView() {
    val navController = rememberNavController()
    MyCartScreen(navController)
}