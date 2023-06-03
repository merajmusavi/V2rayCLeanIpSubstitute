package com.example.v2raycleanipsubstitute.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.v2raycleanipsubstitute.DataModel.ConfigModel
import com.example.v2raycleanipsubstitute.databinding.ItemBinding

class Adapter(val con: Context, val configLi: MutableList<ConfigModel>) :
    RecyclerView.Adapter<Adapter.ViewHolder>() {

    inner class ViewHolder(val item: ItemBinding) : RecyclerView.ViewHolder(item.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ItemBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun getItemCount(): Int {
        return configLi.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.item.tvConfigPlace.text = configLi[position].config
    }
}