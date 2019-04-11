package com.example.chris.repotest.experimental.domain.usecases

import com.example.chris.repotest.experimental.data.entities.rest.TestResponseRaw
import com.example.chris.repotest.experimental.data.repositories.TestRepository
import com.example.chris.repotest.experimental.domain.datasources.TestDataSource
import retrofit2.Call

class TestUseCase(private val dataSource: TestDataSource = TestRepository()) {

    fun getTestData(): Call<TestResponseRaw> {
        return dataSource.getTestData()
    }

}
