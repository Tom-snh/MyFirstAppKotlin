package com.example.myfirstappkotlin.domain.useCase

import com.example.myfirstappkotlin.data.repository.UserRepository
import com.example.myfirstappkotlin.domain.entities.User

class CreateUserUseCase(
    private val userRepository: UserRepository
){
    suspend fun invoke(user: User) {
        userRepository.createUser(user)
    }
}