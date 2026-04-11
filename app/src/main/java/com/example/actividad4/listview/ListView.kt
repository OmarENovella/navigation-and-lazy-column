package com.example.actividad4.listview

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.actividad4.products.ProductView
import com.example.actividad4.products.ProductsRepository

@Composable
fun ListView(productRep: ProductsRepository, category: String){

    Column(Modifier
        .fillMaxSize()
        //.verticalScroll(rememberScrollState())
    ) {
        LazyColumn {
            items(
                items = productRep.getProductsPerCategory(category)
            ) { product ->
                ProductView(product)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ListViewPreview(){
    val productVM = ProductsRepository()
    ListView(productVM, "electronica")
}