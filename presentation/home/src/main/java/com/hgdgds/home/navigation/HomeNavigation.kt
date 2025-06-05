package com.hgdgds.home.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import kotlinx.serialization.Serializable

@Serializable
data object Home

@Serializable
data object HomeBase

fun NavController.navigateToHome(navOptions: NavOptions) = navigate(route = Home, navOptions)

fun NavGraphBuilder.homeSection(
) {
    navigation<HomeBase>(startDestination = Home) {
        composable<Home> { backStackEntry ->
            HomeScreen()
        }
    }
}
