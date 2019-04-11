package com.example.chris.repotest.experimental.data.repositories

import com.example.chris.repotest.experimental.data.clients.rest.TestRestClient
import com.example.chris.repotest.experimental.data.entities.rest.TestResponseRaw
import com.example.chris.repotest.experimental.domain.datasources.TestDataSource
import retrofit2.Call


class TestRepository(
        private val restClient: TestRestClient = TestRestClient()
) : TestDataSource {

    override fun getTestData(): Call<TestResponseRaw> {
        return restClient.getTestData()
    }

}
