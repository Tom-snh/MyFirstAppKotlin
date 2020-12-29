package com.example.myfirstappkotlin.injection

import android.content.Context
import androidx.room.Room
import com.example.myfirstappkotlin.data.local.models.DatabaseDAO
import com.example.myfirstappkotlin.data.local.models.AppDatabase
import com.example.myfirstappkotlin.data.repository.UserRepository
import com.example.myfirstappkotlin.domain.useCase.CreateUserUseCase
import com.example.myfirstappkotlin.domain.useCase.GetUserUserCase
import com.example.myfirstappkotlin.presentation.main.MainViewModel
import org.koin.android.ext.koin.androidContext
import org.koin.core.module.Module
import org.koin.dsl.module

val myModule : Module = module {
    factory{ MainViewModel(get(),get()) }
}

val domainModule : Module = module{
    factory { CreateUserUseCase(get()) }
    factory { GetUserUserCase(get()) }
}

val dataModule: Module = module{
    single{UserRepository(get())}
    single { createDataBase(androidContext())}
}

fun createDataBase(context: Context): DatabaseDAO {
    val appDatabase: AppDatabase = Room.databaseBuilder(context,
                                                        AppDatabase::class.java, "database-name").build()
    return appDatabase.databaseDao()
}