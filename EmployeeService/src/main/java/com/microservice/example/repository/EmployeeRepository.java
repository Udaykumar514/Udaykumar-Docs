package com.microservice.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservice.example.entity.Employee;

public interface EmployeeRepository  extends JpaRepository<Employee, Integer>{

}
