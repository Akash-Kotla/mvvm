package com.example.mvvm_retrofit.viewmodel


import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mvvm_retrofit.Resources
import com.example.mvvm_retrofit.model.PostModel
import com.example.mvvm_retrofit.repository.UserRepository
import kotlinx.coroutines.launch



//constructor
class UsersViewModel (val userRepository: UserRepository): ViewModel(){


    fun searchuser(mobile:String) = viewModelScope.launch {
       //searchuser.postValue(Resources.Success())
        userRepository.getUser(mobile)
            val response = userRepository.getUser(mobile = String())
        }



//
//    init {
//         viewModelScope.launch (Dispatchers.IO) {
//         userRepository.getUser("mobile")
//        }
//    }



    val  user : LiveData<PostModel>
    get() = userRepository.user



}
