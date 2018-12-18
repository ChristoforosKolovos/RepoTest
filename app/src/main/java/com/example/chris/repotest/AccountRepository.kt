package com.example.chris.repotest

class AccountRepository : IRepository<AccountDomainModel, AccountRestProvider, AccountCacheProvider> {
    override val restProvider: AccountRestProvider
        get() = AccountRestProvider()
    override val cacheProvider: AccountCacheProvider
        get() = AccountCacheProvider()

}