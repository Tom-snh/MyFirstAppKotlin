package com.example.myfirstappkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SignInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        val retour : Button = findViewById(R.id.retour)
        retour.setOnClickListener{
            val intent = Intent(applicationContext, Login::class.java)
            startActivity(intent)
        }
    }
}