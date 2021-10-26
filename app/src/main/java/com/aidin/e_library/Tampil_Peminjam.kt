package com.aidin.e_library

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.aidin.e_library.databinding.ActivityTampilPeminjamBinding

class Tampil_Peminjam : AppCompatActivity() {
    private lateinit var binding: ActivityTampilPeminjamBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTampilPeminjamBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btBack.setOnClickListener {
            startActivity(Intent(this@Tampil_Peminjam,MainActivity::class.java))
        }
        binding.btTambahPinjam.setOnClickListener {
            startActivity(Intent(this@Tampil_Peminjam,Tambah_Data_Peminjaman::class.java))
        }
    }
}