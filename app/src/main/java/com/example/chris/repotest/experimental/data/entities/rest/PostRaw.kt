package com.example.chris.repotest.experimental.data.entities.rest

import com.example.chris.repotest.experimental.domain.models.Post

data class PostRaw(
        val userId: Int,
        val id: Int,
        val title: String,
        val body: String
) {

    fun toPost() = Post(
            userId = userId,
            id = id,
            title = title,
            body = body
    )

}