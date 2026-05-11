package com.example.pasienlogin

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.example.pasienlogin.databinding.ActivityMainBinding
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLogin.setOnClickListener {
            val email = binding.etUsername.text.toString()
            val pass = binding.etPassword.text.toString()

            lifecycleScope.launch {
                try {
                    val response = RetrofitClient.instance.login(LoginRequest(email, pass))
                    if (response.success) {
                        val token = "Bearer ${response.data.token}"
                        val intent = Intent(this@MainActivity, PasienActivity::class.java)
                        intent.putExtra("USER_TOKEN", token)
                        startActivity(intent)
                        finish()
                    } else {
                        Toast.makeText(this@MainActivity, response.message, Toast.LENGTH_SHORT).show()
                    }
                } catch (e: Exception) {
                    Log.e("LOGIN_ERROR", "Error: ${e.message}")
                    Toast.makeText(this@MainActivity, "Gagal terhubung ke server", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}