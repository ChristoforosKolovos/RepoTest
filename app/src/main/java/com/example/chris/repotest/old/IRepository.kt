package com.example.chris.repotest.old

//T: return object type
//R: rest provider
//C: cache provider
interface IRepository<T, R : IRestProvider<T>, C : ICacheProvider<T>> {

    val restProvider: R
    val cacheProvider: C?

    fun getData(ignoreCache: Boolean): T {
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
