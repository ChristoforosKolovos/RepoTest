package com.example.chris.repotest

interface IProvider<T>{
    fun getData() : T
}