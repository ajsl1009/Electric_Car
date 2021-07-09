package com.example.electriccar.presentation

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.electriccar.R

class RankingAdapter(private val arrayList: ArrayList<String>):RecyclerView.Adapter<ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(arrayList[position])
    }

    override fun getItemCount(): Int = arrayList.size
}

class ViewHolder(item: View): RecyclerView.ViewHolder(item){
    private val tv_ranking = item.findViewById<TextView>(R.id.tv_ranking)
    private val iv_company_symbol = item.findViewById<ImageView>(R.id.iv_company_symbol)
    private val tv_model_name = item.findViewById<TextView>(R.id.tv_model_name)
    private val ibtn_up = item.findViewById<ImageButton>(R.id.ibtn_up)
    private val ibtn_down = item.findViewById<ImageButton>(R.id.ibtn_down)
    fun bind(str: String) {
        tv_ranking.text = str
        tv_model_name.text = "company model number"

    }
}