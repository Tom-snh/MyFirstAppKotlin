package com.example.myfirstappkotlin.data.repository

import com.example.myfirstappkotlin.data.local.models.DatabaseDAO
import com.example.myfirstappkotlin.data.local.models.UserLocal
import com.example.myfirstappkotlin.data.local.models.toData
import com.example.myfirstappkotlin.domain.entities.User

class UserRepository(private val databaseDAO: DatabaseDAO) {
    suspend fun createUser(user: User){
    databaseDAO.insert(user.toData())
    }

    fun getUser(email: String){
        val userLocal : UserLocal? = databaseDAO.findByName(email)
    }
}