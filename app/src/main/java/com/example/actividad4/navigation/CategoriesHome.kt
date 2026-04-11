package com.example.actividad4.navigation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.example.actividad4.products.CategoryRepository
import com.example.actividad4.products.CategoryView

@Composable
fun CategoriesHome(navHostController: NavHostController){
    val categoriesRepo = CategoryRepository()
    Column(
        modifier = Modifier
            .fillMaxSize()
            .systemBarsPadding(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
        ){
        CategoryView(navHostController, categoriesRepo)
    }

}