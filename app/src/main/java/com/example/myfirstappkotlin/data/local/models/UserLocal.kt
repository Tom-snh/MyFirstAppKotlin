package com.example.myfirstappkotlin.data.local.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.myfirstappkotlin.domain.entities.User

@Entity
data class UserLocal(
    @ColumnInfo(name = "email") val email: String
){
    @PrimaryKey(autoGenerate = true) var uid: Int = 0;
}

fun User.toData(): UserLocal{
    return UserLocal(email = email)
}

fun UserLocal.toData(): User{
    return User(email = email)
}