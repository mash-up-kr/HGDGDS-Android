package com.hgdgds.kokkok.presentation.reserve.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import com.hgdgds.kokkok.presentation.reserve.ReserveScreen
import kotlinx.serialization.Serializable

@Serializable
data object Reserve

fun NavController.navigateToReserve(navOptions: NavOptions) = navigate(route = Reserve, navOptions)

fun NavGraphBuilder.reserveSection() {
    composable<Reserve> {
        ReserveScreen()
    }
}
