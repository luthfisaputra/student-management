package com.demosystem.studentmanagement.service;

import com.demosystem.studentmanagement.entity.Student;
import com.demosystem.studentmanagement.exception.StudentNotFoundException;
import com.demosystem.studentmanagement.repository.StudentRepository;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    
    private final StudentRepository studentRepository;

    // Constructor Injection
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Page<Student> getAllStudents(Pageable pageable) {
        return studentRepository.findAll(pageable);
    }

    // CREATE
    public Student createStudent(Student student) {
        // Cek apakah email sudah dipakai
        Optional<Student> existing = studentRepository.findByEmail(student.getEmail());
        if (existing.isPresent()) {
            throw new RuntimeException("Email sudah digunakan!");
        }
        return studentRepository.save(student);
    }

    // READ - by ID
    public Student getStudentById(Long id) {
        return studentRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Student dengan ID " + id + " tidak ditemukan"));
    }

    // READ - all
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    // UPDATE
    public Student updateStudent(Long id, Student updateStudent) {
        Student student = getStudentById(id); // cek dulu ada atau tidak
        student.setFullName(updateStudent.getFullName());
        student.setEmail(updateStudent.getEmail());
        student.setEnrollmentYear(updateStudent.getEnrollmentYear());
        
        return studentRepository.save(student);
    }

    // DELETE
    public void deleteStudent(Long id) {
        if (!studentRepository.existsById(id)) {
            throw new StudentNotFoundException("Status dengan ID " + id + " tidak ditemukan");
        }
        studentRepository.deleteById(id);
    }

}