package com.example.grupo7_parcialtp3

import androidx.navigation.NavHostController
import kotlinx.coroutines.CoroutineScope

object AppDestinations {
    const val SPLASH_ROUTE = "splash"
    const val ONBOARDING_ROUTE = "onboarding"
    const val SIGNIN_ROUTE = "signin"
    const val SIGNUP_ROUTE = "signup"
    const val HOME_ROUTE = "home"
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


}