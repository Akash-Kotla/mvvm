package com.example.mvvm_retrofit.viewmodel


import androidx.constraintlayout.utils.widget.MockView
import androidx.lifecycle.LiveData

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mvvm_retrofit.api.ApiUtilities.getInstance
import com.example.mvvm_retrofit.model.PostModel
import com.example.mvvm_retrofit.repository.UserRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch



//constructor
class UsersViewModel (private val userRepository: UserRepository): ViewModel() {

//
//    fun searchuser(mobile:String) = viewModelScope.launch {
//
//        //searchuser.postValue(Resources.Success())
//        userRepository.getUser("")
//            val response = userRepository.getUser()



//    init {
//        viewModelScope.launch(Dispatchers.IO) {
//            userRepository.getUser()
//        }
//    }

    fun getposts() {
        viewModelScope.launch {

        }
    }

   val user: LiveData<PostModel>
       get() = userRepository.user
}



