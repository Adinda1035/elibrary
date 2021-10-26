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

        binding.btListPinjam.setOnClickListener {
            startActivity(Intent(this@MainActivity,Tampil_Peminjam::class.java))
        }

        binding.btListAnggota.setOnClickListener {
            startActivity(Intent(this@MainActivity,Tampil_Anggota::class.java))
        }
    }
}