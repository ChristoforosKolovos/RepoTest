package com.example.chris.repotest.experimental.domain.models

import java.io.Serializable

data class Test(
    val userId: Int,
    val id: Int,
    val title: String,
    val body: String
) : Serializable
