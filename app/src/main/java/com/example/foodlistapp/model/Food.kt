package com.example.foodlistapp.model

import androidx.annotation.DrawableRes

data class Food(@DrawableRes val imageResourceId: Int, val name: String, val price: String)