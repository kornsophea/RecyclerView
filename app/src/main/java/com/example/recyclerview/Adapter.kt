package com.example.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(private var list:ArrayList<DataModel>):RecyclerView.Adapter<MyAdapter.ViewHolder> (){
     class ViewHolder(view: View):RecyclerView.ViewHolder(view){
        var tvName:TextView=view.findViewById(R.id.tv_name)
        var tvAge:TextView=view.findViewById(R.id.tv_age)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
                LayoutInflater.from(parent.context).inflate(R.layout.item_list,parent,false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       val dataList=list[position]
        holder.tvName.text=dataList.name
        holder.tvAge.text=dataList.age.toString()
    }

    override fun getItemCount(): Int {
        return list.size
    }
}