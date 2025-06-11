package com.hgdgds.kokkok.presentation.upcoming.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptionsBuilder
import androidx.navigation.compose.composable
import androidx.navigation.toRoute
import com.hgdgds.kokkok.presentation.upcoming.UpcomingScreen
import kotlinx.serialization.Serializable

@Serializable
data class Upcoming(val reservationId: String)

fun NavController.navigateToUpcoming(
    reservationId: String,
    navOptions: NavOptionsBuilder.() -> Unit = {}
) {
    navigate(route = Upcoming(reservationId)) {
        navOptions()
    }
}

fun NavGraphBuilder.upcomingScreen() {
    composable<Upcoming> { entry ->
        val reservationId = entry.toRoute<Upcoming>().reservationId
        UpcomingScreen(
            reversionId = reservationId,
        )
    }
}
