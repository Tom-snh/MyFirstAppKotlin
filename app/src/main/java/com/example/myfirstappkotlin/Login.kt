package com.example.myfirstappkotlin

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.myfirstappkotlin.presentation.main.MainViewModel
import com.google.android.material.button.MaterialButton
import kotlinx.android.synthetic.main.activity_login.*
import org.koin.android.ext.android.inject

class Login : AppCompatActivity() {
    private val mainViewModel : MainViewModel by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val create_account: Button = findViewById(R.id.create_account)

        /*mainViewModel.counter.observe(this, Observer {
                value -> main_text.text = value.toString()
        })*/
        create_account.setOnClickListener {
            val signInActivity = Intent(applicationContext, SignInActivity::class.java)
            startActivity(signInActivity)
        }
        validate.setOnClickListener{
            mainViewModel.onClickedLogin(login_edit.text.toString().trim())
        }
    }
}