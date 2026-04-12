package com.example.actividad4.listview

import androidx.compose.foundation.layout.Column
<<<<<<< HEAD
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
=======
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
>>>>>>> 36d9921 (update: Primera version y respaldo de trabajo en actividad 4 (incompleta))
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
<<<<<<< HEAD
=======
                Spacer(modifier = Modifier.height(8.dp))
>>>>>>> 36d9921 (update: Primera version y respaldo de trabajo en actividad 4 (incompleta))
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