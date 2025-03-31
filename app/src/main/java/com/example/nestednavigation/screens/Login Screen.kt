package com.example.nestednavigation.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.nestednavigation.navigation.Screens

@Composable
fun LoginScreen(navController: NavHostController) {
	Column(
		modifier = Modifier.fillMaxSize(),
		verticalArrangement = Arrangement.Center,
		horizontalAlignment = Alignment.CenterHorizontally
	) {
		Text(text = "Login Screen", fontSize = 40.sp)
		Spacer(modifier = Modifier.height(40.dp))
		Button(onClick = {
			navController.navigate(route = Screens.ScreenHomeRoute.route)
		}) {
			Text(text = "Login(Go to home", fontSize = 25.sp)
		}
		Spacer(modifier = Modifier.height(40.dp))
		Button(onClick = {
			navController.navigate(route = Screens.ScreenForgetPasswordRoute.route)
		}) {
			Text(text = "Forgot Password", fontSize = 25.sp)
		}
		Spacer(modifier = Modifier.height(40.dp))
		Button(onClick = {
			navController.navigate(route = Screens.ScreenRegisterRoute.route)
		}) {
			Text(text = "Register", fontSize = 25.sp)
		}
	}
}
