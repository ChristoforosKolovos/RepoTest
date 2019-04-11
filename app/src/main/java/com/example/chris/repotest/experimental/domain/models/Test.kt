package com.example.chris.repotest.experimental.domain.models

import java.io.Serializable

data class Test(
    val posts : List<Post>
) : Serializable
