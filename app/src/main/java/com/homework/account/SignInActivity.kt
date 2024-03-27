package com.homework.account

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SignInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        val loginButton = findViewById<Button>(R.id.button_login)
        loginButton.setOnClickListener{
            val textID = findViewById<EditText>(R.id.edit_text_id).text.toString()
            val textPW = findViewById<EditText>(R.id.edit_text_id).text.toString()

            if (textID == "" || textPW == "") {
                Toast.makeText(this.applicationContext, "아이디/비밀번호를 확인해 주세요.", Toast.LENGTH_SHORT).show()
            }
            else {
                val homeIntent = Intent(this, HomeActivity::class.java)
                homeIntent.putExtra("userID",textID)
                Toast.makeText(this.applicationContext, "로그인 성공", Toast.LENGTH_SHORT).show()
                startActivity(homeIntent)
            }
        }
        val signUpButton = findViewById<Button>(R.id.button_sign_up)
        signUpButton.setOnClickListener{
            val signUpIntent = Intent(this, SignUpActivity::class.java)
            startActivity(signUpIntent)
        }

    }
}