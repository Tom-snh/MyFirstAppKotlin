package com.example.myfirstappkotlin.data.local.models

import android.provider.ContactsContract
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.myfirstappkotlin.data.local.models.UserLocal

@Dao
interface DatabaseDAO {
    @Query("SELECT * FROM userlocal")
    fun get(): List<UserLocal>

    @Query("SELECT * FROM userlocal WHERE email LIKE :email LIMIT 1")
    fun findByName(email: String): UserLocal?

    @Insert
    fun insert(user: UserLocal)

    @Delete
    fun delete(user: UserLocal)
}