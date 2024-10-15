package com.example.grupo7_parcialtp3.ui.theme.views.shop.mycart

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.grupo7_parcialtp3.ui.theme.capas.screens.MyCartScreen

@Composable
fun MyCartScreen(navController: NavController) {
    //COMPLETAR VISTA
}

@Preview(showBackground = true)
@Composable
fun MyCartScreenView() {
    val navController = rememberNavController()
    MyCartScreen(navController)
}