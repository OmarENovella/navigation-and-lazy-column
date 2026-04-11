package com.example.actividad4.navigation

import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import kotlinx.serialization.Serializable

@Serializable
object CategoriesHome

@Serializable
data class Products(val category: String)

@Composable
fun NavManager(){
    val navController = rememberNavController()

    NavHost(navController,
        startDestination = CategoriesHome,
        modifier = Modifier.navigationBarsPadding()
    ){
        composable<CategoriesHome> {
            CategoriesHome(navController)
        }

        composable<Products> { backStackEntry ->
            val args = backStackEntry.toRoute<Products>()
            ProductsSiteView(navHostController = navController, category = args.category)
        }

    }
}