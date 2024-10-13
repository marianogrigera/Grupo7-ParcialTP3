package com.example.grupo7_parcialtp3

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.grupo7_parcialtp3.navigation.OnboardingRoute
import com.example.grupo7_parcialtp3.navigation.SignInRoute
import com.example.grupo7_parcialtp3.navigation.SignUpRoute
import com.example.grupo7_parcialtp3.ui.theme.views.inicio.splash.SplashScreen



@Composable
fun MainRouteNavGraph(
    navController: NavHostController,
    viewModel: MainActivityViewModel,
) {
    NavHost(navController = navController, startDestination = AppDestinations.SPLASH_ROUTE) {
        composable(AppDestinations.SPLASH_ROUTE) { SplashScreen(navController) }
        composable(AppDestinations.ONBOARDING_ROUTE) { OnboardingRoute(navController) }
        composable(AppDestinations.SIGNIN_ROUTE) { SignInRoute(navController) }
        composable(AppDestinations.SIGNUP_ROUTE) { SignUpRoute(navController) }
        // Agrega más rutas según sea necesario
    }
}