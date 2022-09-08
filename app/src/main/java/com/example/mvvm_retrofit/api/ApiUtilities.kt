package com.example.mvvm_retrofit.api

import com.example.mvvm_retrofit.model.PostModel
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiUtilities {

     val BASE_URL = "https://nl-ns-apim-ds.azure-api.net/dev-darwin-lc/v1/customerSupport/getAddExtentiondata/"

    fun getInstance(): Retrofit{
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}