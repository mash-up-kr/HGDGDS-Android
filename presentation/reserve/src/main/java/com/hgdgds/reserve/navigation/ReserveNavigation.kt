package com.hgdgds.reserve.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.hgdgds.reserve.ReserveScreen
import kotlinx.serialization.Serializable

@Serializable
data object Reserve

@Serializable
data object ReserveBase

fun NavController.navigateToReserve(navOptions: NavOptions) = navigate(route = Reserve, navOptions)

fun NavGraphBuilder.reserveSection() {
    navigation<ReserveBase>(startDestination = Reserve) {
        composable<Reserve> {
            ReserveScreen()
        }
    }
}
