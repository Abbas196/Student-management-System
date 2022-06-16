package com.example.StudentmanagementSystem.service;

import com.example.StudentmanagementSystem.entity.Student;

import java.util.List;
import java.util.Set;

public interface StudentService {
    List<Student> getAllStudents();
    Student saveStudent(Student student);
    Student getStudentById(Long id);
    Student updateStudent(Student student);
    void deleteStudentById(Long id);
}
