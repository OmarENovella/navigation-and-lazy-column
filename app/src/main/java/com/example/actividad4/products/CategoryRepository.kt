package com.example.actividad4.products

import com.example.actividad4.R

class CategoryRepository {
    private val categoriesList = mutableListOf<CategoryModel>(
        CategoryModel("electronica", R.drawable.iphone17pro),
        CategoryModel("mobiliario", R.drawable.bodega_hero_e1771515471596),
        CategoryModel("salud", R.drawable.myhf_homepage_hero),
        CategoryModel("automotriz", R.drawable.atti26)
    )

    fun getCategoriesList(): List<CategoryModel>{
        return categoriesList
    }
}