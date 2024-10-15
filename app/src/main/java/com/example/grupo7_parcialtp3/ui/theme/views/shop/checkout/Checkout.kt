package com.example.grupo7_parcialtp3.ui.theme.views.shop.checkout

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun CheckoutScreen(navController: NavController) {
    //COMPLETAR VISTA
}

@Preview(showBackground = true)
@Composable
fun CheckoutScreenView() {
    val navController = rememberNavController()
    CheckoutScreen(navController)
}