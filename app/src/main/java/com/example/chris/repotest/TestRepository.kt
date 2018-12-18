package com.example.chris.repotest

class TestRepository : IRepository<AccountDomainModel, AccountRestProvider, Nothing> {
    override val restProvider: AccountRestProvider
        get() = AccountRestProvider()
    override val cacheProvider: Nothing?
        get() = null
}