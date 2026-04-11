package com.example.actividad4.products

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.actividad4.R
import com.example.actividad4.navigation.Products


@Composable
fun CategoryView(navHostController: NavHostController, categoryRepository: CategoryRepository){
    Card(
        colors = CardDefaults.cardColors(Color.White),
        modifier = Modifier.fillMaxWidth()
    ){
        Column(
            Modifier
                .fillMaxWidth()
                .background(Color.White)
        ) {
            LazyRow() {
                items(
                    items = categoryRepository.getCategoriesList()
                ) { product ->
                    generateCategoryView(navHostController, product.name, product.image)
                }
            }
        }
    }
}

@Composable
fun generateCategoryView(
    navHostController: NavHostController,
    name: String,
    @DrawableRes image: Int,
){
    Row(
        modifier = Modifier
            .clip(RoundedCornerShape(10.dp))
            .clickable(onClick = {
                navHostController.navigate(Products(category = name))
            })
    )
    {
        Column() {
            Row(
                modifier = Modifier
                .padding(10.dp),
                horizontalArrangement = Arrangement.Center
                ) {

                Text(name.uppercase())
            }
            Image(
                painter = painterResource(image),
                contentDescription = name,
                modifier = Modifier
                    .size(180.dp)
                    .align(Alignment.CenterHorizontally)
            )

        }
    }
}
