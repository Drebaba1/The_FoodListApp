package com.example.foodlistapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.foodlistapp.adapter.FoodlistAdapter
import com.example.foodlistapp.data.DataSource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val myDataset = DataSource().loadFood()

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.adapter = FoodlistAdapter(myDataset)

        recyclerView.setHasFixedSize(true)
    }
}
