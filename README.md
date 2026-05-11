# 📱 Aplikasi Data Pasien Android

Aplikasi Android berbasis Kotlin yang digunakan untuk melakukan autentikasi pengguna melalui REST API serta menampilkan daftar data pasien menggunakan RecyclerView.

---

## 👨‍💻 Informasi Tugas

- **Dibuat Oleh:** Fadila Rahmania  
- **NIM:** F1D02310048
- **Mata Kuliah:** Pemrograman Mobile  

---

## 📌 Deskripsi Aplikasi

Aplikasi ini dikembangkan sebagai tugas mata kuliah Pemrograman Mobile. Sistem bekerja dengan melakukan login menggunakan API, menyimpan token autentikasi menggunakan SharedPreferences, lalu mengambil data pasien dari server dan menampilkannya dalam bentuk daftar menggunakan RecyclerView.

---

## 🚀 Fitur Utama

### 🔐 Login API
Autentikasi pengguna menggunakan endpoint:

```http
POST /api/login
```

---

### 💾 Session Management
Menyimpan token Bearer dan data pengguna secara aman menggunakan `SharedPreferences`.

---

### 📋 Daftar Pasien
Mengambil data pasien dari endpoint:

```http
GET /api/pasien
```

dengan proteksi `Authorization Header`.

---

### 📱 RecyclerView
Menampilkan data pasien seperti:
- Nama
- Tempat/Tanggal Lahir
- Nomor Telepon
- Gender
- Alamat

dalam bentuk list yang rapi dan responsif.

---


# 🌐 Endpoint API

## Base URL

```http
https://api.pahrul.my.id/
```

---

## 🔐 Login Endpoint

- **Method:** `POST`
- **Endpoint:** `/api/login`

Digunakan untuk autentikasi pengguna.

### Request Body

```json
{
  "email": "admin@example.com",
  "password": "password"
}
```

---

## 📋 Data Pasien Endpoint

- **Method:** `GET`
- **Endpoint:** `/api/pasien`

### Header Authorization

```http
Authorization: Bearer {token}
```


# 🔑 Akun Login Testing

```text
Ussername    : admin@example.com
Password : password
```

---

# 📸 Tampilan Aplikasi

- Halaman Login
- Daftar Data Pasien menggunakan RecyclerView

---

# ✅ Hasil Akhir

Aplikasi berhasil:
- melakukan autentikasi login menggunakan API,
- menyimpan session login,
- mengambil data pasien dari server,
- serta menampilkan data menggunakan RecyclerView pada Android Kotlin.
