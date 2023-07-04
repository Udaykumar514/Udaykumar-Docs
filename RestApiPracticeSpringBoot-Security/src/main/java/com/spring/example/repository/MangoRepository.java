package com.spring.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.example.entity.Mango;

public interface MangoRepository extends JpaRepository<Mango, Long>{

}
