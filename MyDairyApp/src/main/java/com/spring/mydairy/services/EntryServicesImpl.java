package com.spring.mydairy.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.spring.mydairy.entities.Entry;

@Component
public class EntryServicesImpl implements EntryServices {

	@Autowired
	private EntryServices entryDaoInterface;
	
	@Transactional(readOnly=false)
	public void save(Entry entry) {
		entryDaoInterface.save(entry);
	}

	@Transactional(readOnly=false)
	public void update(Entry entry) {
		entryDaoInterface.update(entry);

	}

	@Transactional(readOnly=false)
	public void delete(Entry entry) {
		entryDaoInterface.delete(entry);
	}

	@Transactional(readOnly=false)
	public Entry findById(long id) {
		
		return entryDaoInterface.findById(id);
	}

	@Transactional(readOnly=false)
	public List<Entry> findAll() {
		
		return entryDaoInterface.findAll();
	}

	@Override
	public Entry findByUserName(String username) {
		
		return null;
	}

}
