package com.example.chris.repotest.old

class AccountCacheProvider :
    ICacheProvider<AccountDomainModel> {
    override fun cacheBlabla() {
    }

    override fun getData(): AccountDomainModel {
        return AccountDomainModel("John", "Cached")
    }
}
