package com.example.recyclerview

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.MyAdapter.ViewHolder
import com.google.android.material.imageview.ShapeableImageView

class MyAdapter(var newsArrayList: ArrayList<News>, var context: Activity) :
    RecyclerView.Adapter<MyAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemview=LayoutInflater.from(parent.context).inflate(R.layout.each_row,parent,false)
        return ViewHolder(itemview)

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var currentitem=newsArrayList[position]
        holder.htitle.text=currentitem.newsHeading
        holder.imageid.setImageResource(currentitem.imageId)

    }

    override fun getItemCount(): Int {
        return newsArrayList.size

    }

    class ViewHolder(itemview: View):RecyclerView.ViewHolder(itemview) {
        val htitle=itemview.findViewById<TextView>(R.id.TextID)
        val imageid=itemview.findViewById<ShapeableImageView>(R.id.imageID)


    }
}