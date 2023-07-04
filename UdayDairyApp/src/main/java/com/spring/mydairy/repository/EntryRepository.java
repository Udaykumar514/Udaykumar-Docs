package com.spring.mydairy.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.spring.mydairy.entity.Entry;

public interface EntryRepository extends JpaRepository<Entry, Long>{
	
	@Query(value = "select * from entries where userid=:id", nativeQuery = true)
	public List<Entry> findByUserid(long id);

}
