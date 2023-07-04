package com.spring.mydairy.services;

import java.util.List;

import com.spring.mydairy.entities.Entry;
import com.spring.mydairy.entities.User;

public interface EntryServices {

	public void save(Entry entry);
	public void update(Entry entry);
	public void delete(Entry entry);
	public Entry findById(long id);
	public List<Entry>  findAll();
	public Entry findByUserName(String username);
}
