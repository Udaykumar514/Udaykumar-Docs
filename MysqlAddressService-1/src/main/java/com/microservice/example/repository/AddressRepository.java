package com.microservice.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservice.example.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
