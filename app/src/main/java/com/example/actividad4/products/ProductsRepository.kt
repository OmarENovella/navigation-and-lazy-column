package com.example.actividad4.products

import com.example.actividad4.R

class ProductsRepository {
<<<<<<< HEAD
    private val productsPerCategory = mapOf(
        "electronica" to listOf(
            ProductModel(
                productName = "iPhone 17 Pro Max",
                productCost = 40_550f,
=======

    private val productsPerCategory: Map<String, List<ProductModel>> = mapOf(

        "electronica" to listOf(
            ProductModel(
                productName = "iPhone 17 Pro Max",
                productCost = 40550f,
>>>>>>> 36d9921 (update: Primera version y respaldo de trabajo en actividad 4 (incompleta))
                seller = "Apple",
                shippingCost = 0f,
                discountPercent = 15f,
                starsRate = 4.3f,
                productImage = R.drawable.iphone17pro
<<<<<<< HEAD

            ),
            ProductModel(
                productName = "MacBook Air 13 pulgadas, M3 10-Core",
                productCost = 20_810f,
=======
            ),
            ProductModel(
                productName = "MacBook Air 13 pulgadas, M3 10-Core",
                productCost = 20810f,
>>>>>>> 36d9921 (update: Primera version y respaldo de trabajo en actividad 4 (incompleta))
                seller = "Apple",
                shippingCost = 0f,
                discountPercent = 10f,
                starsRate = 3.2f,
                productImage = R.drawable.macbook
<<<<<<< HEAD

            ),
        ),
=======
            )
        ),

>>>>>>> 36d9921 (update: Primera version y respaldo de trabajo en actividad 4 (incompleta))
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
<<<<<<< HEAD
                productImage = R.drawable.images,
=======
                productImage = R.drawable.comfy_chair,
>>>>>>> 36d9921 (update: Primera version y respaldo de trabajo en actividad 4 (incompleta))
                discountPercent = 0f,
                starsRate = 4f,
                shippingCost = 450f
            )
<<<<<<< HEAD
        )

    )

    fun getProductsPerCategory(category: String): List<ProductModel>{
=======
        ),

        "automotriz" to listOf(
            ProductModel(
                productName = "Aceite para motor Castrol Edge Syntec",
                productCost = 550f,
                seller = "AutoZone",
                shippingCost = 150f,
                discountPercent = 5f,
                starsRate = 4.5f,
                productImage = R.drawable.c5w50_syn_1_x1000
            ),
            ProductModel(
                productName = "Jeep Wagonner 3.0 Premium 4x4 2025",
                productCost = 1_988_900f,
                seller = "Jeep",
                shippingCost = 0f,
                discountPercent = 6f,
                starsRate = 4.5f,
                productImage = R.drawable.d_q_np_610111_mlm106726395460_022026_b
            ),
            ProductModel(
                productName = "Nissan Frontier 2.5 Doble Cabina 4x2 2025",
                productCost = 605_000f,
                seller = "Grupo WITT",
                shippingCost = 0f,
                discountPercent = 0f,
                starsRate = 0f,
                productImage = R.drawable.d_q_np_845304_mlm109371556688_042026_b
            ),
            ProductModel(
                productName = "Kia Sorento 2.5 SXL 2026",
                productCost = 988_900f,
                seller = "Premier Automotriz",
                shippingCost = 0f,
                discountPercent = 0f,
                starsRate = 4.5f,
                productImage = R.drawable.d_q_np_998938_mlm105025628855_012026_b
            ),
            ProductModel(
                productName = "Llanta 265/70r17 Scorpion All Terrain",
                productCost = 3290f,
                seller = "Car World Center",
                shippingCost = 0f,
                discountPercent = 6f,
                starsRate = 4.7f,
                productImage = R.drawable.d_q_np_897643_mla99338538956_112025_b
            )
        ),

        "salud" to listOf(
            ProductModel(
                productName = "Proteína Whey",
                productCost = 1200f,
                seller = "GNC",
                shippingCost = 0f,
                discountPercent = 10f,
                starsRate = 4.7f,
                productImage = R.drawable.macbook // cambia esto
            )
        )
    )

    fun getProductsPerCategory(category: String): List<ProductModel> {
>>>>>>> 36d9921 (update: Primera version y respaldo de trabajo en actividad 4 (incompleta))
        return productsPerCategory[category] ?: emptyList()
    }
}