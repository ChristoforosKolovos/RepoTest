package com.example.chris.repotest.experimental.data.entities.rest

import com.example.chris.repotest.experimental.domain.models.Test

data class TestResponseRaw(
    val userId: Int,
    val id: Int,
    val title: String,
    val body: String
) {

    fun toTest() = Test(
        userId = userId,
        id = id,
        title = title,
        body = body
    )

}
