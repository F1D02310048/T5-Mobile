package com.example.pasienlogin

data class PasienResponse(
    val success: Boolean,
    val message: String?,
    val data: List<Pasien>
)