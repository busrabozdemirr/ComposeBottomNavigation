package com.task.composebottomnavigation.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.ui.graphics.vector.ImageVector
import com.task.composebottomnavigation.util.BottomNavRoute.FAVORITE
import com.task.composebottomnavigation.util.BottomNavRoute.HOME
import com.task.composebottomnavigation.util.BottomNavRoute.PROFILE
import com.task.composebottomnavigation.util.BottomNavRoute.SEARCH

sealed class BottomNavigationItem(var title: String, var icon: ImageVector, var route: String) {

    object Home : BottomNavigationItem(title = "Home", icon = Icons.Filled.Home, route = HOME)
    object Favorite :
        BottomNavigationItem(title = "Favorite", icon = Icons.Filled.Favorite, route = FAVORITE)

    object Search :
        BottomNavigationItem(title = "Search", icon = Icons.Filled.Search, route = SEARCH)

    object Profile :
        BottomNavigationItem(title = "Profile", icon = Icons.Filled.Search, route = PROFILE)
}