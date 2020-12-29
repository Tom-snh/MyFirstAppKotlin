package com.example.myfirstappkotlin.domain.useCase

import com.example.myfirstappkotlin.data.local.models.UserLocal
import com.example.myfirstappkotlin.data.repository.UserRepository
import com.example.myfirstappkotlin.domain.entities.User

class GetUserUserCase(
    private val userRepository: UserRepository
) {
    suspend fun invoke(email: String) {
        return userRepository.getUser(email)
    }
}