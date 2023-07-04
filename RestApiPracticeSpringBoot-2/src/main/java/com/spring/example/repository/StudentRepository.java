package com.spring.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.example.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
