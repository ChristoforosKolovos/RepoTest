package com.example.chris.repotest.experimental.data.providers

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RestRetrofitProvider {
    private const val BASE_URL = "https://jsonplaceholder.typicode.com/"

    fun getRetrofitInstance(baseUrl: String = BASE_URL) = Retrofit.Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

}