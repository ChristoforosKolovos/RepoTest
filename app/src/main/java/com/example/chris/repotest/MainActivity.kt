package com.example.chris.repotest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.chris.repotest.experimental.data.entities.rest.TestResponseRaw
import com.example.chris.repotest.experimental.domain.usecases.TestUseCase
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val call = TestUseCase().getTestData()

        call.enqueue(object: Callback<TestResponseRaw> {
            override fun onFailure(call: Call<TestResponseRaw>?, t: Throwable?) {
                Log.i("Christoforos", "Call error")
            }

            override fun onResponse(call: Call<TestResponseRaw>?, response: Response<TestResponseRaw>?) {
                Log.i("Christoforos", response?.body().toString())
            }

        }
        )

    }
}
