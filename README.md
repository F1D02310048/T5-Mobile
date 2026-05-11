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
Username : admin@example.com
Password : password
```

---
 # 📸 Percobaan Postman
 <img width="1224" height="951" alt="Screenshot 2026-05-11 100219(1)" src="https://github.com/user-attachments/assets/cbb2981f-1925-44f0-a455-7ed8daa4871f" />

 <img width="1191" height="933" alt="Screenshot 2026-05-11 100258" src="https://github.com/user-attachments/assets/0ad1506d-8758-49ce-82e3-a7f5a990e6f0" />



---

# 📸 Tampilan Aplikasi

- **Halaman Login**

  <img width="376" height="789" alt="Screenshot 2026-05-11 090042" src="https://github.com/user-attachments/assets/80077d70-9b61-412e-8952-93f666685ff0" />



  
  <img width="419" height="881" alt="Screenshot 2026-05-11 103320" src="https://github.com/user-attachments/assets/17c40883-d7aa-4bb4-b68d-ede7abebf818" />



- **Daftar Data Pasien menggunakan RecyclerView**
  

  <img width="445" height="916" alt="Screenshot 2026-05-11 103502" src="https://github.com/user-attachments/assets/eca96484-158e-4813-ba92-27fd55903b9a" />


---

# ✅ Hasil Akhir

Aplikasi berhasil:
- melakukan autentikasi login menggunakan API,
- menyimpan session login,
- mengambil data pasien dari server,
- serta menampilkan data menggunakan RecyclerView pada Android Kotlin.
