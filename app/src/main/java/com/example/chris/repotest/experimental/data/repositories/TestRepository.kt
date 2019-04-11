package com.example.chris.repotest.experimental.data.repositories

import com.example.chris.repotest.experimental.data.clients.rest.TestRestClient
import com.example.chris.repotest.experimental.domain.datasources.TestDataSource


class TestRepository(
    private val restClient: TestRestClient
) : TestDataSource {

    override fun getTestData(): String? {
        return ""
    }

}
