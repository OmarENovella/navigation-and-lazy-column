package com.example.actividad4.navigation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.actividad4.listview.ListView
import com.example.actividad4.products.ProductsGrid
import com.example.actividad4.products.ProductsRepository

@Composable
fun ProductsSiteView(navHostController: NavHostController, category: String) {

    val repository = ProductsRepository()
    var gridOrRow by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .systemBarsPadding(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Text("Grid")
            Spacer(Modifier.size(5.dp))
            Switch(
                checked = gridOrRow,
                onCheckedChange = { gridOrRow = it }
            )
        }

        if (gridOrRow) {
            ProductsGrid(repository, category)
        } else {
            ListView(
                productRep = repository,
                category = category
            )
        }
    }
}