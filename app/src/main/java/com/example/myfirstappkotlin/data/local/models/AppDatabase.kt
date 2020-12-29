package com.example.myfirstappkotlin.data.local.models

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [UserLocal::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun databaseDao(): DatabaseDAO
}