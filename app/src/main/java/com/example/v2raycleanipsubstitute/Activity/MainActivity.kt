package com.example.v2raycleanipsubstitute.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.v2raycleanipsubstitute.Adapter.Adapter
import com.example.v2raycleanipsubstitute.DataModel.ConfigModel
import com.example.v2raycleanipsubstitute.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    lateinit var adapter:Adapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val list = mutableListOf <ConfigModel>()
        adapter = Adapter(this,list)
        binding.recConfig.layoutManager = LinearLayoutManager(this)
        binding.recConfig.adapter = adapter



    }
}