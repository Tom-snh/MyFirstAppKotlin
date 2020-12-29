package com.example.myfirstappkotlin.presentation.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import com.example.myfirstappkotlin.R
import org.koin.android.ext.android.inject
import kotlinx.android.synthetic.main.activity_login.*

class MainActivity : AppCompatActivity() {

    private val mainViewModel : MainViewModel by inject()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        /*mainViewModel.counter.observe(this, Observer {
                value -> main_text.text = value.toString()
        })*/
        validate.setOnClickListener{
            mainViewModel.onClickedLogin(login_edit.text.toString().trim())
        }
    }

}
