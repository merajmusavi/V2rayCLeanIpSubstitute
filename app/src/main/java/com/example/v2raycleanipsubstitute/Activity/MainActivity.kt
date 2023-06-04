package com.example.v2raycleanipsubstitute.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
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


            binding.convert.setOnClickListener {
                list.clear()
                val config = binding.configPlace.text.toString()
                val ip = binding.ipPLace.text.toString()
                val splitData = ip.split("/").toTypedArray()





                for (i in splitData.indices){
                    val newConfig = config.replace(Regex("(?<=@).*?(?=:|$)"),splitData[i])
                    val model = ConfigModel(newConfig)
                    list.add(model)
                }
            }
        adapter = Adapter(this,list)
        binding.recConfig.layoutManager = LinearLayoutManager(this)
        binding.recConfig.adapter = adapter
        adapter.notifyDataSetChanged()

    }





    }
