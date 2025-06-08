package com.hgdgds.kokkok.mypage.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import com.hgdgds.kokkok.mypage.MyPageScreen
import kotlinx.serialization.Serializable

@Serializable
data object MyPage

fun NavController.navigateToMyPage(navOptions: NavOptions) = navigate(route = MyPage, navOptions)

fun NavGraphBuilder.myPageSection() {
    composable<MyPage> {
        MyPageScreen()
    }
}
