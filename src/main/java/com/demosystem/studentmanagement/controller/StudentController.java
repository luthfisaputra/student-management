package com.demosystem.studentmanagement.controller;

import com.demosystem.studentmanagement.entity.Student;
import com.demosystem.studentmanagement.service.StudentService;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("/api/students")
public class StudentController {
    
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    // CREATE
    @Operation(summary = "Tambah siswa baru")
    @PostMapping
    public Student createStudent(@Valid @RequestBody Student student) {
        return studentService.createStudent(student);
    }

    // READ - by ID
    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable Long id) {
        return studentService.getStudentById(id);
    }

    // READ - all
    @Operation(summary = "Ambil semua siswa (Dengan pagination & sorting)")
    @GetMapping
    public Page<Student> getAllStudents(@PageableDefault(size = 5, sort = "fullName") Pageable pageable) {
        return studentService.getAllStudents(pageable);
    }

    // UPDATE
    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable Long id, @Valid @RequestBody Student student) {
        return studentService.updateStudent(id, student);
    }
    
    // DELETE
    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable Long id) {
        studentService.deleteStudent(id);

        return "Student dengan ID " + id + " berhasil dihapus.";
    }
}
