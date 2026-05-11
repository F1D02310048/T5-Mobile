package com.example.pasienlogin

import android.content.Intent
import android.os.Bundle
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

        // 1. Setup Tampilan List
        binding.rvPasien.layoutManager = LinearLayoutManager(this)
        binding.tvWelcome.text = "Administrator"

        // 2. Logika Tombol Logout (Kembali ke Login)
        binding.btnLogout.setOnClickListener {
            // Memberitahu sistem untuk pindah halaman
            val intent = Intent(this, MainActivity::class.java)

            // Menghapus semua tumpukan halaman agar tidak bisa klik "back"
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK

            startActivity(intent)

            // Menutup halaman daftar pasien
            finish()

            Toast.makeText(this, "Berhasil Keluar", Toast.LENGTH_SHORT).show()
        }

        // 3. Load Data dari API
        val token = intent.getStringExtra("USER_TOKEN") ?: ""
        loadDataPasien("Bearer $token")
    }

    private fun loadDataPasien(token: String) {
        lifecycleScope.launch {
            try {
                val response = RetrofitClient.instance.getPasien(token)
                if (response.success) {
                    binding.rvPasien.adapter = PasienAdapter(response.data)
                }
            } catch (e: Exception) {
                Toast.makeText(this@PasienActivity, "Gagal memuat data", Toast.LENGTH_SHORT).show()
            }
        }
    }
}

