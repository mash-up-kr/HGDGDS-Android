package com.hgdgds.kokkok.navigation

import androidx.annotation.StringRes
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.sharp.Check
import androidx.compose.material.icons.sharp.Home
import androidx.compose.material.icons.sharp.Person
import androidx.compose.ui.graphics.vector.ImageVector
import com.hgdgds.home.navigation.Home
import com.hgdgds.home.navigation.HomeBase
import com.hgdgds.kokkok.R
import com.hgdgds.mypage.navigation.MyPage
import com.hgdgds.reserve.navigation.Reserve
import kotlin.reflect.KClass


enum class KokTopLevelDestination(
    val selectedIcon: ImageVector,
    val unselectedIcon: ImageVector,
    @StringRes val iconTextId: Int,
    val route: KClass<*>,
    val baseRoute: KClass<*> = route,
) {
    HOME(
        selectedIcon = Icons.Filled.Home,
        unselectedIcon = Icons.Sharp.Home,
        iconTextId = R.string.navigation_bar_home,
        route = Home::class,
        baseRoute = HomeBase::class,
    ),
    RESERVE(
        selectedIcon = Icons.Filled.Check,
        unselectedIcon = Icons.Sharp.Check,
        iconTextId = R.string.navigation_bar_reserve,
        route = Reserve::class,
    ),
    MY_PAGE(
        selectedIcon = Icons.Filled.Person,
        unselectedIcon = Icons.Sharp.Person,
        iconTextId = R.string.navigation_bar_my_page,
        route = MyPage::class,
    ),
}

