package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	//native Query Methods
	Optional<User> findByEmail(String email);
	Optional<User> findByUsernameOrEmail(String username , String email);
	Optional<User> findByUsername(String name);
	Boolean existsByUsername(String username);
	Boolean existsByEmail(String email);

}
