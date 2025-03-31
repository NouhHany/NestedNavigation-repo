package com.example.nestednavigation.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.example.nestednavigation.screens.ForgetPasswordScreen
import com.example.nestednavigation.screens.LoginScreen
import com.example.nestednavigation.screens.RegisterScreen

fun NavGraphBuilder.authGraph(navController: NavHostController) {
	navigation(
		startDestination = Screens.ScreenLoginRoute.route,
		route = Screens.AuthRoute.route
	) {
		composable(route = Screens.ScreenLoginRoute.route) {
			LoginScreen(navController = navController)
		}
		composable(route = Screens.ScreenRegisterRoute.route) {
			RegisterScreen(navController)
		}
		composable(route = Screens.ScreenForgetPasswordRoute.route) {
			ForgetPasswordScreen(navController)
		}
	}
}
