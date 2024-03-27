package com.homework.account

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        val signUpButton = findViewById<Button>(R.id.button_sign_up)
        signUpButton.setOnClickListener {
            val textName = findViewById<EditText>(R.id.edit_text_name).text.toString()
            val textID = findViewById<EditText>(R.id.edit_text_id).text.toString()
            val textPW = findViewById<EditText>(R.id.edit_text_pw).text.toString()

            if (textName == "" || textID == "" || textPW == "") {
                Toast.makeText(this.applicationContext, "입력되지 않은 정보가 있습니다.", Toast.LENGTH_SHORT).show()
            }
            else {
                finish()
            }
        }
    }

}