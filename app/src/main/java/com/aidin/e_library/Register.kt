package com.aidin.e_library

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.aidin.e_library.databinding.ActivityRegisterBinding

class Register : AppCompatActivity() {
    private lateinit var binding:ActivityRegisterBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btSignUp.setOnClickListener {
            startActivity(Intent(this@Register,MainActivity::class.java))
        }
    }
}