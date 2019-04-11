package com.example.chris.repotest.experimental.data.clients.rest

import com.example.chris.repotest.experimental.data.apis.rest.TestRestApi
import com.example.chris.repotest.experimental.data.entities.rest.TestResponseRaw
import com.example.chris.repotest.experimental.data.services.RestRetrofitService
import retrofit2.Call

class TestRestClient(private val testRestApi: TestRestApi = RestRetrofitService.getService()) {

    fun getTestData(): Call<TestResponseRaw> = testRestApi.getTestData()
}
