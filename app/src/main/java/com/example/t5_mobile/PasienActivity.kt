package com.example.pasienlogin

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.pasienlogin.databinding.ActivityPasienBinding
import kotlinx.coroutines.launch

class PasienActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPasienBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPasienBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rvPasien.layoutManager = LinearLayoutManager(this)

        val token = intent.getStringExtra("USER_TOKEN") ?: ""

        lifecycleScope.launch {
            try {
                // Memanggil API
                val response = RetrofitClient.instance.getPasien(token)

                if (response.success) {
                    // Masukkan data ke Adapter
                    val listData: List<Pasien> = response.data
                    binding.rvPasien.adapter = PasienAdapter(listData)
                } else {
                    Toast.makeText(this@PasienActivity, response.message ?: "Gagal", Toast.LENGTH_SHORT).show()
                }
            } catch (e: Exception) {
                Log.e("API_ERROR", "Error: ${e.message}")
                Toast.makeText(this@PasienActivity, "Terjadi kesalahan koneksi", Toast.LENGTH_SHORT).show()
            }
        }
    }
}