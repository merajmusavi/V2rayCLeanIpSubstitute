package com.example.v2raycleanipsubstitute.Activity

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.v2raycleanipsubstitute.Adapter.Adapter
import com.example.v2raycleanipsubstitute.DataModel.ConfigModel
import com.example.v2raycleanipsubstitute.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(),Adapter.HandleClicks {
    lateinit var binding:ActivityMainBinding
    lateinit var adapter:Adapter
    lateinit var list:MutableList<ConfigModel>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
         list = mutableListOf <ConfigModel>()


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
        adapter.setListener(this)
        adapter.notifyDataSetChanged()

    }

    override fun onCopyClicked(position: Int) {
        val item = list[position]
        val clipBoard = getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
        val clipData = ClipData.newPlainText("dataLabel",item.config)
        clipBoard.setPrimaryClip(clipData)
        Toast.makeText(this,"config copied successfully",Toast.LENGTH_SHORT).show()
    }


}
