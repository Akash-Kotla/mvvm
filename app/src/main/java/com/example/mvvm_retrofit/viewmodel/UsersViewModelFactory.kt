package com.example.mvvm_retrofit.viewmodel

import androidx.lifecycle.ViewModelProvider

import com.example.mvvm_retrofit.repository.UserRepository



    class UsersViewModelFactory(private val userRepository: UserRepository):ViewModelProvider.NewInstanceFactory(){
        @Suppress("Unchecked_CAST")
        override fun <T : androidx.lifecycle.ViewModel> create(modelClass: Class<T>): T {
            return UsersViewModel(userRepository) as T
        }
    }



