package com.example.studentmanagementsystem;

import com.example.studentmanagementsystem.entity.Student;
import com.example.studentmanagementsystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

    public StudentManagementSystemApplication(StudentRepository repository) {
        this.repository = repository;
    }

    public static void main(String[] args) {
        SpringApplication.run(StudentManagementSystemApplication.class, args);
    }

    private final StudentRepository repository;

    @Override
    public void run(String... args) throws Exception {
//        Student student = new Student("Togrul", "Jafarov", "totu7771@gmail.com");
//        repository.save(student);
//
//        Student student1 = new Student("Ilyas", "Alizadeh", "ilyas78@mail.ru");
//        repository.save(student1);
//
//        Student student2 = new Student("Farhad", "Hasanli", "ilyas348@mail.ru");
//        repository.save(student2);
    }
}
