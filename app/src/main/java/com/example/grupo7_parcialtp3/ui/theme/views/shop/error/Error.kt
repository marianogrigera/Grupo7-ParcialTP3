package com.example.grupo7_parcialtp3.ui.theme.views.shop.error

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

@Composable
fun ErrorScreen(navController: NavController) {
    //COMPLETAR VISTA
}

@Preview(showBackground = true)
@Composable
fun ErrorScreenView() {
    val navController = rememberNavController()
    ErrorScreen(navController)
}