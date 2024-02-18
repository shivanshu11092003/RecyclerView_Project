package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var recyclerview: RecyclerView
    lateinit var newsArrayList: ArrayList<News>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        recyclerview=findViewById(R.id.Recyclerid)
         val imageArray= arrayOf(
             R.drawable.images,
             R.drawable.product1,
             R.drawable.product2,
             R.drawable.product3,
             R.drawable.product4,
             R.drawable.product5,
             R.drawable.images,
             R.drawable.product1,
             R.drawable.product2,
             R.drawable.product3,
             R.drawable.product4,
             R.drawable.product5
         )
        val newsHeading= arrayOf(
            "heading1",
            "heading2",
            "heading3",
            "heading4",
            "heading5",
            "heading6",
            "heading1",
            "heading2",
            "heading3",
            "heading4",
            "heading5",
            "heading6"
        )
        recyclerview.layoutManager = LinearLayoutManager(this)
        newsArrayList= arrayListOf<News>()

        for(index in imageArray.indices){
            val news =News(imageArray[index],newsHeading[index])
            newsArrayList.add(news)
        }
        recyclerview.adapter=MyAdapter(newsArrayList,this)





    }
}

