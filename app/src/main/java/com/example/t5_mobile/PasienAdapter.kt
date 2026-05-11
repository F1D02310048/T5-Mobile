package com.example.pasienlogin

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.pasienlogin.databinding.ItemPasienBinding

class PasienAdapter(private val listPasien: List<Pasien>) :
    RecyclerView.Adapter<PasienAdapter.PasienViewHolder>() {

    class PasienViewHolder(val binding: ItemPasienBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PasienViewHolder {
        val binding = ItemPasienBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return PasienViewHolder(binding)
    }

    override fun onBindViewHolder(holder: PasienViewHolder, position: Int) {
        val pasien = listPasien[position]

        holder.binding.tvNama.text = pasien.nama ?: "Tanpa Nama"

        holder.binding.tvTglLahir.text = "Tgl Lahir: ${pasien.tanggal_lahir ?: "-"}"
        holder.binding.tvNoTelp.text = "No. Telp: ${pasien.no_telepon ?: "-"}"

        val genderStr = when(pasien.jenis_kelamin?.uppercase()) {
            "L" -> "Pria"
            "P" -> "Wanita"
            else -> pasien.jenis_kelamin ?: "-"
        }
        holder.binding.tvJenisKelamin.text = "Jenis Kelamin: $genderStr"
        holder.binding.tvAlamat.text = "Alamat: ${pasien.alamat ?: "-"}"
    }

    override fun getItemCount(): Int = listPasien.size
}