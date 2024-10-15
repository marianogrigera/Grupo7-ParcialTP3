package com.example.grupo7_parcialtp3

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.grupo7_parcialtp3.navigation.AccountRoute
import com.example.grupo7_parcialtp3.navigation.HomeViewRoute
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
        composable(AppDestinations.HOME_ROUTE) { HomeViewRoute(navController) }
        composable(AppDestinations.ACCOUNT_ROUTE) { AccountRoute(navController) }
        composable(AppDestinations.DETAIL_ROUTE) { AccountRoute(navController) }
        composable(AppDestinations.CATEGORIES_ROUTE) { AccountRoute(navController) }
        composable(AppDestinations.CHECKOUT_ROUTE) { AccountRoute(navController) }
        composable(AppDestinations.ERROR_ROUTE) { AccountRoute(navController) }
        composable(AppDestinations.EXPLORE_ROUTE) { AccountRoute(navController) }
        composable(AppDestinations.FILTER_ROUTE) { AccountRoute(navController) }
        composable(AppDestinations.FAVOURITES_ROUTE) { AccountRoute(navController) }
        composable(AppDestinations.SEARCH_ROUTE) { AccountRoute(navController) }
        composable(AppDestinations.MYCART_ROUTE) { AccountRoute(navController) }
        composable(AppDestinations.ORDERACCEPTED_ROUTE) { AccountRoute(navController) }
        composable(AppDestinations.PRODUCTDETAIL_ROUTE) { AccountRoute(navController) }
    }
}