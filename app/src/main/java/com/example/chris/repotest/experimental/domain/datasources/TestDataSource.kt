package com.example.chris.repotest.experimental.domain.datasources

import com.example.chris.repotest.experimental.data.entities.rest.TestResponseRaw
import retrofit2.Call

interface TestDataSource {

    fun getTestData(): Call<TestResponseRaw>

}
