package com.example.pasienlogin

import retrofit2.http.*

interface ApiService {
    @POST("api/login")
    suspend fun login(@Body request: LoginRequest): LoginResponse

    @GET("api/pasien")
    suspend fun getPasien(@Header("Authorization") token: String): PasienResponse
}

data class LoginRequest(
    val email: String,
    val password: String
)

