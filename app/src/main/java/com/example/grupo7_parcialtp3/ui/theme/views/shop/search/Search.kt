package com.example.grupo7_parcialtp3.ui.theme.views.shop.search

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.grupo7_parcialtp3.ui.theme.views.signin.SignInViewModel

@Composable
fun SearchScreen(navController: NavController) {
    //COMPLETAR VISTA
}

@Preview(showBackground = true)
@Composable
fun SearchScreenView() {
    val navController = rememberNavController()
    SearchScreen(navController)
}