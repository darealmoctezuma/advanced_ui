package com.example.advancedui.rv

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.advancedui.retrofit.ImagesRepository

class PostViewModel : ViewModel() {
    val posts: LiveData<List<Post>> = ImagesRepository.getPosts()
}