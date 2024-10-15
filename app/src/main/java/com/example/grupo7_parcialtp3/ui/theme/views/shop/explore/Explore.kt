package com.example.grupo7_parcialtp3.ui.theme.views.shop.explore

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun ExploreScreen(navController: NavController) {
    //COMPLETAR VISTA
}

@Preview(showBackground = true)
@Composable
fun ExploreScreenView() {
    val navController = rememberNavController()
    ExploreScreen(navController)
}