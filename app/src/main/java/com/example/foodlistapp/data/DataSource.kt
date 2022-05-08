package com.example.foodlistapp.data

import com.example.foodlistapp.R
import com.example.foodlistapp.model.Food

class DataSource {

    fun loadFood(): List<Food> {
        return listOf<Food>(

            Food(R.drawable.food11, "Nigerian Special Bread with Beans", "$99.99"),
            Food(R.drawable.food15, "Nigerian Jollof with chicken", "$89.99"),
            Food(R.drawable.food5, "Roasted Chicken", "$20.99"),
            Food(R.drawable.food4, "Shawarma", "$12.99"),
            Food(R.drawable.food3, "Waffles", "$9.99"),
            Food(R.drawable.food6, "Sandwich", "$18.99"),
            Food(R.drawable.food7, "Hamburger", "$5.99"),
            Food(R.drawable.food8, "Parrilla Mixta", "$14.99"),
            Food(R.drawable.food9, "Pizza", "$10.99"),
            Food(R.drawable.food10, "Steak and Potatoes", "$6.99"),
            Food(R.drawable.food2, "Sushi", "$11.99"),
            Food(R.drawable.food14, "Garri with Okro Soup", "$49.99"),
            Food(R.drawable.food13, "Fufu with Egusi Soup", "$59.99"),
            Food(R.drawable.food12, "Amala with Ewedu", "$69.99"),

            )
    }
}


