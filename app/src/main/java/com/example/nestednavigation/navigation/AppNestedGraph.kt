package com.example.nestednavigation.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.example.nestednavigation.screens.HomeScreen
import com.example.nestednavigation.screens.ScreenA
import com.example.nestednavigation.screens.ScreenB

fun NavGraphBuilder.appGraph(navController: NavHostController) {
	navigation(
		startDestination = Screens.ScreenHomeRoute.route,
		route = Screens.AppRoute.route
	) {
		composable(route = Screens.ScreenHomeRoute.route) {
			HomeScreen(navController)
		}
		composable(route = Screens.ScreenARoute.route) {
			ScreenA(navController)
		}
		composable(route = Screens.ScreenBRoute.route) {
			ScreenB(navController)
		}
	}
}
