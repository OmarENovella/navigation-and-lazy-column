package com.example.actividad4.products

import androidx.annotation.DrawableRes

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.actividad4.R

@Composable
fun ProductView(product: ProductModel){
    Card(
        shape = RectangleShape,
        border = BorderStroke(1.dp, Color.LightGray),
        colors = CardDefaults.cardColors(Color.White),
        modifier = Modifier
            .fillMaxWidth()
            .heightIn(min= 140.dp)
    ) {

        Column(
            Modifier
                .fillMaxWidth()
                .background(Color.White)
        ) {
            RowGeneration(
                name = product.productName,
                sellerName = product.seller,
                starsRate = product.starsRate,
                cost = product.productCost,
                shippingCost = product.shippingCost,
                discountPercent = product.discountPercent,
                imageRoute = product.productImage
            )
        }

    }
}

@Composable
fun RowGeneration(
    name: String,
    sellerName: String,
    starsRate: Float,
    cost: Float,
    shippingCost: Float,
    discountPercent: Float,
    @DrawableRes imageRoute: Int
) {
    Row(modifier = Modifier.fillMaxWidth()) {
        Image(
            painter = painterResource(imageRoute),
            contentDescription = name,
            modifier = Modifier
                .size(120.dp)
                .align(Alignment.CenterVertically))

        Column(
            modifier = Modifier
                .weight(1f)
                //.fillMaxWidth()
                .padding(8.dp),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Spacer(Modifier.size(3.dp))
            Text(name, fontSize = 20.sp, maxLines = 2, overflow = TextOverflow.Ellipsis)
            Text("Por ${sellerName}", fontSize = 10.sp)

            Spacer(Modifier.size(10.dp))

            if (discountPercent > 0) {
                val costAfterDiscount = cost - (cost * (discountPercent / 100))

                Row {
                    Text(
                        "$ ${"%.2f".format(cost)}",
                        fontSize = 8.sp,
                        textDecoration = TextDecoration.LineThrough
                    )
                    Spacer(Modifier.size(8.dp))

                }

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        "$ ${"%.2f".format(costAfterDiscount)}",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    )

                    Text("${"%.0f".format(discountPercent)}% OFF",
                        fontSize = 15.sp,
                        color = Color.Green,
                        fontWeight = FontWeight.Bold
                    )

                    Text(
                        "${starsRate} ★",
                        fontSize = 12.sp,
                        modifier = Modifier.align(Alignment.CenterVertically)
                    )
                }
            } else {

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(
                        "$ ${"%.2f".format(cost)}",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        "${starsRate} ★",
                        fontSize = 12.sp,
                        modifier = Modifier.align(Alignment.CenterVertically)
                    )
                }
            }

            Spacer(Modifier.size(10.dp))

            if (shippingCost <= 0) {
                Text("Envio Gratis", fontSize = 12.sp)
            } else {
                Text("Costo de Envio: $${"%.2f".format(shippingCost)}", fontSize = 12.sp)
            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun ProductPreview(){
    val demoProduct = ProductModel(
        productImage = R.drawable.iphone17pro,
        productName = "iPhone 17 Pro Max",
        seller = "Apple",
        productCost = 35_000f,
        discountPercent = 25f,
        shippingCost = 0f
    )

    ProductView(demoProduct)
}