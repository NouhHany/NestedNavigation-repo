package com.example.nestednavigation.navigation

sealed class Screens(val route: String) {
	object ScreenLoginRoute: Screens(route = "Login")
	object ScreenForgetPasswordRoute: Screens(route = "ForgetPassword")
	object ScreenRegisterRoute: Screens(route = "Register")
	object ScreenHomeRoute: Screens(route = "Home")
	object ScreenBRoute: Screens(route = "B")
	object ScreenARoute: Screens(route = "A")
	object AuthRoute: Screens(route = "Auth")
	object AppRoute: Screens(route = "App")
}
