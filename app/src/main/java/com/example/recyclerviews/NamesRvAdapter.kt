package com.example.recyclerviews

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class NamesRvAdapter (var namesList:List<String>):Adapter<NamesViewHolder>(){
   override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NamesViewHolder {
     var itemView=LayoutInflater.from(parent.context).inflate(R.layout.activity_names_list_item,parent,
        false)
      return NamesViewHolder(itemView)

   }

   override fun onBindViewHolder(holder: NamesViewHolder, position: Int) {
      var currentName =namesList.get(position)
      holder.tvName.text =currentName
   }

   override fun getItemCount(): Int {
      return namesList.size
   }

   fun fibonacci(n: Int): Int {
      return if (n <= 1) n else fibonacci(n - 1) + fibonacci(n - 2)
   }

   fun getFibonacciList(): List<Int> {
      val fibonacciList = mutableListOf<Int>()
      for (i in 0..99) {
         fibonacciList.add(fibonacci(i))
      }
      return fibonacciList
   }
}

class NamesViewHolder(itemView:View):ViewHolder(itemView){
   var tvName=itemView.findViewById<TextView>(R.id.tvName)

}

