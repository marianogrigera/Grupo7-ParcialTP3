package com.example.grupo7_parcialtp3.ui.theme.views.inicio.splash

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.grupo7_parcialtp3.R

@Composable
fun SplashScreen(navController: NavController) {
    val viewModel = remember { SplashViewModel() }
    viewModel.navigateToOnboarding(navController)

    SplashScreenContent(navController)
}

@Composable
fun SplashScreenContent(navController: NavController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF53B175)),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_nectar),
                contentDescription = "Logo",
                modifier = Modifier.size(width = 267.5.dp, height = 68.5.dp)
            )

        }
    }

}

@Preview(showBackground = true)
@Composable
fun SplashScreenContent() {
    val navController = rememberNavController()
    SplashScreenContent(navController)
}