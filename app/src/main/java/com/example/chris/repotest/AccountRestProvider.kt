package com.example.chris.repotest

class AccountRestProvider : IRestProvider<AccountDomainModel>{
    override fun restBlabla() {
    }

    override fun getData(): AccountDomainModel {
        return AccountDomainModel("Nick", "Rest")
    }
}