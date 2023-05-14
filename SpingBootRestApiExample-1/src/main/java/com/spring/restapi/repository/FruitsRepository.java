package com.spring.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.restapi.entity.Fruits;

@Repository
public interface FruitsRepository extends JpaRepository<Fruits, Long> {

}
