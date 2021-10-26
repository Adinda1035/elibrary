package com.aidin.e_library

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.aidin.e_library.databinding.ActivityTambahBinding

class Tambah_Data_Peminjaman : AppCompatActivity() {
    private lateinit var binding: ActivityTambahBinding
    var status_peminjaman = "Dipinjam"
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityTambahBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btSimpan.setOnClickListener {
            val nama_peminjam = binding.etNama.text.toString()
            val jb = binding.etJudul.text.toString()

            binding.btPilihTanggalKembali.setOnClickListener {

            }
        }

    }
}