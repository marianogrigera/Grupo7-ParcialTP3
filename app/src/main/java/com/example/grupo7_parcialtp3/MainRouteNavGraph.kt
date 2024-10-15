package com.example.grupo7_parcialtp3

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.grupo7_parcialtp3.navigation.AccountRoute
import com.example.grupo7_parcialtp3.navigation.CategoriesRoute
import com.example.grupo7_parcialtp3.navigation.CheckoutRoute
import com.example.grupo7_parcialtp3.navigation.ErrorRoute
import com.example.grupo7_parcialtp3.navigation.ExploreRoute
import com.example.grupo7_parcialtp3.navigation.FavouriteRoute
import com.example.grupo7_parcialtp3.navigation.FilterRoute
import com.example.grupo7_parcialtp3.navigation.HomeViewRoute
import com.example.grupo7_parcialtp3.navigation.MyCartRoute
import com.example.grupo7_parcialtp3.navigation.OnboardingRoute
import com.example.grupo7_parcialtp3.navigation.OrderAccRoute
import com.example.grupo7_parcialtp3.navigation.ProductDetailRoute
import com.example.grupo7_parcialtp3.navigation.SearchRoute
import com.example.grupo7_parcialtp3.navigation.SignInRoute
import com.example.grupo7_parcialtp3.navigation.SignUpRoute
import com.example.grupo7_parcialtp3.ui.theme.components.bottomNavBar.NavbarRoute
import com.example.grupo7_parcialtp3.ui.theme.views.inicio.location.SelectLocationRoute
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
        composable(AppDestinations.DETAIL_ROUTE) { ProductDetailRoute(navController) }
        composable(AppDestinations.CATEGORIES_ROUTE) { CategoriesRoute(navController) }
        composable(AppDestinations.CHECKOUT_ROUTE) { CheckoutRoute(navController) }
        composable(AppDestinations.ERROR_ROUTE) { ErrorRoute(navController) }
        composable(AppDestinations.EXPLORE_ROUTE) { ExploreRoute(navController) }
        composable(AppDestinations.FILTER_ROUTE) { FilterRoute(navController) }
        composable(AppDestinations.FAVOURITES_ROUTE) { FavouriteRoute(navController) }
        composable(AppDestinations.SEARCH_ROUTE) { SearchRoute(navController) }
        composable(AppDestinations.MYCART_ROUTE) { MyCartRoute(navController) }
        composable(AppDestinations.ORDERACCEPTED_ROUTE) { OrderAccRoute(navController) }
        composable(AppDestinations.PRODUCTDETAIL_ROUTE) { ProductDetailRoute(navController) }
        composable(AppDestinations.LOCATION_ROUTE) { SelectLocationRoute(navController) }
    }
}