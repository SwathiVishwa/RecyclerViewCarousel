package com.app.recyclercarousel

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setRecyclerView()
    }

    private fun setRecyclerView() {
        val recyclerView: RecyclerView = findViewById(R.id.rvImage);
        val list = ArrayList<Int>()
        for (i in 0..2) {
            list.add(R.drawable.image_one)
            list.add(R.drawable.image_two)
            list.add(R.drawable.image_three)
            list.add(R.drawable.image_four)
        }
        val adapter = Adapter(list)
        recyclerView.adapter = adapter

    }
}