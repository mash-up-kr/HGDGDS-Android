package com.hgdgds.kokkok.presentation.home.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.hgdgds.kokkok.presentation.home.HomeScreen
import kotlinx.serialization.Serializable

@Serializable
data object Home

@Serializable
data object HomeBase

fun NavController.navigateToHome(navOptions: NavOptions) = navigate(route = Home, navOptions)

fun NavGraphBuilder.homeSection() {
    navigation<HomeBase>(startDestination = Home) {
        composable<Home> {
            HomeScreen()
        }
    }
}
