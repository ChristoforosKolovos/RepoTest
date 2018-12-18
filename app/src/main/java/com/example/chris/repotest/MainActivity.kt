package com.example.chris.repotest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i("CACHE", AccountRepository().execute(false).lastname)
        Log.i("IGNORE CACHE", AccountRepository().execute(true).lastname)

        Log.i("Test - CACHE", TestRepository().execute(false).lastname)
        Log.i("Test - IGNORE CACHE", TestRepository().execute(true).lastname)

        Log.i("Test - CACHE", AnotherTestRepository().execute(false).toString())
        Log.i("Test - IGNORE CACHE", AnotherTestRepository().execute(true).toString())
    }
}
