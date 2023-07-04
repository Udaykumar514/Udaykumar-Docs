package com.spring.mydairy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.mydairy.entities.Entry;

public interface EntryRepository  extends JpaRepository<Entry, Long>{

}
