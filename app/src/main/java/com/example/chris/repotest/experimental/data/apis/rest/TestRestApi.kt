package com.example.chris.repotest.experimental.data.apis.rest

import com.example.chris.repotest.experimental.data.entities.rest.TestResponseRaw
import retrofit2.http.GET

interface TestRestApi {

    @GET("posts")
    fun getTestData(): TestResponseRaw
}
