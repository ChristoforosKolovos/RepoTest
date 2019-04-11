package com.example.chris.repotest.experimental.domain.usecases

import com.example.chris.repotest.experimental.domain.datasources.TestDataSource

class TestUseCase(private val dataSource: TestDataSource) {

    fun getTestData(): String? {
        return dataSource.getTestData()
    }

}
