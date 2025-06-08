package com.hgdgds.kokkok.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import com.hgdgds.home.navigation.HomeBase
import com.hgdgds.home.navigation.homeSection
import com.hgdgds.kokkok.ui.KokAppState
import com.hgdgds.reserve.navigation.reserveSection

@Composable
fun KokNavHost(
    appState: KokAppState,
    modifier: Modifier = Modifier,
) {
    val navController = appState.navController
    NavHost(
        navController = navController,
        startDestination = HomeBase,
        modifier = modifier,
    ) {
        homeSection()
        reserveSection()
        // myPageSection()
    }
}
