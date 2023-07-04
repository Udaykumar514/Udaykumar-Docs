package com.spring.mydairy.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.spring.mydairy.entities.User;

@Component
public class UserServicesImpl implements UserServices {

	@Autowired
	private UserServices userDaoInterface;
	
	public UserServices getUserInterface() {
		return userDaoInterface;
	}

	public void setUserInterface(UserServices userInterface) {
		this.userDaoInterface = userInterface;
	}
	
	@Transactional(readOnly=false)
	public void save(User user) {
	
		userDaoInterface.save(user);
	}

	@Transactional(readOnly=false)
	public void update(User user) {
	
		userDaoInterface.update(user);
	}

	@Transactional(readOnly=false)
	public void delete(User user) {
	
		userDaoInterface.delete(user);
	}

	@Transactional(readOnly=false)
	public User findById(long id) {
		
		return userDaoInterface.findById(id);
	}

	@Transactional(readOnly=false)
	public List<User> findAll() {
		
		return userDaoInterface.findAll();
	}

	@Override
	public User findByUserName(String username) {
		
		return null;
	}



}
