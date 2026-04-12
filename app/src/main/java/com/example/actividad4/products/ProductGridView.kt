package com.example.actividad4.products

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ProductsGrid(productRep: ProductsRepository, category: String) {

    val products = productRep.getProductsPerCategory(category)

    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        contentPadding = PaddingValues(12.dp),
        horizontalArrangement = Arrangement.spacedBy(12.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        items(products) { product ->
            ProductGridItem(product)
        }
    }
}

@Composable
fun ProductGridItem(product: ProductModel) {

    Card(
        shape = RoundedCornerShape(8.dp),
        border = BorderStroke(1.dp, Color.LightGray),
        colors = CardDefaults.cardColors(Color.White),
        modifier = Modifier
            .fillMaxWidth()
            .height(260.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp),
            verticalArrangement = Arrangement.SpaceBetween
        ) {

            // 🔹 Imagen
            Image(
                painter = painterResource(product.productImage),
                contentDescription = product.productName,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(120.dp)
            )

            // 🔹 Info principal
            Column {
                Text(
                    product.productName,
                    fontSize = 14.sp,
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis
                )

                Text("Por ${product.seller}", fontSize = 10.sp)
            }

            // 🔹 Precio
            Column {
                if (product.discountPercent > 0) {

                    val costAfterDiscount =
                        product.productCost - (product.productCost * (product.discountPercent / 100))

                    Text(
                        "$ ${"%.2f".format(product.productCost)}",
                        fontSize = 8.sp,
                        textDecoration = TextDecoration.LineThrough
                    )

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            "$ ${"%.2f".format(costAfterDiscount)}",
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold
                        )

                        Text(
                            "${"%.0f".format(product.discountPercent)}% OFF",
                            fontSize = 12.sp,
                            color = Color.Green,
                            fontWeight = FontWeight.Bold
                        )
                    }

                } else {
                    Text(
                        "$ ${"%.2f".format(product.productCost)}",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
            }

            Column {
                Text(
                    "${product.starsRate} ★",
                    fontSize = 12.sp,
                )

                if (product.shippingCost <= 0) {
                    Text("Envio Gratis", fontSize = 12.sp)
                } else {
                    Text(
                        "Costo de Envio: $${"%.2f".format(product.shippingCost)}",
                        fontSize = 12.sp
                    )
                }
            }
        }
    }
}
