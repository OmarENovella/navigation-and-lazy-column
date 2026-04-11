package com.example.actividad4.products

import com.example.actividad4.R

class CategoryRepository {
    private val categoriesList = mutableListOf<CategoryModel>(
        CategoryModel("electronica", R.drawable.iphone17pro),
        CategoryModel("mobiliario", R.drawable._1hdtkcs8_l__ac_uf894_1000_ql80_),
    )

    fun getCategoriesList(): List<CategoryModel>{
        return categoriesList
    }
}