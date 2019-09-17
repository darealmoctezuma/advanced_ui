package com.example.advancedui.retrofit

import com.example.advancedui.rv.Post
import retrofit2.Call
import retrofit2.http.GET


interface ImagesService {
    @GET("photos/?client_id=1ef588472c7d73fb1256066d1fe96daa6866e0b0ed91d17502871fe4e1a11337")
    fun getPhotos(): Call<List<Post>>
}