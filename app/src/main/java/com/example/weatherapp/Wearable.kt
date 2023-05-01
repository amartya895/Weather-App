package com.example.weatherapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class Wearable : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wearable)
        supportActionBar?.hide()

        val wearableBg = findViewById<ConstraintLayout>(R.id.wearableBg)
        val intent = intent.getStringExtra("weather").toString()
        val textViewWearable = findViewById<TextView>(R.id.textViewWearable)
        val imageViewWearable = findViewById<ImageView>(R.id.imageViewWearable)
        if(intent == "Haze") {
            textViewWearable.text = "Over Coat"
           imageViewWearable.setImageResource(R.drawable.tshirt)
            wearableBg.setBackgroundResource(R.drawable.haze)
        }
        else if(intent == "Rain"){
            textViewWearable.text = "Wear Rain Coat"
            imageViewWearable.setImageResource(R.drawable.raincoat)
            wearableBg.setBackgroundResource(R.drawable.rainy)

        }
        else if(intent == "Sunny"){
            textViewWearable.text = "Wear T-shirt"
            imageViewWearable.setImageResource(R.drawable.sunglasses)
            wearableBg.setBackgroundResource(R.drawable.sunny)

        }
        else if(intent == "Clouds"){
            textViewWearable.text = "Wear Normal But carry Umbrella"
            imageViewWearable.setImageResource(R.drawable.umbrella)
            wearableBg.setBackgroundResource(R.drawable.cloudy)
        }
        else if(intent == "Cold"){
            textViewWearable.text = "Wear Coat"
        }
        else if(intent == "Clear"){
            textViewWearable.text = "Clear Weather  wear T-shirt"
            imageViewWearable.setImageResource(R.drawable.tshirt)
            wearableBg.setBackgroundResource(R.drawable.sunrise)

        }
        else
        {
            textViewWearable.text = "Wear light colour "
            imageViewWearable.setImageResource(R.drawable.tshirt)
            wearableBg.setBackgroundResource(R.drawable.sunny)
        }
    }
}