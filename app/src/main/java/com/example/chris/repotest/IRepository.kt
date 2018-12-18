package com.example.chris.repotest

interface IRepository<T, R : IRestProvider<T>, C : ICacheProvider<T>> {

    val restProvider: R
    val cacheProvider: C?

    fun execute(ignoreCache: Boolean): T {
        return if (ignoreCache) {
            restProvider.getData()
        } else {
            cacheProvider?.let {
                it.getData()
            } ?: run {
                restProvider.getData()
            }
        }
    }
}