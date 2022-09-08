package com.example.mvvm_retrofit.repository


import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.mvvm_retrofit.api.Apiinterface
import com.example.mvvm_retrofit.model.PostModel as PostModel1

class UserRepository(private val apiinterface:Apiinterface) {


    private val userLiveData = MutableLiveData<PostModel1>()

    val user: LiveData<PostModel1>
        get() = userLiveData



    suspend fun getUser()
     {
        val result = apiinterface.getpostmodels()
        if (result.body() != null){
            userLiveData.postValue(result.body())
        }
   }

}






