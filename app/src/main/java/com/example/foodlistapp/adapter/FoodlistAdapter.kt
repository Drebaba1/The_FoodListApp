package com.example.foodlistapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.foodlistapp.R
import com.example.foodlistapp.model.Food

class FoodlistAdapter(

    private val dataSet: List<Food>,
) : RecyclerView.Adapter<FoodlistAdapter.FoodListViewHolder>() {

    class FoodListViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val imageView: ImageView = view.findViewById(R.id.foodItem_image)
        val textView: TextView = view.findViewById(R.id.foodItem_name)
        val textView2: TextView = view.findViewById(R.id.foodItem_price)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodListViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.foodlist_item, parent, false)

        return FoodListViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: FoodListViewHolder, position: Int) {
        val item = dataSet[position]
        holder.textView.text = item.name
        holder.textView2.text = item.price
        holder.imageView.setImageResource(item.imageResourceId)
    }

    override fun getItemCount() = dataSet.size
}

