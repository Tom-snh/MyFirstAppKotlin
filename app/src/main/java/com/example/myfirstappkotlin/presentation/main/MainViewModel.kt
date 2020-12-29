package com.example.myfirstappkotlin.presentation.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myfirstappkotlin.domain.entities.User
import com.example.myfirstappkotlin.domain.useCase.CreateUserUseCase
import com.example.myfirstappkotlin.domain.useCase.GetUserUserCase
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainViewModel (
    private val createUserUseCase: CreateUserUseCase,
    private val getUserUserCase: GetUserUserCase
) : ViewModel() {

    val counter : MutableLiveData<Int> = MutableLiveData()

    init{
        counter.value = 0
    }

    fun onClickedLogin(emailUser: String){
        viewModelScope.launch{
            createUserUseCase.invoke(User(emailUser))
            delay(1000)
            val user: Unit = getUserUserCase.invoke("test")
            val debug = "debug"
        }
    }
}