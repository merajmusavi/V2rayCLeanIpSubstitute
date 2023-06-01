package com.example.v2raycleanipsubstitute.Adapter

import android.content.Context
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.v2raycleanipsubstitute.DataModel.ConfigModel
import com.example.v2raycleanipsubstitute.databinding.ItemBinding

class Adapter(val con:Context,val configLi:MutableList<ConfigModel>): RecyclerView.Adapter<Adapter.ViewHolder>() {

    inner class ViewHolder(val item:ItemBinding): RecyclerView.ViewHolder(item.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }
}