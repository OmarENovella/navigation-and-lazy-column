package com.example.actividad4.products

data class ProductModel(
    val productImage: Int,
    val productName: String,
    val seller: String,
    val productCost: Float,
    val shippingCost: Float = 0f,
    val discountPercent: Float = 0f,
    val starsRate: Float = 0f
)