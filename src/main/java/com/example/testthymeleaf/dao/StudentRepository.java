package com.example.testthymeleaf.dao;


import com.example.testthymeleaf.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}