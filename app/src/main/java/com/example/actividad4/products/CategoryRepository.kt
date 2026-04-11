package com.example.actividad4.products

import com.example.actividad4.R

class CategoryRepository {
    private val categoriesList = mutableListOf<CategoryModel>(
        CategoryModel("electronica", R.drawable.iphone17pro),
<<<<<<< HEAD
        CategoryModel("mobiliario", R.drawable._1hdtkcs8_l__ac_uf894_1000_ql80_),
=======
        CategoryModel("mobiliario", R.drawable.bodega_hero_e1771515471596),
        CategoryModel("salud", R.drawable.myhf_homepage_hero),
        CategoryModel("automotriz", R.drawable.atti26)
>>>>>>> 36d9921 (update: Primera version y respaldo de trabajo en actividad 4 (incompleta))
    )

    fun getCategoriesList(): List<CategoryModel>{
        return categoriesList
    }
}