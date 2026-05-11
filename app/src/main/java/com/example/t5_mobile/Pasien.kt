package com.example.pasienlogin

import com.google.gson.annotations.SerializedName

data class Pasien(
    val id: Int,
    val nama: String?,
    val alamat: String?,

    @SerializedName("jenis_kelamin")
    val jenis_kelamin: String?,

    @SerializedName("tanggal_lahir") // Harus sama dengan JSON: tanggal_lahir
    val tanggal_lahir: String?,

    @SerializedName("no_telepon") // Harus sama dengan JSON: no_telepon
    val no_telepon: String?
)