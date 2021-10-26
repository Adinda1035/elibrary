package com.aidin.e_library

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.aidin.e_library.databinding.ActivityHomeBinding

class Home : AppCompatActivity() {
    private lateinit var binding:ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btListPinjam.setOnClickListener {
            startActivity(Intent(this@Home,Tampil_Peminjam::class.java))
        }

        binding.btListAnggota.setOnClickListener {
            startActivity(Intent(this@Home,Tampil_Anggota::class.java))
        }
    }
}