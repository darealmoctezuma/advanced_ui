package com.example.advancedui.retrofit

import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.Retrofit


object RetrofitClient {
    val client: Retrofit = Retrofit.Builder()
        .baseUrl("https://api.unsplash.com")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
}
