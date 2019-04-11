package com.example.chris.repotest.experimental.data.entities.rest

import com.example.chris.repotest.experimental.domain.models.Post
import com.example.chris.repotest.experimental.domain.models.Test


data class TestResponseRaw(
        val posts: List<PostRaw>
) {
    fun toTest(): Test {
        var listOfPosts = arrayListOf<Post>()
        posts.forEach {
            listOfPosts.add(it.toPost())
        }
        return Test(listOfPosts)
    }
}