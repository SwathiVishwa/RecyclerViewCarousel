package com.app.recyclercarousel

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatImageView
import androidx.recyclerview.widget.RecyclerView

class Adapter(val image: ArrayList<Int>) : RecyclerView.Adapter<Adapter.ViewHolder>() {
    // Your data goes here
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_image, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.image.setImageResource(image[position])
        // Bind your data to the views
    }

    override fun getItemCount(): Int {
        // Return the size of your data
        return image.size
    }

    class ViewHolder  // Your view components go here
        (itemView: View) : RecyclerView.ViewHolder(itemView) {

        // Initialize your views
        var image: AppCompatImageView = itemView.findViewById(R.id.img)
    }
}