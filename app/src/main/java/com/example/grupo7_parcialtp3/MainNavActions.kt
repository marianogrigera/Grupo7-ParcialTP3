package com.example.grupo7_parcialtp3

import androidx.navigation.NavHostController
import kotlinx.coroutines.CoroutineScope

object AppDestinations {
    const val SPLASH_ROUTE = "splash"
    const val ONBOARDING_ROUTE = "onboarding"
    const val SIGNIN_ROUTE = "signin"
    const val SIGNUP_ROUTE = "signup"
    const val HOME_ROUTE = "home"
    const val ACCOUNT_ROUTE = "account"
    const val DETAIL_ROUTE = "detail"
    const val CATEGORIES_ROUTE = "categories"
    const val CHECKOUT_ROUTE = "checkout"
    const val ERROR_ROUTE = "error"
    const val EXPLORE_ROUTE = "explore"
    const val FILTER_ROUTE = "filter"
    const val FAVOURITES_ROUTE = "favourites"
    const val SEARCH_ROUTE = "search"
    const val MYCART_ROUTE = "mycart"
    const val ORDERACCEPTED_ROUTE = "orderaccepted"
    const val PRODUCTDETAIL_ROUTE = "productdetail"

}

class MainNavActions(
    private val navController: NavHostController,
    private val scope: CoroutineScope
) {
    val navigateToSignIn: () -> Unit = {
        navController.navigate(AppDestinations.SIGNIN_ROUTE)
    }

    val navigateToWelcome: () -> Unit = {
        navController.navigate(AppDestinations.ONBOARDING_ROUTE)
    }

    val navigateToSignUp: () -> Unit = {
        navController.navigate(AppDestinations.SIGNUP_ROUTE)
    }

    val navigateToHome: () -> Unit = {
        navController.navigate(AppDestinations.HOME_ROUTE)
    }

    val navigateToAccount: () -> Unit = {
        navController.navigate(AppDestinations.ACCOUNT_ROUTE)
    }

    val navigateToDetail: () -> Unit = {
        navController.navigate(AppDestinations.DETAIL_ROUTE)
    }

    val navigateToCategories: () -> Unit = {
        navController.navigate(AppDestinations.CATEGORIES_ROUTE)
    }

    val navigateToCheckout: () -> Unit = {
        navController.navigate(AppDestinations.CHECKOUT_ROUTE)
    }

    val navigateToError: () -> Unit = {
        navController.navigate(AppDestinations.ERROR_ROUTE)
    }

    val navigateToExplore: () -> Unit = {
        navController.navigate(AppDestinations.EXPLORE_ROUTE)
    }

    val navigateToFilter: () -> Unit = {
        navController.navigate(AppDestinations.FILTER_ROUTE)
    }

    val navigateToFavourites: () -> Unit = {
        navController.navigate(AppDestinations.FAVOURITES_ROUTE)
    }

    val navigateToSearch: () -> Unit = {
        navController.navigate(AppDestinations.SEARCH_ROUTE)
    }

    val navigateToMyCart: () -> Unit = {
        navController.navigate(AppDestinations.MYCART_ROUTE)
    }

    val navigateToOrderAccepted: () -> Unit = {
        navController.navigate(AppDestinations.ORDERACCEPTED_ROUTE)
    }

    val navigateToProductDetail: () -> Unit = {
        navController.navigate(AppDestinations.PRODUCTDETAIL_ROUTE)
    }
}