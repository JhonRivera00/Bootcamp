package com.example.mainactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mainactivity.Users.ResponResult
import com.example.mainactivity.Users.Users
import com.example.mainactivity.databinding.ActivityMainBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
obtenerData()
    }
    private fun obtenerData() {
        val retro = Retrofit.Builder()
            .baseUrl("http://152.200.173.74:8057/api/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        val service: Users = retro.create(Users::class.java)
        service.getUsers().enqueue(object : Callback<ResponResult> {
            override fun onResponse(
                call: Call<ResponResult>,
                response: Response<ResponResult>

            ) {
                binding.tvUser.text= response.body()?.results?.nombres.toString()

                Log.e("onResponse: ", response.body().toString())
                Log.d("onResponse: ", response.errorBody().toString())
                Log.i("onResponse: ", response.body()?.results.toString())
                Log.w( "onResponse: ", response.message() )
                Log.i( "onResponse: ", response.code().toString() )
                response.body()?.results?.let { Log.e( "onResponse: ", it.nombres ) }


            }

            override fun onFailure(call: Call<ResponResult>, t: Throwable) {
                Log.e("onFailure: ", t.toString())
            }
        })
    }
}