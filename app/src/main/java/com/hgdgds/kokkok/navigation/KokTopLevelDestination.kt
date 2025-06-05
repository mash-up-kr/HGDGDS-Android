package com.hgdgds.kokkok.navigation

import androidx.annotation.StringRes
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.sharp.Home
import androidx.compose.ui.graphics.vector.ImageVector
import com.hgdgds.home.navigation.Home
import com.hgdgds.home.navigation.HomeBase
import com.hgdgds.kokkok.R
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
        iconTextId = R.string.app_name,
        route = Home::class,
        baseRoute = HomeBase::class,
    ),
    //    RESERVE(
    //        selectedIcon = Icons.Filled.Check,
    //        unselectedIcon = Icons.Sharp.Check,
    //        route = ReserveRoute::class,
    //    ),
    //    MY_PAGE(
    //        selectedIcon = Icons.Filled.Person,
    //        unselectedIcon = Icons.Sharp.Person,
    //        route = MyPageRoute::class,
    //    ),
}

