package com.aidin.e_library

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.aidin.e_library.databinding.ActivityMainBinding
import com.androidnetworking.AndroidNetworking
import com.androidnetworking.common.Priority
import com.androidnetworking.error.ANError
import com.androidnetworking.interfaces.JSONObjectRequestListener
import org.json.JSONObject

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btLogin.setOnClickListener {
            val email = binding.etEmail.text.toString()
            val password = binding.etPassword.text.toString()
            if (email.isEmpty()) {
                binding.etEmail.error = "Kosong"
                binding.etEmail.requestFocus()
            } else if (password.isEmpty()){
                binding.etPassword.error = "Kosong"
                binding.etPassword.requestFocus()
            } else {
                //login
                AndroidNetworking.post("http://192.168.1.8/api_perpus/login.php")
                    .addBodyParameter("email", email)
                    .addBodyParameter("password", password)
                    .setPriority(Priority.MEDIUM)
                    .build()
                    .getAsJSONObject(object : JSONObjectRequestListener {
                        override fun onResponse(response: JSONObject) {
                            if(response.getInt("success") == 1){
                                Toast.makeText(this@MainActivity, response.getString("pesan"), Toast.LENGTH_SHORT).show()
                                finish()
                            } else {
                                Toast.makeText(this@MainActivity, response.getString("pesan"), Toast.LENGTH_SHORT).show()
                            }
                        }
                        override fun onError(error : ANError) {
                            Toast.makeText(this@MainActivity,error.toString(), Toast.LENGTH_SHORT).show()
                        }
                    })
            }
        }
    }
}