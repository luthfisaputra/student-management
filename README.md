# 🧑‍🎓 Student Management CRUD – Java Spring Boot

![Java](https://img.shields.io/badge/Java-25-blue)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-brightgreen)
![Build](https://img.shields.io/badge/Status-Active-success)
![License](https://img.shields.io/badge/License-MIT-lightgrey)

## 📘 Deskripsi
Aplikasi ini adalah **CRUD (Create, Read, Update, Delete)** sederhana untuk mengelola data mahasiswa.  
Dibangun menggunakan **Java Spring Boot** dan **MySQL**, project ini dibuat sebagai latihan backend development sekaligus bahan portofolio.

Tujuan utama dari proyek ini:
- Membangun RESTful API menggunakan Spring Boot.
- Menghubungkan aplikasi ke database menggunakan JPA/Hibernate.
- Memahami struktur arsitektur service, repository, dan controller.
- Menerapkan prinsip clean code dan error handling sederhana.

---

## ⚙️ Tech Stack
- ☕ **Java 17**
- 🌱 **Spring Boot 3**
- 🗄️ **MySQL Database**
- 🧩 **Maven**
- 🧠 **Spring Data JPA**
- 🧪 **Postman** (untuk testing API)

---

## 📂 Struktur Folder
<img width="374" height="263" alt="image" src="https://github.com/user-attachments/assets/4c3d40ee-0105-4c40-acd9-ebcf859d5389" />


---

## 📋 Fitur CRUD
| Operasi | Method | Endpoint | Deskripsi |
|----------|---------|-----------|------------|
| 🆕 Create | `POST` | `/api/students` | Tambah data mahasiswa |
| 📖 Read All | `GET` | `/api/students` | Ambil semua data mahasiswa |
| 🔍 Read by ID | `GET` | `/api/students/{id}` | Ambil data berdasarkan ID |
| ✏️ Update | `PUT` | `/api/students/{id}` | Update data mahasiswa |
| ❌ Delete | `DELETE` | `/api/students/{id}` | Hapus mahasiswa |

---

## 🚀 Cara Menjalankan Project
1. **Clone repository**
   ```bash
   git clone https://github.com/luthfisaputra/student-management.git
2. **Masuk ke folder**
   ```bash
   cd student-management
3. **Jalankan aplikasi**
   ```bash
   mvn spring-boot:run
4. **Akses API**
   ```bash
   http://localhost:8080/api/students

---

## 🧠 Contoh Body JSON
**POST /api/students**
```json
{
  "fullName": "Luthfi Saputra",
  "email": "luthfi@example.com",
  "enrollmentYear": 2023
}
