package com.example.advancedui.retrofit

object ApiUtils {
    val soService: ImagesService
        get() = RetrofitClient.client.create(ImagesService::class.java)
}
