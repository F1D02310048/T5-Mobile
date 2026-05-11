package com.example.pasienlogin

import com.google.gson.annotations.SerializedName

data class Pasien(
    val id: Int,
    val nama: String?,
    val alamat: String?,
    @SerializedName("jenis_kelamin") val jenis_kelamin: String?,
    @SerializedName("tanggal_lahir") val tanggal_lahir: String?,
    @SerializedName("no_telepon") val no_telepon: String?
)
