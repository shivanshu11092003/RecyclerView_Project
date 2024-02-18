package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.google.android.material.imageview.ShapeableImageView

class Placeorder : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_placeorder)

        val newsheading=intent.getStringExtra("newsheading")
        val imageid=intent.getIntExtra("imageid",R.drawable.images)
        val price=intent.getStringExtra("price")

        val  image=findViewById<ShapeableImageView>(R.id.shapeableImageView)
        val productprice=findViewById<TextView>(R.id.productprice)
        val productname=findViewById<TextView>(R.id.productname)


        image.setImageResource(imageid)
        productname.text=newsheading
        productprice.text=price

    }
}