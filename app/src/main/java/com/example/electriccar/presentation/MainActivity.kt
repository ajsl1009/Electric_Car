package com.example.electriccar.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.example.electriccar.R

class MainActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val numArray = arrayListOf<String>()
        numArray.add("1")
        numArray.add("2")
        numArray.add("3")
        numArray.add("1")
        numArray.add("2")
        numArray.add("3")
        numArray.add("1")
        numArray.add("2")
        numArray.add("3")

        val recyclerView = findViewById<RecyclerView>(R.id.rv_ranking)
        recyclerView.adapter = RankingAdapter(numArray)
        recyclerView.layoutManager = LinearLayoutManager(this)
    }
}