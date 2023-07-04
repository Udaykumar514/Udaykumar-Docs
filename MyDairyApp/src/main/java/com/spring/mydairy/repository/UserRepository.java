package com.spring.mydairy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.spring.mydairy.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	@Query(value ="select * from users where username=:username LIMIT 1")
	public User findByUsername(String username);

}
