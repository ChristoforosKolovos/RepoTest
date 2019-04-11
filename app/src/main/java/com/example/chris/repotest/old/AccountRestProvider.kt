package com.example.chris.repotest.old

class AccountRestProvider :
    IRestProvider<AccountDomainModel> {
    override fun restBlabla() {
    }

    override fun getData(): AccountDomainModel {
        return AccountDomainModel("Nick", "Rest")
    }
}
