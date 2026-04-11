package com.example.actividad4.navigation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.example.actividad4.listview.ListView
import com.example.actividad4.products.ProductsRepository

@Composable
fun ProductsSiteView(navHostController: NavHostController, category: String){
    val repository = ProductsRepository()
    Column(
        modifier = Modifier
            .fillMaxSize()
            .systemBarsPadding()
    ) {
        ListView(
            productRep = repository,
            category = category
        )
    }

}