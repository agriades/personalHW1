package com.homework.account

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.Random

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val userID = intent.getStringExtra("userID")
        val userIdHere = findViewById<TextView>(R.id.tv_id_info)
        userIdHere.text = "아이디: $userID"

        val quitButton = findViewById<Button>(R.id.button_quit)
        quitButton.setOnClickListener {
            finish()
        }

        val imagesId = arrayOf(
            R.drawable.image_1,
            R.drawable.image_2,
            R.drawable.image_3,
            R.drawable.image_4,
            R.drawable.image_5
        )

        val imagesIndex = Random().nextInt(imagesId.size)
        val photoHere = findViewById<ImageView>(R.id.iv_photo)
        photoHere.setImageResource(imagesId[imagesIndex])
    }
}