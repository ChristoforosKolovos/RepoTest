package com.example.chris.repotest.old

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.chris.repotest.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i("CACHE", AccountRepository().getData(false).lastname)
        Log.i("IGNORE CACHE", AccountRepository().getData(true).lastname)

        Log.i("Test - CACHE", TestRepository().getData(false).lastname)
        Log.i("Test - IGNORE CACHE", TestRepository().getData(true).lastname)

        Log.i("Test - CACHE", AnotherTestRepository().getData(false).toString())
        Log.i("Test - IGNORE CACHE", AnotherTestRepository().getData(true).toString())
    }
}
