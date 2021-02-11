package com.geekbrains.video

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class CardViewAdapter(private var onClickVideo: ClickOnVideo?):
    RecyclerView.Adapter<CardViewAdapter.MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewAdapter.MyViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: CardViewAdapter.MyViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
    inner class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    }
    fun removeListener() {
        onClickVideo = null
    }

}