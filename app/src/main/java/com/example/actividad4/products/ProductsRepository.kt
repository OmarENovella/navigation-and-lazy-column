package com.example.actividad4.products

import com.example.actividad4.R

class ProductsRepository {
    private val productsPerCategory = mapOf(
        "electronica" to listOf(
            ProductModel(
                productName = "iPhone 17 Pro Max",
                productCost = 40_550f,
                seller = "Apple",
                shippingCost = 0f,
                discountPercent = 15f,
                starsRate = 4.3f,
                productImage = R.drawable.iphone17pro

            ),
            ProductModel(
                productName = "MacBook Air 13 pulgadas, M3 10-Core",
                productCost = 20_810f,
                seller = "Apple",
                shippingCost = 0f,
                discountPercent = 10f,
                starsRate = 3.2f,
                productImage = R.drawable.macbook

            ),
        ),
        "mobiliario" to listOf(
            ProductModel(
                productName = "Juego de Oficina color obsidiana",
                productCost = 14000f,
                seller = "Liverpool Oficial",
                productImage = R.drawable.diferencias_entre_el_mobiliario_de_oficina_y_el_mueble_de_oficina_min,
                discountPercent = 5f,
                starsRate = 4.8f,
                shippingCost = 2000f
            ),
            ProductModel(
                productName = "Silla de Bambu",
                productCost = 4500f,
                seller = "Foly Muebles",
                productImage = R.drawable.all_be_design_silla_cerro,
                discountPercent = 7f,
                starsRate = 3.4f,
                shippingCost = 0f
            ),
            ProductModel(
                productName = "Silla acolchonada gris de terciopelo",
                productCost = 7700f,
                seller = "Liverpool Oficial",
                productImage = R.drawable.images,
                discountPercent = 0f,
                starsRate = 4f,
                shippingCost = 450f
            )
        )

    )

    fun getProductsPerCategory(category: String): List<ProductModel>{
        return productsPerCategory[category] ?: emptyList()
    }
}