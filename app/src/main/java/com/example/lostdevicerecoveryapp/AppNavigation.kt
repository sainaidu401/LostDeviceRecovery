package com.example.lostdevicerecoveryapp

import AuthViewModel
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.lostdevicerecoveryapp.screen.AppScreen
import com.example.lostdevicerecoveryapp.screen.Home
import com.example.lostdevicerecoveryapp.screen.LoginPage
import com.example.lostdevicerecoveryapp.screen.SignupPage

@Composable
fun AppNavigation(modifier: Modifier = Modifier,authViewModel: AuthViewModel) {
    val navController = rememberNavController()

    NavHost(navController =navController , startDestination = "landing" , modifier = modifier , builder = {
        composable(route = "landing") {
            Home(modifier , navController)
        }
        composable(route = "login") {
            LoginPage(modifier, navController ,authViewModel)
        }
        composable(route = "signup") {
            SignupPage(modifier, navController ,authViewModel)
        }
        composable(route = "Screen") {
            AppScreen(navController, authViewModel)
        }

    })

}
