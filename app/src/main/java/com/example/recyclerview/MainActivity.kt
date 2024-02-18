package com.example.recyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

private const val s = "heading"

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
            "Product Name 1",
            "Product Name 2",
            "Product Name 3",
            "Product Name 4",
            "Product Name 5",
            "Product Name 6",
            "Product Name 7",
            "Product Name 8",
            "Product Name 9",
            "Product Name 10",
            "Product Name 11",
            "Product Name 12"
        )

        val price= arrayOf("₹200","₹200","₹200","₹200","₹200","₹200"
            ,"₹200","₹200","₹200","₹200","₹200","₹200")
        recyclerview.layoutManager = LinearLayoutManager(this)
        newsArrayList= arrayListOf<News>()

        for(index in imageArray.indices){
            val news =News(imageArray[index],newsHeading[index],price[index])
            newsArrayList.add(news)
        }
        var myAdapter=MyAdapter(newsArrayList,this)
        recyclerview.adapter=myAdapter
        myAdapter.setOnItemClickListener(object :MyAdapter.onItemClickListener{
            override fun onclick(position: Int) {
                val intent=Intent(applicationContext,Placeorder::class.java)
                intent.putExtra("newsheading",newsArrayList[position].newsHeading)
                intent.putExtra("imageid",newsArrayList[position].imageId)
                intent.putExtra("price",newsArrayList[position].price)
                startActivity(intent)
            }

        })







    }
}

