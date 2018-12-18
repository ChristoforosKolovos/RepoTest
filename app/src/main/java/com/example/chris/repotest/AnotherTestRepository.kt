package com.example.chris.repotest

class AnotherTestRepository : IRepository<Int, IRestProvider<Int>, ICacheProvider<Int>> {
    override val restProvider: IRestProvider<Int>
        get() = object : IRestProvider<Int> {
            override fun restBlabla() {
            }

            override fun getData(): Int {
                return 1
            }

        }
    override val cacheProvider: ICacheProvider<Int>?
        get() = object : ICacheProvider<Int> {
            override fun cacheBlabla() {

            }

            override fun getData(): Int {
                return 2
            }

        }

}