package com.task.composebottomnavigation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.task.composebottomnavigation.ui.screen.NavigationScreen

@Composable
fun BottomNavigationGraph(navController: NavHostController) {

    NavHost(navController = navController, startDestination = BottomNavigationItem.Home.route) {
        composable(BottomNavigationItem.Home.route) {
            NavigationScreen(BottomNavigationItem.Home.title)
        }
        composable(BottomNavigationItem.Profile.route) {
            NavigationScreen(BottomNavigationItem.Profile.title)
        }
        composable(BottomNavigationItem.Search.route) {
            NavigationScreen(BottomNavigationItem.Search.title)
        }
        composable(BottomNavigationItem.Favorite.route) {
            NavigationScreen(BottomNavigationItem.Favorite.title)
        }
    }
}
