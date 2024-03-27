package com.homework.account

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val userID = intent.getStringExtra("userID")
        val userIdHere = findViewById<TextView>(R.id.tv_id)
        userIdHere.setText(userID)

        val quitButton = findViewById<Button>(R.id.button_quit)
        quitButton.setOnClickListener {
            finish()
        }


    }
}