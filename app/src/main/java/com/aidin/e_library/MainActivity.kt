package com.aidin.e_library

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.aidin.e_library.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btLogin.setOnClickListener {
            startActivity(Intent(this@MainActivity,Home::class.java))
        }
        binding.tvSignup.setOnClickListener {
            startActivity(Intent(this@MainActivity,Register::class.java))
        }
    }
}