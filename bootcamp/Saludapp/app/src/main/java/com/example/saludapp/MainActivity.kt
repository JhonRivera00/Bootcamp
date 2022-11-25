package com.example.saludapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.saludapp.databinding.ActivityMainBinding
import com.example.saludapp.databinding.ActivityRessultBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnShowName.setOnClickListener { checkValue() }

    }
    fun checkValue(){
        Toast.makeText(applicationContext, binding.etName.text.toString(), Toast.LENGTH_SHORT).show()
        if (binding.etName.text.toString().isNotEmpty()){
            val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra("Clave", binding.etName.text.toString())
            startActivity(intent)
        }else{
            showError()
        }
    }
    fun showError(){
        Toast.makeText(this,"El nombre del usuario no puede ser vacio", Toast.LENGTH_SHORT).show()
    }
}