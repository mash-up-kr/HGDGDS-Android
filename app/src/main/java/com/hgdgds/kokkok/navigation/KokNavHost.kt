package com.hgdgds.kokkok.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import com.hgdgds.kokkok.mypage.navigation.myPageSection
import com.hgdgds.kokkok.presentation.home.navigation.HomeBase
import com.hgdgds.kokkok.presentation.home.navigation.homeSection
import com.hgdgds.kokkok.presentation.reserve.navigation.reserveSection
import com.hgdgds.kokkok.ui.KokAppState

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
        myPageSection()
    }
}
