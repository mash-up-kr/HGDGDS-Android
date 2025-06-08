package com.hgdgds.kokkok.ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.navigation.NavDestination
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navOptions
import com.hgdgds.home.navigation.navigateToHome
import com.hgdgds.kokkok.navigation.KokTopLevelDestination
import com.hgdgds.kokkok.navigation.KokTopLevelDestination.HOME
import com.hgdgds.kokkok.navigation.KokTopLevelDestination.MY_PAGE
import com.hgdgds.kokkok.navigation.KokTopLevelDestination.RESERVE
import com.hgdgds.mypage.navigation.navigateToMyPage
import com.hgdgds.reserve.navigation.navigateToReserve

@Composable
fun rememberKokAppState(
    navController: NavHostController = rememberNavController(),
): KokAppState {
    return remember(
        navController,
    ) {
        KokAppState(
            navController = navController,
        )
    }
}

@Stable
class KokAppState(
    val navController: NavHostController,
) {
    private val previousDestination = mutableStateOf<NavDestination?>(null)

    val currentDestination: NavDestination?
        @Composable get() {
            val currentEntry = navController.currentBackStackEntryFlow
                .collectAsState(initial = null)

            return currentEntry.value?.destination.also { destination ->
                if (destination != null) {
                    previousDestination.value = destination
                }
            } ?: previousDestination.value
        }

    val topLevelDestinations: List<KokTopLevelDestination> = KokTopLevelDestination.entries

    fun navigateToTopLevelDestination(topLevelDestination: KokTopLevelDestination) {
        val topLevelNavOptions = navOptions {
            popUpTo(navController.graph.findStartDestination().id) {
                saveState = true
            }
            launchSingleTop = true
            restoreState = true
        }

        when (topLevelDestination) {
            HOME -> navController.navigateToHome(topLevelNavOptions)
            RESERVE -> navController.navigateToReserve(topLevelNavOptions)
            MY_PAGE ->  navController.navigateToMyPage(topLevelNavOptions)
        }
    }
}
