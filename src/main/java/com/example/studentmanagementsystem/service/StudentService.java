package com.example.studentmanagementsystem.service;

import com.example.studentmanagementsystem.entity.Student;

import java.util.List;


public interface StudentService {
    List<Student> getAllStudents();

    void saveStudent(Student student);

    void updateStudent(Student student);
    Student getStudentById(Long id);

    void deleteStudentById(Long id);

}
