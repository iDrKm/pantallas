package com.example.pantallas.ui.screen
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun AppNavegar(
    modifier: Modifier = Modifier,
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = "pantalla1",
        modifier = modifier
    ) {
        composable("pantalla1") {
            Pantalla1()
        }
        composable("pantalla2") {
            Pantalla2()
        }
        composable("pantalla3") {
            Pantalla3()
        }
    }
}