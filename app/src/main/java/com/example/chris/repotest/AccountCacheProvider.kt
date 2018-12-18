package com.example.chris.repotest

class AccountCacheProvider : ICacheProvider<AccountDomainModel> {
    override fun cacheBlabla() {
    }

    override fun getData(): AccountDomainModel {
        return AccountDomainModel("John", "Cached")
    }
}