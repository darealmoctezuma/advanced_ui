package com.example.advancedui.retrofit

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.example.advancedui.rv.Post
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

object ImagesRepository {
    private val service = ApiUtils.soService
    private val posts = MutableLiveData<List<Post>>()

    fun getPosts(): MutableLiveData<List<Post>> {
        service.getPhotos().enqueue(object : Callback<List<Post>> {
            override fun onFailure(call: Call<List<Post>>, t: Throwable) {
                Log.d("Error", t.toString())
            }

            override fun onResponse(call: Call<List<Post>>, response: Response<List<Post>>) {
                posts.postValue(response.body())
            }
        })

        return posts
    }
}