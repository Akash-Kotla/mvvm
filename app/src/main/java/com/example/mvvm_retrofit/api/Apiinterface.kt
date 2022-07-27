package com.example.mvvm_retrofit.api


import com.example.mvvm_retrofit.model.PostModel
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query


interface Apiinterface {

    @Headers("Ocp-Apim-Subscription-Key: 23835e387fda4748b2aed408f9e90e8c")
    @GET("")


    fun getpostmodels(
        @Query("mobile_number")
        mobile_number: String,
        callback: Call<PostModel?>?
    ): Response<PostModel>

}
