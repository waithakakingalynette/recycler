package com.example.recyclerviews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    lateinit var rvNames:RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onResume() {
        super.onResume()
        rvNames =findViewById(R.id.rvnames)
        var names = listOf("Lynette","Nathalie","Rebeccah","cathy","Gisemba","Eunice","Nkatha","Rachel","Pauline","Bridget","Lilian")
        val namesAdapter=NamesRvAdapter(names)
        rvNames.layoutManager =LinearLayoutManager(this)
        rvNames.adapter =namesAdapter
    }
}