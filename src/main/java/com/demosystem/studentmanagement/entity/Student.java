package com.demosystem.studentmanagement.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
@Table(name = "students")
public class Student {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @NotBlank(message = "Nama tidak boleh kosong")
    private String fullName;

    @Email(message = "Format email tidak valid")
    @NotBlank(message = "Email wajib diisi")
    @Column(nullable = false, unique = true)
    private String email;

    @Min(value = 2000, message = "Tahun masuk minimal tahun 2000")
    @Max(value = 2100, message = "Tahun masuk maksimal tahun 2100")
    private Integer enrollmentYear;

    // Constructor
    public Student() {}

    public Student(String fullName, String email, Integer enrollmentYear) {
        this.fullName = fullName;
        this.email = email;
        this.enrollmentYear = enrollmentYear;
    }

    // Getter & Setter
    public Long getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getEnrollmentYear() {
        return enrollmentYear;
    }

    public void setEnrollmentYear(Integer enrollmentYear) {
        this.enrollmentYear = enrollmentYear;
    }

}
