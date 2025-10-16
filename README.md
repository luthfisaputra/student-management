# 🧑‍🎓 Student Management CRUD – Java Spring Boot

![Java](https://img.shields.io/badge/Java-17-blue)
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
src/
├── main/
│ ├── java/com/demosystem/studentmanagement/
│ │ ├── controller/ # REST Controller (API)
│ │ ├── entity/ # Model/Entity
│ │ ├── repository/ # JPA Repository
│ │ └── service/ # Service Layer (logic)
│ └── resources/
│ └── application.properties
└── pom.xml

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

## 🧠 Contoh Body JSON
**POST /api/students**
```json
{
  "fullName": "Luthfi Saputra",
  "email": "luthfi@example.com",
  "enrollmentYear": 2023
}
