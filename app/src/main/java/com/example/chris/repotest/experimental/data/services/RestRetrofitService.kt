package com.example.chris.repotest.experimental.data.services

import com.example.chris.repotest.experimental.data.apis.rest.TestRestApi
import com.example.chris.repotest.experimental.data.providers.RestRetrofitProvider

object  RestRetrofitService{

    fun getService() = RestRetrofitProvider.getRetrofitInstance().create(TestRestApi::class.java)

}