package com.example.saludapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.saludapp.databinding.ActivityRessultBinding

class ResultActivity : AppCompatActivity() {
    private lateinit var binding : ActivityRessultBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRessultBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnBack.setOnClickListener { onBackPressed() }
        getAndShowName()
    }
    fun getAndShowName(){
        val bundle = intent.extras
            val name = bundle?.get("Clave")
            binding.tvGreeting.text= "Bienvenido $name"
        }
}